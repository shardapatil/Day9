package com.empdept.pojo;

import java.util.ArrayList;
import java.util.List;

public class Department{

	private int deptId;
	private String deptName;
	
	List<Employee> employees = new ArrayList<>();
	
	public void hireEmployees(Employee emp)
	{
		employees.add(emp);
	}
	
	public void fireEmployees(int empno)
	{
		//List<Employee> lstEmp = new ArrayList<>();
		
		//employees.contains(empno);
		//employees.remove(e -> e=empno,employees);
		
		for (Employee emp : employees) {
			if(emp.getEmpno() == empno)
			{
				employees.remove(emp);
				break;
			}
		}
	}
	
	public void getEmployees()
	{
		for (Employee e : employees) {
			System.out.println("Employee no: " + e.getEmpno() + " Hours: " + e.getHours() + " Rate:" + e.getRate());
		}
	}
	
}
