package com.scp.collection;

import java.util.Comparator;

public class EmployeeComparable implements Comparable<EmployeeComparable> {
	private int id;
	private String name;
	private int age;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public EmployeeComparable(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(EmployeeComparable o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	
}
