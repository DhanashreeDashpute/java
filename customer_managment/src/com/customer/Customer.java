package com.customer;

import java.time.LocalDate;

public class Customer implements Comparable<Customer> {
	private int custid;
	private  String fname;
	private String lname;
	private String email;
	private String password;
	private double rAmt;
	private LocalDate dob;
	private ServicePlan plan;
	private static int idGenerator;
	
	public Customer(String fname,String lname,String email,String password,double rAmt,LocalDate dob,ServicePlan plan) {
		super();
		this.custid = ++idGenerator;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.rAmt = rAmt;
		this.dob = dob;
		this.plan = plan;
	}

	public Customer( String email) {
		this.email=email;
	}

	
	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getrAmt() {
		return rAmt;
	}

	public void setrAmt(double rAmt) {
		this.rAmt = rAmt;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}

	public static int getIdGenerator() {
		return idGenerator;
	}

	public static void setIdGenerator(int idGenerator) {
		Customer.idGenerator = idGenerator;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", password=" + password + ", rAmt=" + rAmt + ", dob=" + dob + ", plan=" + plan + "]";
	}

	public boolean equals(Object o) {
		System.out.println("in customers equals");
		if(o instanceof Customer) {
			Customer c=((Customer)o);
			return this.email.equals(c.email);
	}
		
		return false;
	}
	
	
	@Override
	 public int compareTo(Customer other) {
        return this.email.compareTo(other.getEmail());
    }

	
	
	
	
	
	
	
}
