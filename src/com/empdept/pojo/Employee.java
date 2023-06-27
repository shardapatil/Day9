package com.empdept.pojo;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int empno;
	private int hours;
	private float rate;
	
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public Employee()
	{
		hours=90;
		rate=70;
	}
	
	public Employee(int empno,int hours, float rate)
	{
		this.empno = empno;
		this.hours = hours;
		this.rate = rate;
	}
	
	public Employee(int hours, float rate)
	{
		this.hours = hours;
		this.rate = rate;
	}
	
	public double getNetIncome()
	{
		return hours * rate;
	}
	
	
}
