package com.collegesearch.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;


public class GenericDaoImpl<T, PK extends Serializable> implements GenericDao<T, PK> {
	private Class<T> type;
	
	@Autowired
	protected SessionFactory sessionFactory;
		
	@SuppressWarnings("unchecked")
	public GenericDaoImpl(){
		this.type = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	//@Transactional
	@SuppressWarnings("unchecked")
	public PK save(T newInstance) {
		return (PK)currentSession().save(newInstance);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public T findById(final PK id) {
		return (T)currentSession().get(type, id);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public T findById(final PK id, Session session) {
		return (T)session.get(type, id);
	}
	 
	@Override
	@SuppressWarnings("unchecked")
	public Collection<T> findAll(){
		Criteria criteria = currentSession().createCriteria(type);
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return criteria.list();
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<T> findAll(SimpleExpression simpleExpression){
		Criteria criteria = currentSession().createCriteria(type);
		if(simpleExpression != null)
		   criteria.add(simpleExpression);
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return criteria.list();
	}
	 
	@Override
	public synchronized void update(final T transientObject) {
		try{
           Session session = currentSession();
          // if(session.contains(transientObject))
        	//  session.update(transientObject);
          session.saveOrUpdate(transientObject);
           //else
        	// session.merge(transientObject);
		}
		catch(DataException e){
			throw e;
		}		   
   	}
	
	@Override
	@SuppressWarnings("unchecked")
	public synchronized void update(Session session, final Integer id, final T transientObject) {
		try{
           T t = (T)session.load(type, id);
           if(t == null)
        	  throw new HibernateException("No DB object found for the given Id " + id);  
           session.update(transientObject);  
		}
		catch(HibernateException e){
			throw e;
		}		   
   	}
		
	@Override
	public void delete(T persistentObject) {
		
	}
	
	@Override
	@SuppressWarnings("unchecked")
    public List<T> findByParameter(final String parameterName, String value){
		if(value != null && value.length() > 0)
		   value = value.toUpperCase();
	  	Criteria criteria = currentSession().createCriteria(type);
	  	criteria.setReadOnly(true);
	  	criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		criteria.add(Restrictions.eq(parameterName, value).ignoreCase());
		return (List<T>)criteria.list();			
	}
	
	@Override
	@SuppressWarnings("unchecked")
    public List<T> findByParameter(final String parameterName, String value, Session session){
		if(value != null && value.length() > 0)
		   value = value.toUpperCase();
	  	Criteria criteria = session.createCriteria(type);
	  	criteria.setReadOnly(true);
	  	criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		criteria.add(Restrictions.eq(parameterName, value).ignoreCase());
		return (List<T>)criteria.list();			
	}
		
	@Override
	@SuppressWarnings("unchecked")
    public List<T> findByParameter(final String parameterName, Long value){
	  	Criteria criteria = currentSession().createCriteria(type);
	  	criteria.setReadOnly(true);
	  	criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		criteria.add(Restrictions.eq(parameterName, value));
		return (List<T>)criteria.list();			
	}
	
	@Override
	@SuppressWarnings("unchecked")
    public List<T> findByParameter(final String parameterName, Integer value){
	  	Criteria criteria = currentSession().createCriteria(type);
	  	criteria.setReadOnly(true);
	  	criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		criteria.add(Restrictions.eq(parameterName, value));
		return (List<T>)criteria.list();			
	}
	
	@Override
	@SuppressWarnings("unchecked")
    public List<T> findByParameter(final String parameterName, Integer value, Session session){
	  	Criteria criteria = session.createCriteria(type);
	  	criteria.setReadOnly(true);
	  	criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		criteria.add(Restrictions.eq(parameterName, value));
		return (List<T>)criteria.list();			
	}
	
	//@Loggable(value=LogLevel.DEBUG)
	@Override
	@SuppressWarnings("unchecked")
    //public List<T> findByParameters(MultivaluedMap<String, String> queryParams){
	public List<T> findByParameters(LinkedHashMap<String, String> queryParams){
		if(queryParams == null) 
		   return null;
		
		Set<Map.Entry<String, String>> set = queryParams.entrySet();
	    Iterator it = set.iterator();
	    Criteria criteria = currentSession().createCriteria(type);
	  	criteria.setReadOnly(true);
	  	criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
   	   	String key, value = null;
	  	while(it.hasNext()) {
   	    	Entry<String, List<String>> entry = (Entry<String, List<String>>)it.next();
   		   	key = (String)entry.getKey();
   	    	value = ((List<String>)entry.getValue()).get(0);
   	   		//criteria.add(Restrictions.eq("activityStatus", "")); //return only active accounts
   	   		criteria.add(Restrictions.eq(key, value).ignoreCase());
   	    }	  	
		return (List<T>)criteria.list();			
	}
	
	/************ Util Methods ************/
		
	protected synchronized Session currentSession() {
	    Session session = null;
		try{
			session = sessionFactory.getCurrentSession();
	    }
		catch(Exception e) {
		}
		return session;
	}
	
	protected synchronized Session openSession() {
	    Session session = null;
		try{
	    	session = sessionFactory.openSession();
	    }
		catch(Exception e) {
		}
		return session;
	}
	
	public synchronized Session getSession(){
		Session session = sessionFactory.getCurrentSession();
		if (session == null)
		   session = sessionFactory.openSession();
	    return session;
    }
}