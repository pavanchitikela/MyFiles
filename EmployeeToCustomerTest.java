package com.myshopping.test;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.junit.jupiter.api.Test;

import com.myshopping.pojo.Customer;
import com.myshopping.pojo.Department;
import com.myshopping.pojo.Employee;
import com.myshopping.util.MyFactory;

import net.bytebuddy.implementation.bytecode.Addition;
import oracle.net.aso.c;

public class EmployeeToCustomerTest {
    public void addEmployeeTest() {
    	MyFactory mf = new MyFactory();
		Session session=mf.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Employee empObj= new Employee();
		empObj.setEmployeeNumber(7001);
		empObj.setEmployeeName("Dhoni");
		empObj.setEmployeeJob("SALESMAN");

		
		
    }
	@Test
	public void selectTest() {
		MyFactory mf = new MyFactory();
		Session session=mf.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Department dpt = null;
	    dpt=session.get(Department.class,30);
		System.out.println("Department Number : "+dpt.getDepartmentNumber());
		System.out.println("Department Name : "+dpt.getDepartmentName());
		System.out.println("Department Location : "+dpt.getDepartmentLocation());;
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		List<Employee> empList=dpt.getEmpList();
		Iterator<Employee> empiter=empList.iterator();
		while(empiter.hasNext()) {
		Employee empobj = empiter.next();
		System.out.println("Employee Id : "+empobj.getEmployeeNumber());
		System.out.println("Employee Name : "+empobj.getEmployeeName());
		System.out.println("Employee Job : "+empobj.getEmployeeJob());
		System.out.println("**********************************************");
		List<Customer> custList=empobj.getCustList();
		Iterator<Customer> custiter=custList.iterator();
		while(custiter.hasNext()) {
			Customer cust = custiter.next();
			System.out.println("Customer Id        : "+cust.getCustomerId());
			System.out.println("NAME               : "+cust.getName());
			System.out.println("Address            : "+cust.getAddress());	
			System.out.println("City               : "+cust.getCity());
			System.out.println("State              : "+cust.getState());
			System.out.println("Zipcode            : "+cust.getZip());
			System.out.println("phone              : "+cust.getPhone());
			System.out.println("CreditLimit        : "+cust.getCreditLimit());
			System.out.println("--------------------");
		}
	}
		session.getTransaction().commit();
	}

}
