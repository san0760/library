package com.library.basic;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

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
}
