package com.javaex.problem02;

public class Depart extends Employee {

	private String name;
	private int salary;
	private String department;

	// 코드작성
	public Depart() {
	}

	public Depart(String name, int salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public void getInformation() {
		System.out.println("이름:" + name + " 연봉:" + salary + " 부서:" + department);
	}

}
