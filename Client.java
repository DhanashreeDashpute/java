package com.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import com.app.customer.CMSValadation;
import com.cms.utility.CMSUtils;
import com.customer.Customer;

public class Client {

	public static void main(String[] args) {

		try(Scanner sc=new Scanner(System.in)){
			boolean exit=false;
			List<Customer> customerlist=new ArrayList<>();
			while(!exit) {
				System.out.println("Options : 1. Customer Sign Up 2. Display all 3.customer sign in 4.change password 5.delete customer 6.sort by email 7.sort by birthdate and last name 8. 0. Exit");
				System.out.println("Choose");
				try {
					switch (sc.nextInt()) {
					case 1: // register new customer
						System.out.println(
								"Enter customer details : firstName,  lastName,  email,  password,	regAmount,  dob,  plan");
						Customer customer = CMSValadation.validateCustomer(sc.next(), sc.next(), sc.next(), sc.next(),sc.nextDouble(), sc.next(), sc.next(), customerlist);
						//=> all i/ps are valid
						customerlist.add(customer);
						System.out.println("customer registered....");
						break;
					case 2:
						for(Customer c : customerlist)
							System.out.println(c);
						break;
					case 3:
						System.out.println("enter email and password");
						customer=CMSUtils.authenticateCustomer(sc.next(),sc.next(),customerlist);
						System.out.println("login successful...."+customer);
						break;
					case 4:
						System.out.println("enter email and password");
						customer=CMSUtils.authenticateCustomer(sc.next(), sc.next(), customerlist);
						customer.setPassword(sc.next());
						System.out.println("password changed");
						break;
					case 5 : System.out.println("Enter email to un subscribe");
					CMSUtils.deleteCustomerDetails(sc.next(),customerlist);
					break;
					case 6:
						System.out.println("sort by email");
						Collections.sort(customerlist);
						for (Customer cust : customerlist) {
							System.out.println(cust);
						}
						break;
					case 7:
						System.out.println("sort by birthdate and last name");
						Collections.sort(customerlist, new Comparator<Customer>() {
							@Override
							public int compare(Customer c1, Customer c2) {

								int dobComparison = c1.getDob().compareTo(c2.getDob());
								if(dobComparison!=0) 
									return dobComparison;

								return c1.getLname().compareTo(c2.getLname());
							}

						});
						for (Customer cust : customerlist) {
							System.out.println(cust);
						}
						break;
					case 8:
						System.out.println("remove customer of specific plan and birthdate");
						CMSValadation.removeElement(sc.next(),sc.next(), customerlist);				

						break;
					case 0:
						exit = true;
						break;
					}
				}
				catch (Exception e) {
					sc.nextLine();
					System.out.println(e);// toString
				}

			}

		}
	}

}
