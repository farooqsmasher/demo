package com.myProject.model;



public class Employee{

          
    private String name;
    private int id;
    private int age;
    private double salary;
    private String address;
    private long contact_no;
	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getAge()
	{
		return this.age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public double getSalary()
	{
		return this.salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public String getAddress()
	{
		return this.address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public long getContact_no()
	{
		return this.contact_no;
	}

	public void setContact_no(long contact_no)
	{
		this.contact_no = contact_no;
	}

}