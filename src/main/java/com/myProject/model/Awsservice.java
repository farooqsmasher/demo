package com.myProject.model;


public class Awsservice{

     private String name;
     private int serviceId;
     private String description;
	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getServiceId()
	{
		return this.serviceId;
	}

	public void setServiceId(int serviceId)
	{
		this.serviceId = serviceId;
	}

	public String getDescription()
	{
		return this.description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

   public String toString(){
       return this.name + this.description + this.serviceId;
   }


    
}