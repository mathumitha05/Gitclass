package org.testing;

public class Test2 {
	 
		public static void main(String[] args) {
			
			int a =20;
			long l= 564l;
			long l1= 564l;
			
			System.out.println("Integer Value " + a);
			
			System.out.println("Long Value : " +l);
			
			//Up Casting (Type Conversion)
			
		    l = a;
		    System.out.println("Upcating :" +l);
			
			//Down Casting (Type Casting)
			
			int b = (int) l1;
			
			System.out.println("DownCasting :" + b);
			
			int c =10;
			System.out.println( c);
			
		}

	

}
