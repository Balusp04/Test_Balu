package com.accenture.practice;

import java.util.List;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"john","Developer","aaa",40);
		Employee e2=new Employee(2,"jack","Manager","bbb",30);
		Employee e3=new Employee(3,"mathew","Tester","ccc",10);
		Employee e4=new Employee(4,"sam","team Lead","ddd",50);
		
		
		
		List<Employee> li=new LinkedList<Employee>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		
		li.forEach((x)->System.out.println(x));
		
	}

}
