package org.testing;

class sss{
	 public static void main(String args[]){
		 String s1="MR.";
		 String s2="Sachin";
		 String s3="ramesh";
		 String s4="Tendulakar";
		 
		 String s5="saa";
		 String s6="tachin";
		 String s7=s2.intern();
		 System.out.println(s6.compareTo(s5));
		 
		 String name = s1.concat(s2).concat(s3).concat(s4); 
	  // s.concat(" Tendulkar");//concat() method appends the string at the end
	   System.out.println(name);//will print Sachin because strings are immutable objects
	 }
	}