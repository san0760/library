package com.library.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Booktypeinfo entity. @author MyEclipse Persistence Tools
 */

public class Booktypeinfo implements java.io.Serializable
{

	// Fields

	private Integer type;
	private String typeName;
	private Integer outDay;
	private String outCrime;
	private Set bookinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Booktypeinfo()
	{
	}

	/** minimal constructor */
	public Booktypeinfo(Integer type, String typeName)
	{
		this.type = type;
		this.typeName = typeName;
	}

	/** full constructor */
	public Booktypeinfo(Integer type, String typeName, Integer outDay,
			String outCrime, Set bookinfos)
	{
		this.type = type;
		this.typeName = typeName;
		this.outDay = outDay;
		this.outCrime = outCrime;
		this.bookinfos = bookinfos;
	}

	// Property accessors

	public Integer getType()
	{
		return this.type;
	}

	public void setType(Integer type)
	{
		this.type = type;
	}

	public String getTypeName()
	{
		return this.typeName;
	}

	public void setTypeName(String typeName)
	{
		this.typeName = typeName;
	}

	public Integer getOutDay()
	{
		return this.outDay;
	}

	public void setOutDay(Integer outDay)
	{
		this.outDay = outDay;
	}

	public String getOutCrime()
	{
		return this.outCrime;
	}

	public void setOutCrime(String outCrime)
	{
		this.outCrime = outCrime;
	}

	public Set getBookinfos()
	{
		return this.bookinfos;
	}

	public void setBookinfos(Set bookinfos)
	{
		this.bookinfos = bookinfos;
	}

}