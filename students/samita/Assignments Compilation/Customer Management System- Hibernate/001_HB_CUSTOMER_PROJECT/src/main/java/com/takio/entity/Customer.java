package com.takio.entity;
/*
 * @author Samita Shrestha
 * JDBC-3, Takeo
 * Assignment: Admin Customer Management System
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {
	
@Id
@Column(name="CNO")
private int cno;
@Column(name="CNAME")
private String cname;
@Column(name="CADD")
private String cadd;

public Customer(int cno, String cname, String cadd) {
	super();
	this.cno = cno;
	this.cname = cname;
	this.cadd = cadd;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public int getCno() {
	return cno;
}
public void setCno(int cno) {
	this.cno = cno;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCadd() {
	return cadd;
}
public void setCadd(String cadd) {
	this.cadd = cadd;
}


}
