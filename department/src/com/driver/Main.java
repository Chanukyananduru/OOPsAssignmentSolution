package com.driver;

import com.department.adminDepartment;
import com.department.hrDepartment;
import com.department.techDepartment;

public class Main {

	public static void main(String[] args) {
		
		
		//Creating the objects for each department
		adminDepartment admin = new adminDepartment();
		hrDepartment hr = new hrDepartment();
		techDepartment tech = new techDepartment();
		
		//Calling methods from Admin department 
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();
		
		//Calling methods from HR department
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());	
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		
		
		//Calling methods from Tech department
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());	
		System.out.println(tech.isTodayAHoliday());
		System.out.println();

	}

}
