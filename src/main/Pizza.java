package main;

public class Pizza 
{
	private String pizzaId;
	private String size;
	private String toppings;

	
	Pizza()
	{
		
	}
	Pizza(String pizzaId, String size, String toppings)
	{
		this.pizzaId = pizzaId;
		this.size = size;
		this.toppings = toppings;
	}
	public String getSize() 
	{
		return size;
	}
	public void setSize(String size) 
	{
		this.size = size;
	}
	public String getToppings() 
	{
		return toppings;
	}
	public void setToppings(String toppings) 
	{
		this.toppings = toppings;
	}
	
	public String getPizzaId() 
	{
		return pizzaId;
	}
	public void setPizzaId(String pizzaId) 
	{
		this.pizzaId = pizzaId;
	}
	
	@Override
	public String toString() 
	{
		return "ORDER DETAILS [SIZE: " + size + ", TOPPINGS: " + toppings + ", PIZZA ID: " + pizzaId + "]";
	}
	
	


}
