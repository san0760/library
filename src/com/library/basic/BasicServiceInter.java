package com.library.basic;

import java.io.Serializable;
import java.util.List;

public interface BasicServiceInter
{
	public List excuteQuery(String hql,Object []parameters);
	public Object findById(Class clazz, Serializable id);
}
