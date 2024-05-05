package com.app.customer;
import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.app.Custom_Exception.CustomException;
import com.customer.Customer;
import com.customer.ServicePlan;
public class CMSValadation {

	public static void checkForDuplicate(String email, List<Customer>customerList)throws CustomException{
		Customer newCust=new Customer(email);
		if(customerList.contains(newCust))
			throw new CustomException("duplicate email");
	}

	public static ServicePlan parseAndValidatePlan(String plan,double rAmt)throws CustomException{
		ServicePlan serviceplan= ServicePlan.valueOf(plan.toUpperCase());
		if (serviceplan.getAmount()==rAmt)
			return serviceplan;
		throw new CustomException("plan not available");
	}
	public static Customer validateCustomer(String fname,String lname,String email,String password,double rAmt,String dob,
			String plan,List<Customer>customer)throws CustomException{
		checkForDuplicate(email,customer);
		ServicePlan serviceplan=parseAndValidatePlan(plan,rAmt);
		LocalDate birthdate=LocalDate.parse(dob);
		validatePassword(password);

		return new Customer(fname,lname,email,password,rAmt,birthdate,serviceplan);
	}
	public static void validatePassword(String password) throws CustomException{
		String regEx="((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})";
		if(!password.matches(regEx))
			throw new CustomException("wrong password");

	}

	public static int validateAge(String dob) {
		LocalDate birthdate=LocalDate.parse(dob);
		LocalDate curDate = LocalDate.now();  
		return Period.between(birthdate, curDate).getYears();

	}

	//int age=CMSValadation.validateAge(sc.next());
	public static void removeElement(String plan,String dob,List<Customer>customerlist) {
		ServicePlan serviceplan= ServicePlan.valueOf(plan.toUpperCase());
		LocalDate date=LocalDate.parse(dob);
		Iterator<Customer> custItr=customerlist.iterator();
		while(custItr.hasNext())
		{
			Customer c=custItr.next();
			if(c.getPlan() == serviceplan && c.getDob().isAfter(date))
				custItr.remove();
		}    
       System.out.println("removed successfully");
	}


}



