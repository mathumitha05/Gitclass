package org.testing;

public class ClientString {
	
	public static void main(String[] args) {
		
		String s="Application";
		int p = s.length();
		System.out.println(p);
		
		String up = s.toUpperCase();
		System.out.println(up);
		
		String lp =s.toLowerCase();
		System.out.println(lp);
		
		//to check whether string start with same seq or not
		
		boolean b = s.startsWith("AP");
		System.out.println(b);
		
		

		//to check whether string ends with same seq or not
		
		boolean p1 = s.endsWith("ion");
		System.out.println(p1);
		
		//to check whether string contains a particular same seq or not
		
				boolean d = s.contains("cat");
				System.out.println(p1);
				
		//to find out the first index position of a letter
				
				int l1 = s.indexOf("i");
				System.out.println(l1);
				
				
//to find out the last index position of a letter
				
				int l2 = s.lastIndexOf("i");
				System.out.println(l2);
				
				
				
				int l3 =	s.indexOf("Y");
			System.out.println("Index of: "+l3);
			
			//Char
			
			char a =s.charAt(11);
			System.out.println(a);
			
			//Replace
			
	
			
		
		
	}
	

}
