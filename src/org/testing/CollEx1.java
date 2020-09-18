package org.testing;

import java.util.ArrayList;
import java.util.List;

public class CollEx1 {
	
	public static void main(String[] args) {
		
		List li = new ArrayList();
		li.add(11);
		li.add(22);
		li.add(1234l);
		li.add(33);
		li.add(44);
		li.add("Hi");
		li.add("Hello World");
		li.add(true);
		System.out.println(li);
		
		//Generics will support After JDK 1.5 
		//support similar data type
		// Inside generics we can pass only Wrapper Class
		//Wrapper class - Class of datatype is called Wrapper class
		
		List<Integer> l2 = new ArrayList<>();
		
		//To insert a value
		
		l2.add(90);
		l2.add(80);
		l2.add(70);
		l2.add(70);
		l2.add(70);
		System.out.println(l2);
		
		int i = l2.size();
		System.out.println(i);
		
		int l = l2.lastIndexOf(70);
		System.out.println(l);
		
		int j= l2.get(3);
		System.out.println(j);
		
		boolean b = l2.contains(70);
		
		System.out.println(b);
		
		l2.add(100);
		l2.add(2, 89);
		System.out.println(l2);
		
		l2.set(3, 50);
		System.out.println(l2);
		l2.remove(4);
		System.out.println(l2);
		//l2.clear();
		//System.out.println(l2);
		
		boolean b2 =  l2.isEmpty();
		System.out.println(b2);
		
		List<Integer> l3 = new ArrayList<>();
		l3.addAll(l2);
		System.out.println(l3);
		l3.add(500);
		
		System.out.println(l3);
		l3.retainAll(l2);
		System.out.println(l3);
		l3.add(101);
		l2.add(20);
		l3.removeAll(l2);
		System.out.println(l3);
		
	
	}
	
	
}
