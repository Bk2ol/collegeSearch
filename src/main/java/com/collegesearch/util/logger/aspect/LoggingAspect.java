package com.collegesearch.util.logger.aspect;

import java.text.MessageFormat;
import java.util.List;
import java.util.Stack;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.ArrayUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.collegesearch.domain.school.School;


@Component
@Aspect
public class LoggingAspect {
	private static final String BEFORE_STRING = "{0}<{1}>";
	private static final String BEFORE_WITH_PARAMS_STRING = "{0}<{1}> params {2}";
	private static final String AFTER_THROWING = "{0}<{1}> EXCEPTION \"{2}\" with params ({3})";
	private static final String AFTER_THROWING_NO_PARAMS = "{0}<{1}> EXCEPTION \"{2}\"";
	private static final String AFTER_RETURNING = "{0}<{1}> returned {2} in {3}ms";
	private static final String AFTER_RETURNING_VOID = "{0}<{1}> returned in {2}ms";
	private static final String ARG_PATTERN = "<{0}({1})>";
	private static final String ARG_PATTERN_SINGLE = "<{0}>";
	private static final String ARG_PATTERN_DOUBLE = "<{0}:{1}>";

	private long start;

	private long elapsedTime;
	private StartTimeStack startTimeStack = new StartTimeStack();

	@Resource
	private Slf4jLogger logger;
	//@Autowired
	//private LoggingHelper loggingHelper;

	/**
	 * This class is used to store the start times of nested method calls. These values are used to calculate the total
	 * time it took to process the method.
	 * 
	 * @author
	 * 
	 */
	private class StartTimeStack extends Stack<Long> {
		private static final long serialVersionUID = 1L;

		public boolean add(Long time) {
			return super.add(time);
		}

		public Long pop() {
			Long lastTime = super.pop();
			if (lastTime == null) {
				return new Long(0);
			} else {
				return lastTime;
			}
		}
	}

	@Before(value = "@annotation(trace)", argNames = "joinPoint, trace")
	public void before(JoinPoint joinPoint, Loggable loggable) {
		start = System.currentTimeMillis();
		startTimeStack.add(start);

		Class<? extends Object> clazz = joinPoint.getTarget().getClass();
		String methodName = joinPoint.getSignature().getName();

		if (ArrayUtils.isEmpty(joinPoint.getArgs())) {
			logger.log(loggable.value(), clazz, null, BEFORE_STRING, ""/*loggingHelper.getUserStamp()*/, methodName, constructArgString(clazz, joinPoint.getArgs()));
		} else {
			logger.log(loggable.value(), clazz, null, BEFORE_WITH_PARAMS_STRING, ""/*loggingHelper.getUserStamp()*/, methodName,
					constructArgString(clazz, joinPoint.getArgs()));
		}
	}

	@AfterThrowing(value = "@annotation(Loggable)", throwing = "throwable", argNames = "joinPoint, throwable")
	public void afterThrowing(JoinPoint joinPoint, Throwable throwable) {
		Class<? extends Object> clazz = joinPoint.getTarget().getClass();
		String name = joinPoint.getSignature().getName();
		// logger.log(LogLevel.ERROR, clazz, throwable, AFTER_THROWING,
		// loggingHelper.getUserStamp(), name, throwable
		// .getMessage(), constructArgString(clazz, joinPoint.getArgs()));
		logger.log(LogLevel.ERROR, clazz, throwable, AFTER_THROWING_NO_PARAMS, ""/*loggingHelper.getUserStamp()*/, name, throwable.getMessage());
	}

	@AfterReturning(value = "@annotation(trace)", returning = "returnValue", argNames = "joinPoint, trace, returnValue")
	public void afterReturning(JoinPoint joinPoint, Loggable loggable, Object returnValue) {
		elapsedTime = System.currentTimeMillis() - startTimeStack.pop();
		Class<? extends Object> clazz = joinPoint.getTarget().getClass();
		String name = joinPoint.getSignature().getName();

		if (joinPoint.getSignature() instanceof MethodSignature) {
			MethodSignature signature = (MethodSignature) joinPoint.getSignature();
			Class<?> returnType = signature.getReturnType();
			if (returnType.getName().compareTo("void") == 0) {
				logger.log(loggable.value(), clazz, null, AFTER_RETURNING_VOID, ""/*loggingHelper.getUserStamp()*/, name, elapsedTime);
				start = 0;
				elapsedTime = 0;
				return;
			}
		}
		logger.log(loggable.value(), clazz, null, AFTER_RETURNING, ""/*loggingHelper.getUserStamp()*/, name, constructArgString(clazz, returnValue), elapsedTime);
		start = 0;
		elapsedTime = 0;
	}

	private String formatArg(
			Object... args) {
		if (args.length == 1) {
			return format(ARG_PATTERN_SINGLE, args);
		} else if (args.length == 2) {
			return format(ARG_PATTERN_DOUBLE, args);
		} else {
			return format(ARG_PATTERN, args);
		}
	}

	private String format(String pattern, Object... args) {
		return MessageFormat.format(pattern, args);
	}

	private String constructArgString(Class<?> clazz, Object... args) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < args.length; i++) {
			buffer.append(constructArg(args[i]));
			if (i != args.length - 1) {
				buffer.append(", ");
			}
		}
		return buffer.toString();
	}

	private String constructArg(List<Object> args) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < args.size(); i++) {
			buffer.append(constructArg(args.get(i)));
			if (i != args.size() - 1) {
				buffer.append(", ");
			}
		}
		return buffer.toString();
	}

	@SuppressWarnings("unchecked")
	@Deprecated
	private String constructArg(Object arg) {
		StringBuffer buffer = new StringBuffer();
		Object clazz = null;
		String id = null;
		Object descriptor = null;

		if (arg == null) {
			clazz = null;
			id = null;
			descriptor = null;
		} else if (arg instanceof java.lang.String) {
			String string = (String) arg;
			id = "String";
			descriptor = string;
			clazz = string.getClass().getSimpleName();
		} else if (arg instanceof School) {
			School school = (School) arg;
			clazz = school.getClass().getSimpleName();
			id = school.getName();
			descriptor = school.getName();
		} else if (arg instanceof HttpServletRequest || arg instanceof HttpServletResponse) {
			return buffer.toString();
		} else {
			clazz = arg.getClass().getSimpleName();
			id = "unknown";
			descriptor = arg;
		}

		if (arg instanceof java.util.Collection) {
			buffer.append(constructArg((List<Object>) arg));
		} else if (id != null && id.equals("unknown")) {
			buffer.append(formatArg(clazz, arg));
		} else {
			buffer.append(formatArg(id, descriptor));
		}
		return buffer.toString();
	}
	
}