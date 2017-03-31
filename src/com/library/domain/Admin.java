package com.library.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable
{

	// Fields

	private Integer adminId;
	private String name;
	private String password;
	private Set borrowinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Admin()
	{
	}

	/** minimal constructor */
	public Admin(Integer adminId, String name, String password)
	{
		this.adminId = adminId;
		this.name = name;
		this.password = password;
	}

	/** full constructor */
	public Admin(Integer adminId, String name, String password, Set borrowinfos)
	{
		this.adminId = adminId;
		this.name = name;
		this.password = password;
		this.borrowinfos = borrowinfos;
	}

	// Property accessors

	public Integer getAdminId()
	{
		return this.adminId;
	}

	public void setAdminId(Integer adminId)
	{
		this.adminId = adminId;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public Set getBorrowinfos()
	{
		return this.borrowinfos;
	}

	public void setBorrowinfos(Set borrowinfos)
	{
		this.borrowinfos = borrowinfos;
	}

}