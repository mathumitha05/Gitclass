package org.testing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Employee {
	public static void main(String[] args) {
		Set<Integer> ex = new TreeSet<Integer>();
		ex.add(10);
		ex.add(20);
		ex.add(5);
		ex.add(10);
		ex.add(30);
		ex.add(40);
		ex.add(50);
		ex.add(50);
		ex.add(60);
		ex.add(50);
		
		System.out.println(ex);
		System.out.println(ex.size());
		}

}
