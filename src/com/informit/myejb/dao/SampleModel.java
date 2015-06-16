package com.informit.myejb.dao;

public class SampleModel {
	private long id;
	private String data;
	private String name;
	public SampleModel(long id, String name, String data){
		this.id =id;
		this.name = name;
		this.data = data;
	}
	
	public long getID(){return id;}
	public String getName(){return name;}
	public String getDate(){return data;}
	
	public void setName(String name){this.name= name;}
	public void setDate(String data){this.data= data;}
	
}
