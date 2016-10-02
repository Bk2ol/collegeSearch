package com.collegesearch.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.SimpleExpression;

public interface GenericDao <T, PK extends Serializable>{
	T findById(PK id);
	T findById(PK id, Session session);
	Collection<T> findAll();
	List<T> findAll(SimpleExpression simpleExpression);
	List<T> findByParameter(String parameterName, String value);
	List<T> findByParameter(String parameterName, String value, Session session);
	List<T> findByParameter(String parameterName, Long value);
	List<T> findByParameter(String parameterName, Integer value);
	List<T> findByParameter(String parameterName, Integer value, Session session);
	//List<T> findByParameter(String parameterName, String value, RestrictionOperation op);
	//List<T> findByParameterPattern(String parameterName, String value, PatternMatchMode matchMode);
	//List<T> findByParameters(MultivaluedMap<String, String> queryParams);
	List<T> findByParameters(LinkedHashMap<String, String> queryParams);
	
	PK save(T newInstance);
	void update(T transientObject);
	public void update(Session session, final Integer id, final T transientObject);
	void delete(T persistentObject);

}