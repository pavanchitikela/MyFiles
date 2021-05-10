package com.myshopping.pojo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="CUSTOMER")
public class Customer {
 @Id
 @Column(name="CUSTID")
 private int customerId;
 @Column(name = "NAME",length=45)
 private String name;
 @Column(name = "ADDRESS",length=40)
 private String address;
 @Column(name = "CITY",length = 30)
 private String city;
@Column(name = "STATE",length=2)
 private String state;
 @Column(name = "ZIP", length = 9)
 private String zip;
 @Column(name = "PHONE", length = 9)
 private String phone;
 @Column(name = "CREDITLIMIT")
 private int creditLimit;
 
 @ManyToOne
 @JoinColumn(name="REPID") //foreign key in customer table
 private Employee employee;
 


public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

public int getCreditLimit() {
	return creditLimit;
}
public void setCreditLimit(int creditLimit) {
	this.creditLimit = creditLimit;
}
}
