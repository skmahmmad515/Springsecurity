package com.telusuko.springsecurity;

public class Student {

	public Student(Integer number, String name, Double marks) {
		super();
		this.number = number;
		this.name = name;
		this.marks = marks;
	}

	Integer number;
	String name;
	Double marks;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", marks=" + marks + ", getNumber()=" + getNumber()
				+ ", getName()=" + getName() + ", getMarks()=" + getMarks() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
