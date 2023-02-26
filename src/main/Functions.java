package main;

import java.util.ArrayList;

public class Functions 
{
	ArrayList<Order> orders = new ArrayList<Order>();
	ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public void createCustomer(String name, String address, String custId)
	{
		customers.add(new Customer(name, address, custId));
	}
	
	public void makePizza(String pizzaId, String size, String toppings)
	{
		pizzas.add(new Pizza(pizzaId, size, toppings));
		
	}
	
	public void createOrder(String custId, String size, String toppings, String pizzaId, String orderId)
	{
		makePizza(pizzaId, size, toppings);
		Customer chosen = getCustomer(custId);
		Pizza pick = getPizza(pizzaId);
		
		orders.add(new Order(chosen, pick, orderId));
	}
	
	public Customer getCustomer(String custId)
	{
		for(Customer customer: customers)
		{
			if(customer.getcustId().equals(custId))
			{
				return customer;
			}
			
		}
		return null;
	}
	
	public Pizza getPizza(String pizzaId)
	{
		for (Pizza pizza: pizzas)
		{
			if(pizza.getPizzaId().equals(pizzaId))
			{
				return pizza;
			}
		}
		return null;
	}
	
	public void showAllCustomer() 
	{
		for(Customer customer: customers)
		{
			System.out.println(customer.toString());
		}
	}
	
	public void showAllOrder()
	{
		for(Order order: orders)
		{
			System.out.println(order.toString());
		}
	}
	
	public void findCustomer(String custId)
	{
		for(Customer customer: customers)
		{
			if(customer.getcustId().equals(custId))
			{
				System.out.println(customer.toString());
			}
		}
	}
	
	public void findOrder(String orderId)
	{
		for (Order order: orders)
		{
			if(order.getorderId().equals(orderId))
			{
				System.out.println(order.toString());
			}
				
		}
	}
	
	public void findCustomerOrders(String custId)
	{
		for (Order order: orders)
		{
			if(order.getCustomer().getcustId().equals(custId))
			{
				System.out.println(order.toString());
			}
		}
	}
	
	
}
