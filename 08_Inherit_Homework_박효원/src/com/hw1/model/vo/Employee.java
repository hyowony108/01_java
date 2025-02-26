package com.hw1.model.vo;

public class Employee extends Person{

	private int salay;
	private String dept;
	
	public Employee() {}

	public Employee(String name, int age, double height, double weight, int salay, String dept) {
		
		super(age, height, weight);
		this.name = name; // 부모 Person 에 작성된 필드 중 protected 접근제한자 name
		this.salay = salay;
		this.dept = dept;
	}
	
	@Override
	public String information() {
		return super.information() + String.format(" / 급여 : %d / 부서 : %s", salay, dept);

	}

	public int getSalay() {
		return salay;
	}

	public void setSalay(int salay) {
		this.salay = salay;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}
