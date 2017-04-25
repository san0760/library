package com.library.basic;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public abstract class BasicService implements BasicServiceInter
{
	private SessionFactory sessionfsFactory;
	public void setSessionfsFactory(SessionFactory sessionfsFactory)
	{
		this.sessionfsFactory = sessionfsFactory;
	}
	public List excuteQuery(String hql,Object []parameters){
		Query query=sessionfsFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null&&parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}
		}
		return query.list();
	}
	public Object findById(Class clazz,Serializable id){
		return sessionfsFactory.getCurrentSession().get(clazz, id);
	}
	
	public Object uniqueQuery(String hql, Object[] parameters)
	{
		// TODO Auto-generated method stub
		Query query=sessionfsFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null&&parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}
		}
		return query.uniqueResult();
	}
	public void excuteUpdate(String hql, Object[] parameters)
	{
		// TODO Auto-generated method stub
		Query query=sessionfsFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null&&parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}
		}
		query.executeUpdate();
	}
	public void excuteSQLUpdate(String hql,Object []parameters){
		Query query=sessionfsFactory.getCurrentSession().createSQLQuery(hql);
		if(parameters!=null&&parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}
		}
		query.executeUpdate();
	}
	@Override
	public List excuteSQLQuery(String hql, Object[] parameters)
	{
		// TODO Auto-generated method stub
		Query query=sessionfsFactory.getCurrentSession().createSQLQuery(hql);
		if(parameters!=null&&parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}
		}
		return query.list();
	}
	@Override
	public List findBlur(String hql, String word)
	{
		// TODO Auto-generated method stub
		Query query=sessionfsFactory.getCurrentSession().createQuery(hql);
		query.setString("name", "%"+word+"%");
		return query.list();
	}
}
