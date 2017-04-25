package com.library.basic;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;
public interface BasicServiceInter
{
	public List excuteQuery(String hql,Object []parameters);
	public Object findById(Class clazz, Serializable id);
	public Object uniqueQuery(String hql, Object[] parameters);
	public void excuteUpdate(String hql, Object[] parameters);
	public void excuteSQLUpdate(String hql,Object []parameters);
	public List excuteSQLQuery(String hql,Object []parameters);
	public List findBlur(String hql,String word);
}
