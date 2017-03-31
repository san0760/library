package com.library.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Bookinfo entity. @author MyEclipse Persistence Tools
 */

public class Bookinfo implements java.io.Serializable
{

	// Fields

	private String isbn;
	private Booktypeinfo booktypeinfo;
	private String name;
	private String author;
	private String publish;
	private Float price;
	private Timestamp publishTime;
	private Set borrowinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bookinfo()
	{
	}

	/** minimal constructor */
	public Bookinfo(String isbn, Booktypeinfo booktypeinfo, String name)
	{
		this.isbn = isbn;
		this.booktypeinfo = booktypeinfo;
		this.name = name;
	}

	/** full constructor */
	public Bookinfo(String isbn, Booktypeinfo booktypeinfo, String name,
			String author, String publish, Float price, Timestamp publishTime,
			Set borrowinfos)
	{
		this.isbn = isbn;
		this.booktypeinfo = booktypeinfo;
		this.name = name;
		this.author = author;
		this.publish = publish;
		this.price = price;
		this.publishTime = publishTime;
		this.borrowinfos = borrowinfos;
	}

	// Property accessors

	public String getIsbn()
	{
		return this.isbn;
	}

	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}

	public Booktypeinfo getBooktypeinfo()
	{
		return this.booktypeinfo;
	}

	public void setBooktypeinfo(Booktypeinfo booktypeinfo)
	{
		this.booktypeinfo = booktypeinfo;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAuthor()
	{
		return this.author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getPublish()
	{
		return this.publish;
	}

	public void setPublish(String publish)
	{
		this.publish = publish;
	}

	public Float getPrice()
	{
		return this.price;
	}

	public void setPrice(Float price)
	{
		this.price = price;
	}

	public Timestamp getPublishTime()
	{
		return this.publishTime;
	}

	public void setPublishTime(Timestamp publishTime)
	{
		this.publishTime = publishTime;
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