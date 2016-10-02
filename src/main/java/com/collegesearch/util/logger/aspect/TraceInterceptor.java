package com.collegesearch.util.logger.aspect;

import org.apache.commons.logging.Log;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.CustomizableTraceInterceptor;


public class TraceInterceptor extends CustomizableTraceInterceptor {
	private static final long serialVersionUID = -5167767330467631668L;
	

	@Override
	protected void writeToLog(Log logger, String message, Throwable ex) {
		org.slf4j.Logger slf4jLogger = LoggerFactory.getLogger("aspect");
		StringBuilder stampedMessage = new StringBuilder();
	
		stampedMessage.append(message);

		slf4jLogger.trace(stampedMessage.toString(), ex);
	}
}
