package com.scp.collection;

import java.util.Comparator;

public class Namesort implements Comparator<EmployeeComparable>{

	@Override
	public int compare(EmployeeComparable o1, EmployeeComparable o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
