package main;

import java.util.Scanner;

public class Main 
{
	
	public static void main(String [] args) 
	{
		Scanner scan = new Scanner(System.in);
		Functions function = new Functions();
		
		System.out.println("[A]Create customer\n[B]Create order\n[C]Show all customers\n[D]Show all orders\n[E]Find customer\n[F]Find order\n[G]Find Orders by Customer\n[H]Remove order\n[I]Remove customer");
		
		while(scan.hasNext())
		{
			String action = scan.nextLine();
			
			if(action.equalsIgnoreCase("A"))
			{
				System.out.println("Enter name: ");
				String name = scan.nextLine();
				System.out.println("Enter address: ");
				String address = scan.nextLine();
				System.out.println("Enter id: ");
				String id = scan.nextLine();
				function.createCustomer(name, address, id);
			}
			if(action.equalsIgnoreCase("B")) 
			{
				System.out.println("Enter customer ID: ");
				String custid = scan.nextLine();
				System.out.println("Enter size: ");
				String size = scan.nextLine();
				System.out.println("Enter toppings: ");
				String toppings = scan.nextLine();
				System.out.println("Enter pizza ID: ");
				String pizzaid = scan.nextLine();
				System.out.println("Enter order ID: ");
				String orderid = scan.nextLine();
				
				function.createOrder(custid, size, toppings, pizzaid, orderid);
			}
			if(action.equalsIgnoreCase("C"))
			{
				System.out.println("ALL CUSTOMERS:");
				function.showAllCustomer();
			}
			if(action.equalsIgnoreCase("D"))
			{
				System.out.println("ALL ORDERS:");
				function.showAllOrder();
			}
			if (action.equalsIgnoreCase("E"))
			{
				System.out.println("Enter customer ID: ");
				String find = scan.next();
				function.findCustomer(find);
			}
			if (action.equalsIgnoreCase("F"))
			{
				System.out.println("Find order by ID: ");
				String find = scan.next();
				function.findOrder(find);
			}
			if (action.equalsIgnoreCase("G"))
			{
				System.out.println("Find orders by customer ID: ");
				String find = scan.next();
				function.findCustomerOrders(find);
				
			}
			if (action.equalsIgnoreCase("H"))
			{
				System.out.println("Enter order ID to remove order: ");
				String remove = scan.next();
				function.removeOrder(remove);
			}
			if (action.equalsIgnoreCase("I"))
			{
				System.out.println("Enter customer ID to remove customer: ");
				String remove = scan.next();
				function.removeCustomer(remove);
			}
			
		}
	}
}
/*
 * 1. add a class customer
 * 2. add customer id to the order or the "add" function
 * 3. create new functions such as, printOrderOfCustomer , searchCustomer,  searchOrder
 * 
 */
