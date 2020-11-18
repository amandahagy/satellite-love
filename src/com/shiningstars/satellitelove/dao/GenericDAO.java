package com.shiningstars.satellitelove.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;

public abstract class GenericDAO<T,K> {

	protected EntityManager em;
	
	private Class<T> clazz;
	
	@SuppressWarnings("all")
	public GenericDAO(EntityManager em) {
		this.em = em;
		clazz = (Class<T>) ((ParameterizedType) getClass()
			.getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public void register(T entity) {
		em.persist(entity);
	}

	public void update(T entity) {
		em.merge(entity);
	}

	public void remove(K id) throws Exception {
		T entity = search(id);
		if (entity == null){
			throw new Exception("Id is invalid");
		}
		em.remove(entity);
	}
	
	public List<T> list(){
		return em.createQuery("from " + clazz.getName(), clazz).getResultList();
	}

	public T search(K id) {
		return em.find(clazz,id);
	}

	public void commit() throws Exception {
		try{
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch(Exception e){
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			e.printStackTrace();
			throw new Exception("Error while commiting");
		}
	}
		
}