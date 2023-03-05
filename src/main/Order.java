package main;

public class Order 
{
	private Pizza pizza;
	private Customer customer;
	private String orderId;
	
	Order()
	{
		
	}
	Order(Customer customer, Pizza pizza, String orderId)
	{
		this.customer = customer;
		this.pizza = pizza;
		this.orderId = orderId;
	}
	
	public String getorderId() 
	{
		return orderId;
	}
	public void setId(String orderId) 
	{
		this.orderId = orderId;
	}
	public Pizza getPizza() 
	{
		return pizza;
	}
	public void setPizza(Pizza pizza) 
	{
		this.pizza = pizza;
	}
	public Customer getCustomer() 
	{
		return customer;
	}
	public void setCustomer(Customer customer) 
	{
		this.customer = customer;
	}
	
	@Override
	public String toString() {
		return "ORDER ID: " + orderId + "\n" + pizza.toString() + "\n" + customer.toString();
	}
	
	
}
