package com.library.domain;

import java.sql.Timestamp;

/**
 * Borrowinfo entity. @author MyEclipse Persistence Tools
 */

public class Borrowinfo implements java.io.Serializable
{

	// Fields

	private Integer opId;
	private Bookinfo bookinfo;
	private Admin admin;
	private Student student;
	private Integer isReturn;
	private Timestamp outTime;
	private Timestamp returnTime;
	private Integer conNum;

	// Constructors

	/** default constructor */
	public Borrowinfo()
	{
	}

	/** minimal constructor */
	public Borrowinfo(Integer opId, Bookinfo bookinfo)
	{
		this.opId = opId;
		this.bookinfo = bookinfo;
	}

	/** full constructor */
	public Borrowinfo(Integer opId, Bookinfo bookinfo, Admin admin,
			Student student, Integer isReturn, Timestamp outTime,
			Timestamp returnTime)
	{
		this.opId = opId;
		this.bookinfo = bookinfo;
		this.admin = admin;
		this.student = student;
		this.isReturn = isReturn;
		this.outTime = outTime;
		this.returnTime = returnTime;
	}

	// Property accessors

	public Integer getOpId()
	{
		return this.opId;
	}

	public void setOpId(Integer opId)
	{
		this.opId = opId;
	}

	public Bookinfo getBookinfo()
	{
		return this.bookinfo;
	}

	public void setBookinfo(Bookinfo bookinfo)
	{
		this.bookinfo = bookinfo;
	}

	public Admin getAdmin()
	{
		return this.admin;
	}

	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}

	public Student getStudent()
	{
		return this.student;
	}

	public void setStudent(Student student)
	{
		this.student = student;
	}

	public Integer getIsReturn()
	{
		return this.isReturn;
	}

	public void setIsReturn(Integer isReturn)
	{
		this.isReturn = isReturn;
	}

	public Timestamp getOutTime()
	{
		return this.outTime;
	}

	public void setOutTime(Timestamp outTime)
	{
		this.outTime = outTime;
	}

	public Timestamp getReturnTime()
	{
		return this.returnTime;
	}

	public void setReturnTime(Timestamp returnTime)
	{
		this.returnTime = returnTime;
	}

	public Integer getConNum()
	{
		return conNum;
	}

	public void setConNum(Integer conNum)
	{
		this.conNum = conNum;
	}
	
}