package com.myshopping.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// means below class must be having a table mapped for it

@Entity  
@Table(name = "DEPT") //dept is the actual table name
public class Department {
	
	@Id //means below member is a primary key
	@Column(name="DEPTNO") 
	private int departmentNumber; //as as per dept table deptno
	
	@Column(name="DNAME",length = 10) 
	private String departmentName; // as per dept table dname
	
	@Column(name="LOC", length=10)
	private String departmentLocation; // as per dept table location
	
	//look at the fourth member
	@OneToMany(mappedBy = "dept")
	List<Employee> empList = new ArrayList<Employee>();
	//with setters and getters for empList
	
//	@Column(name="HOD", length=15)
//	private String headOfDepartment;
	
/*	public String getHeadOfDepartment() {
		return headOfDepartment;
	}

	public void setHeadOfDepartment(String headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}*/

	public Department() {
		super();
		System.out.println("Department() is called...");
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentLocation() {
		return departmentLocation;
	}

	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	
	
	
	
}
