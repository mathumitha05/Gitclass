package org.testing;



/*Array used to store multiple values of similar datatypes in a single variable
 * index based
 * Datatype[] variable = new Datatype[size];
 * 
 * sizs of array fixed aat compile time (static)
 * 
 */

public class Examplearr {

	public static void main(String args[]) {
		
		

		int[] a = new int[5];

		a[0] = 10;
		a[1] = 20;
		a[2] = 40;
		a[3] = 50;
		
		System.out.println("Get the 3rd position of the array" + a[3]);
		
		//To find the length of the ARRAY
		
		int len = a.length;
		System.out.println("lENGTH Of The Array:: " + len);
		
		//For loop
		
		System.out.println("Using For Loop");
		
		for (int i = 0; i < a.length; i++) 
		{
		  
			System.out.println( a[i]);
		}
		
		//Using For Each
		
		System.out.println("Using For Each");
		
		for (int i : a) {
			
			System.out.println(i);
			
		}

	}
}
