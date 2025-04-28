package com.cts.creatio.crm.language.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> StudentMap1 = new HashMap<String,String>();
		StudentMap1.put("Name", "John Doe ");
		StudentMap1.put("Age", "20");
		StudentMap1.put("Gender", "Male");
		StudentMap1.put("Roll Number", "S12345");
		StudentMap1.put("Grade", "A");
		StudentMap1.put("Major", "Computer Science");
		StudentMap1.put("GPA", "3.8");
		StudentMap1.put("Email", "john@example.com");
		StudentMap1.put("Contact Number", "9999997777");
		StudentMap1.put("Address", "123 Elm St");
		System.out.println("Student 1 details "+StudentMap1);
		
		Map<String,String> StudentMap2 = new HashMap<String,String>();
		StudentMap2.put("Name", "Jane Smith");
		StudentMap2.put("Age", "21");
		StudentMap2.put("Gender", "Female");
		StudentMap2.put("Roll Number", "S12346");
		StudentMap2.put("Grade", "B");
		StudentMap2.put("Major", "Mathematics");
		StudentMap2.put("GPA", "3.5");
		StudentMap2.put("Email", "jane@example.com");
		StudentMap2.put("Contact Number", "9876665666");
		StudentMap2.put("Address", "456 Oak St");
		System.out.println("Student 2 details "+StudentMap2);
		
		Map<String,String> StudentMap3 = new HashMap<String,String>();
		StudentMap3.put("Name", "Mike Brown");
		StudentMap3.put("Age", "22");
		StudentMap3.put("Gender", "Male");
		StudentMap3.put("Roll Number", "S12347");
		StudentMap3.put("Grade", "A");
		StudentMap3.put("Major", "Physics");
		StudentMap3.put("GPA", "3.9");
		StudentMap3.put("Email", "mike@example.com");
		StudentMap3.put("Contact Number", "8787876546");
		StudentMap3.put("Address", "789 Pine St");
		System.out.println("Student 1 details "+StudentMap3);
		
		List<Map<String,String>> list1 =new ArrayList<Map<String,String>>();
		list1.add(StudentMap1);
		list1.add(StudentMap2);
		list1.add(StudentMap3);
		System.out.println("Student List:" +list1);
		
		Map<String,String> EmployeeMap1 = new HashMap<String,String>();
		EmployeeMap1.put("Employee Number", "E001");
		EmployeeMap1.put("Name", "Alice Green");
		EmployeeMap1.put("Age", "30");
		EmployeeMap1.put("Gender", "Female");
		EmployeeMap1.put("Department", "Engineering");
		EmployeeMap1.put("Position", "Software Engineer");
		EmployeeMap1.put("Salary", "75,000");
		EmployeeMap1.put("Email", "alice@example.com");
		EmployeeMap1.put("Contact Number", "9876543213");
		System.out.println("Student 1 details "+EmployeeMap1);
		
		Map<String,String> EmployeeMap2 = new HashMap<String,String>();
		EmployeeMap2.put("Employee Number", "E002");
		EmployeeMap2.put("Name", "Bob Johnson");
		EmployeeMap2.put("Age", "35");
		EmployeeMap2.put("Gender", "Male");
		EmployeeMap2.put("Department", "Marketing");
		EmployeeMap2.put("Position", "Marketing Executive");
		EmployeeMap2.put("Salary", "85,000");
		EmployeeMap2.put("Email", "bob@example.com");
		EmployeeMap2.put("Contact Number", "9876543214");
		System.out.println("Student 2 details "+EmployeeMap2);
		
		Map<String,String> EmployeeMap3 = new HashMap<String,String>();
		EmployeeMap3.put("Employee Number", "E003");
		EmployeeMap3.put("Name", "Carol White");
		EmployeeMap3.put("Age", "28");
		EmployeeMap3.put("Gender", "Female");
		EmployeeMap3.put("Department", "Sales");
		EmployeeMap3.put("Position", "Sales Executive");
		EmployeeMap3.put("Salary", "65,000");
		EmployeeMap3.put("Email", "carol@example.com");
		EmployeeMap3.put("Contact Number", "9876543215");
		System.out.println("Student 3 details "+EmployeeMap3);
		
		List<Map<String,String>> list2= new ArrayList<Map<String,String>>();
		list2.add(EmployeeMap1);
		list2.add(EmployeeMap2);
		list2.add(EmployeeMap3);
		System.out.println("Employee List:" +list2);
		
		Map<String,String> ProductMap1 = new HashMap<String,String>();
		ProductMap1.put("Product ID", "P001");
		ProductMap1.put("Name", "Laptop");
		ProductMap1.put("Category", "Electronics");
		ProductMap1.put("Price", "$1,200");
		ProductMap1.put("Stock Quantly", "50");
		ProductMap1.put("Supplier", "Tech Supplies");
		ProductMap1.put("Warranty", "2 years");
		ProductMap1.put("Rating", "4.5");
		ProductMap1.put("Manufacturing Date", "1/15/2023");
		ProductMap1.put("Expiry Date", "1/15/2025");
		System.out.println("Student 1 details "+ProductMap1);
		
		Map<String,String> ProductMap2 = new HashMap<String,String>();
		ProductMap2.put("Product ID", "P002");
		ProductMap2.put("Name", "Desk Chair");
		ProductMap2.put("Category", "Furniture");
		ProductMap2.put("Price", "$150");
		ProductMap2.put("Stock Quantly", "100");
		ProductMap2.put("Supplier", "Office Depot ");
		ProductMap2.put("Warranty", "1 years");
		ProductMap2.put("Rating", "4");
		ProductMap2.put("Manufacturing Date", "2/10/2023");
		ProductMap2.put("Expiry Date", "N/A");
		System.out.println("Student 1 details "+ProductMap2);
		
		Map<String,String> ProductMap3 = new HashMap<String,String>();
		ProductMap3.put("Product ID", "P003");
		ProductMap3.put("Name", "Coffee Maker");
		ProductMap3.put("Category", "Kitchen");
		ProductMap3.put("Price", "$75 ");
		ProductMap3.put("Stock Quantly", "100");
		ProductMap3.put("Supplier", "KitchenWorld");
		ProductMap3.put("Warranty", "6 months");
		ProductMap3.put("Rating", "4.2");
		ProductMap3.put("Manufacturing Date", "3/20/2023");
		ProductMap3.put("Expiry Date", "3/20/2024");
		System.out.println("Student 1 details "+ProductMap3);
		
		List<Map<String,String>> list3 = new ArrayList<Map<String,String>>();
		list3.add(ProductMap1);
		list3.add(ProductMap2);
		list3.add(ProductMap3);
		System.out.println("Product List: " +list3);
		
		Map<String, List<Map<String,String>>> data = new HashMap<String, List<Map<String,String>>>();
		data.put("Student List", list1);
		//System.out.println("\n");
		data.put("Employee List", list2);
		//System.out.println("\n");
		data.put("Product List", list3);
		System.out.println("*************************************"+"\n");
		System.out.println("All list" +data);
		System.out.println("Supplier Name: " + data.get("Product List").get(1).get("Supplier"));
		
		
		
		
		
	}

}
