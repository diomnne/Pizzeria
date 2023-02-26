package main;

public class Customer 
{
	private String name;
	private String address;
	private String custId;
	
	Customer()
	{
		
	}
	Customer(String name, String address, String custId)
	{
		this.name = name;
		this.address = address;
		this.custId = custId;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public String getcustId() 
	{
		return custId;
	}
	public void setId(String custId) 
	{
		this.custId = custId;
	}
	
	@Override
	public String toString() {
		return "CUSTOMER DETAILS [NAME: " + name + ", ADDRESS: " + address + ", CUSTOMER ID: " + custId + "]";
	}
	
	
}
