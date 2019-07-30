package com.brainmentors.los.operation;

import java.util.ArrayList;

import com.brainmentors.los.customer.Customer;
import com.brainmentors.los.customer.PersonalInformation;

public interface DB {

	public static ArrayList<Customer> getNegativeCutomers()
	{
		
		ArrayList<Customer> negativeCustomers=new ArrayList<>();
		Customer customer=new Customer();//
		customer.setId(1010);
		PersonalInformation pd= new PersonalInformation();
		pd.setFirtName("Tim");
		pd.setLastName("Jackson");
		pd.setPhone("222");
		pd.setPanCard("BW100");
		pd.setVoterId("A111");
		pd.setEmail("tim@gmail.com");
		customer.setPersonal(pd);
		negativeCustomers.add(customer);
		customer=new Customer();
		customer.setId(110);
		pd.setFirtName("Tom");
		pd.setLastName("Dahl");
		pd.setPhone("333");
		pd.setPanCard("BW2000");
		pd.setVoterId("A222");
		pd.setEmail("tom@gmail.com");
		customer.setPersonal(pd);

		negativeCustomers.add(customer);
		return negativeCustomers;
		
	}
	
	
}
