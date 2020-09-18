package org.testing;

/*
 * It's predefined class used to get input from the user at runtime
 * 
 * Syntax- Scanner refname = new Scanner(system.in)
 * 
 * .in-->used to display what we enter in keyword
 */

import java.util.Scanner;

public class ClientScan {

	public static void main(String[] args)

	{

		Scanner scann = new Scanner(System.in);
		System.out.println("Enter your Order ID");
		int orderid = scann.nextInt();
		System.out.println("Enter your Order Name");
		String name = scann.next();
		System.out.println("Purchase Amount");
		Double pamt = scann.nextDouble();
		System.out.println("-------------------------");
		System.out.println("Order Id :: " + orderid);
		System.out.println("Name :: " + name);
		System.out.println("Purchase Amt ::" + pamt);
	}
	

}
