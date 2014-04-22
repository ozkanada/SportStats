package com.javateam.sportstats.core;
 
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction; 

import java.io.Serializable;
import java.util.List;

public class BaseRepository<E> {
	private Session session;
	private Class<E> entityClass;
	private final static String SELECT="select %s from %s as %s";
	private final static String SELECTBYID="select %s from %s as %s where %s.typeId=:id";

	public BaseRepository(Class<E> entityClass) {	
		session=HibernameUtil.getSession(); 
		this.entityClass=entityClass;
	}
	public void persist(E e){
		Transaction txn=session.beginTransaction();
		session.persist(e);
		txn.commit();		
	}
	
	public void merge(E e){
		Transaction txn=session.beginTransaction();
		session.merge(e);
		txn.commit();
	}
	
	public void remove(Long key){
		Transaction txn=session.beginTransaction();
		session.delete(find(key));
		txn.commit();		
	}
	
	@SuppressWarnings("unchecked")
	public E find(Long key){
		String name=entityClass.getSimpleName();
		String alias=entityClass.getSimpleName().toLowerCase();
		String queryStr=String.format(SELECTBYID, alias,name,alias,alias);
		Query query = session.createQuery(queryStr);
		query.setParameter("id", key);
		return (E)query.list().get(0);				
	}
	
	@SuppressWarnings("unchecked")
	public List<E> List(){
		String name=entityClass.getSimpleName();
		String alias=entityClass.getSimpleName().toLowerCase();
		String query=String.format(SELECT, alias,name,alias); 
		return session.createQuery(query).list();				
	}
	
	public void close(){
		session.close();
	}
}
