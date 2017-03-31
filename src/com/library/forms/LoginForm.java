package com.library.forms;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm
{
	private int id;
	private String password;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
}
