package com.scp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClass {
	public static void main(String[] args) {
		EmployeeComparable e1 = new EmployeeComparable(21,"lbc",30);
		EmployeeComparable e2 = new EmployeeComparable(31,"xyz",20);
		EmployeeComparable e3 = new EmployeeComparable(26,"pqr",36);
		EmployeeComparable e4 = new EmployeeComparable(11,"lmn",25);
		
		List<EmployeeComparable> emp = new ArrayList<EmployeeComparable>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		System.out.println(emp);
		System.out.println("Sorted By Comparable Name");
		Collections.sort(emp);
		System.out.println(emp);
		System.out.println("Sorted By Comparator Name");
		Collections.sort(emp, new Namesort());
		System.out.println(emp);
		System.out.println("Sorted By Comparator Id");
		Collections.sort(emp, new IdSort());
		System.out.println(emp);
	}

}
