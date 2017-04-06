package com.library.forms;

import org.apache.struts.action.ActionForm;

public class EditForm extends ActionForm
{
	private String psw2;
	private String email;
	public String getPsw2()
	{
		return psw2;
	}
	public void setPsw2(String psw2)
	{
		this.psw2 = psw2;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
}
