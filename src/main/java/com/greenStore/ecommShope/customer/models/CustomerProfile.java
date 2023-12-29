package com.greenStore.ecommShope.customer.models;


//@Data
public class CustomerProfile {
	
	private String id;
	private String name;
	
	
	public CustomerProfile() {
		
	}


	public CustomerProfile(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "CustomerProfile [id=" + id + ", name=" + name + "]";
	}
	
	

}
