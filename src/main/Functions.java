package main;

import java.util.ArrayList;
import java.util.Iterator;

public class Functions 
{
	ArrayList<Order> orders = new ArrayList<Order>();
	ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	ArrayList<Customer> customers = new ArrayList<Customer>();
	int custIdCtr=100;
	int pizzaIdCtr=500;
	int orderIdCtr=1000;
	
	public void createCustomer(String name, String address)
	{
		customers.add(new Customer(name, address, autoCustId()));
		System.out.println(customers.get(customers.size()-1));
	}
	
	public String autoCustId()
	{
		custIdCtr++;
		return custIdCtr + "";
	}
	
	public void makePizza(String size, String toppings, String pizzaId)
	{
		pizzas.add(new Pizza(size, toppings, pizzaId));
		
	}
	
	public String autoPizzaId()
	{
		pizzaIdCtr++;
		return pizzaIdCtr + "";
	}
	
	
	public void createOrder(String custId, String size, String toppings)
	{
		makePizza(size, toppings, autoPizzaId());
		Customer chosen = getCustomer(custId);
		Pizza pick = getPizza(pizzas.get(pizzas.size()-1).getPizzaId());
		
		orders.add(new Order(chosen, pick, autoOrderId()));
		System.out.println(orders.get(orders.size()-1));
	}
	
	public String autoOrderId()
	{
		orderIdCtr++;
		return orderIdCtr + "";
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
	
	public void showAllCustomer() 
	{
		for(Customer customer: customers)
		{
			System.out.println(customer.toString());
		}
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
	
	public void removeOrder(String orderId)
	{
		Iterator itr = orders.iterator();
		while (itr.hasNext())
		{
			Order order = (Order)itr.next();
			if (order.getorderId().equals(orderId))
			{
				itr.remove();
			}
		}
	}

	public void removeCustomer(String custId)
	{
		Iterator itr = customers.iterator();
		while (itr.hasNext())
		{
			Customer customer = (Customer)itr.next();
			if (customer.getcustId().equals(custId))
			{
				itr.remove();
			}
		}
	}
	
}
