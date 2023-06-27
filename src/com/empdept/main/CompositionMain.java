package com.empdept.main;

import java.util.Scanner;

import com.empdept.pojo.Department;
import com.empdept.pojo.Employee;

public class CompositionMain {

	public static void main(String[] args) {
		
		Department dept = new Department();
		
		Scanner sc = new Scanner(System.in);
		
		int choice=0;
		
		do
		{
			System.out.println("Enter Your choice: "
					+ "\n1 to Hire Employee"
					+ "\n2 to Fire Employee"
					+ "\n3 to Calculate Salary"
					+ "\n4 to display employees"
					+ "\n5 to exit!!");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: 
				{
					System.out.println("Enter the Employee Number: ");
					int empno = sc.nextInt();
					System.out.println("Enter hours: ");
					int hrs = sc.nextInt();
					System.out.println("Enter rate: ");
					float rate = sc.nextFloat();
					
					Employee e = new Employee(empno,hrs,rate);
					
					dept.hireEmployees(e);
					break;
				}
				case 2:
				{
					System.out.println("Enter Empoyee Number: ");
					int empno = sc.nextInt();
					
					dept.fireEmployees(empno);
					break;
				}
				case 3:
				{
					System.out.println("Enter hours: ");
					int hrs = sc.nextInt();
					System.out.println("Enter rate: ");
					float rate = sc.nextFloat();
					
					Employee emp = new Employee(hrs,rate);
					double salary = emp.getNetIncome();
					System.out.println("salary:" + salary);
					break;
				}
				case 4:
				{
					System.out.println("Employees: ");
					dept.getEmployees();
					break;
				}
				case 5:
				{
					System.out.println("Exiting...");
					choice=0;
					break;
				}
				default:
				{
					System.out.println("Invalid choice");
					break;
				}
			}
		}
		while(choice!=0);
	}
}
