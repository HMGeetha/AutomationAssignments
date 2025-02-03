package com.creatio.crm.assignments.basics;

import java.util.Iterator;

public class EmpGroups {

	public static void main(String[] args) {

		String[] names = new String[3];
		int[] ids = new int[3];

		Employees obj = new Employees();

		names[0] = obj.employeeNames_1;
		names[1] = obj.employeeNames_2;
		names[2] = obj.employeeNames_3;

		ids[0] = obj.employee_ID1;
		ids[1] = obj.employee_ID2;
		ids[2] = obj.employee_ID3;

		System.out.println("Employee Name:" + names[0] + "," + "Employee Ids:" + ids[0]);
		System.out.println("Employee Name:" + names[1] + "," + "Employee Ids:" + ids[1]);
		System.out.println("Employee Name:" + names[2] + "," + "Employee Ids:" + ids[2]);

	}
}