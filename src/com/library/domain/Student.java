package com.library.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable
{

	// Fields

	private Integer studentId;
	private String name;
	private String password;
	private String sex;
	private String school;
	private String classId;
	private Set borrowinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student()
	{
	}

	/** minimal constructor */
	public Student(Integer studentId, String name, String password)
	{
		this.studentId = studentId;
		this.name = name;
		this.password = password;
	}

	/** full constructor */
	public Student(Integer studentId, String name, String password, String sex,
			String school, String classId, Set borrowinfos)
	{
		this.studentId = studentId;
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.school = school;
		this.classId = classId;
		this.borrowinfos = borrowinfos;
	}

	// Property accessors

	public Integer getStudentId()
	{
		return this.studentId;
	}

	public void setStudentId(Integer studentId)
	{
		this.studentId = studentId;
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

	public String getSex()
	{
		return this.sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}

	public String getSchool()
	{
		return this.school;
	}

	public void setSchool(String school)
	{
		this.school = school;
	}

	public String getClassId()
	{
		return this.classId;
	}

	public void setClassId(String classId)
	{
		this.classId = classId;
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