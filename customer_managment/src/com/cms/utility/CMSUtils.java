package com.cms.utility;

import java.util.List;

import com.app.Custom_Exception.CustomException;
import com.customer.Customer;

public class CMSUtils {
	public static Customer authenticateCustomer(String email,String password,List<Customer>list) throws CustomException{
		
		Customer cust=new Customer(email);
		int index=list.indexOf(cust);
		if(index==-1)
			throw new CustomException("invalid email");
		Customer customer=list.get(index);
		if(customer.getPassword().equals(password))
			return customer;
		throw new CustomException("invalid password");
		
		
	}

	public static String deleteCustomerDetails(String email, List<Customer> customerList) throws CustomException {
		// removal by PK --YES , remove(index) OR remove(Object)
		int index = customerList.indexOf(new Customer(email));
		if (index == -1)
			throw new CustomException("Can't un subscribe  - invalid Email !!!!");
		// => valid email
		return "Removed details of " + customerList.remove(index).getFname();

	}
}
