package com.vm.training.java.Test;

import java.util.*;
public class Employee {

	private String firstName;
	private String lastName;

	public Employee(String firstName,String lastName)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	void Validation() throws Exception
	{
		if(firstName==null && lastName==null )
		{
			throw new  NullPointerException("Entry Missing");
		}

		if(firstName.length()<3 && lastName.length()<3  )
		{
			throw Exception("name should be minimum 3 character");
		}
	}

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the firstname: ");
		String firstName = sc.nextLine();
		System.out.println("Enter the lastname: ");
		String lastName = sc.nextLine();

		Employee employee = new Employee(firstName,lastName);
		employee.Validation();

	}

}
