package com.brainmentors.los.operation;

import static com.brainmentors.los.utils.Utility.scanner;
import static com.brainmentors.los.utils.Utility.serialCounter;

import java.util.ArrayList;

import com.brainmentors.los.customer.Customer;
import com.brainmentors.los.customer.LoanDetails;
import com.brainmentors.los.customer.PersonalInformation;
import com.brainmentors.los.utils.CommanConstants;
import com.brainmentors.los.utils.LoanConstants;
import com.brainmentors.los.utils.StageContants;
import com.brainmentors.los.utils.Utility;;

public  class LOSProcess implements StageContants,CommanConstants {
	//private Customer customers[]= new Customer[100];
    
	private ArrayList<Customer> customers= new ArrayList<>();// generic strategy<> right side ko empty
	public void approval(Customer customer)
	{
		customer.setStage(APPROVAL);
		int score=scoring(customer);
		System.out.println("id"+customer.getId());
		System.out.println("Name is "+customer.getPersonal().getFirtName()+ " "+customer.getPersonal().getLastName());
		System.out.println("score is "+customer.getLoanDetails().getScore());
		System.out.println("Loan "+customer.getLoanDetails().getType()+"Amount"
		+customer.getLoanDetails().getAmount()+"Duration"
				+customer.getLoanDetails().getDuration());
		double approveAmount1 = customer.getLoanDetails().getScore()*0.01;
	
		double approveAmount2 =customer.getLoanDetails().getAmount();
		System.out.println(approveAmount1);
		System.out.println(approveAmount2);
		System.out.println("Loan Approved is "+(approveAmount1*approveAmount2));
		System.out.println("Do you want to Bring this loan or not");
		char choice= scanner.next().toUpperCase().charAt(0);
		if(choice==NO)
		{
			customer.setStage(REJECT);
			customer.setRemarks("Customer deny the approved amount "+approveAmount1*approveAmount2);
			return;
		}
		else
		{
			showEMI(customer);
		}
	}
	private void showEMI(Customer customer)
	{
		System.out.println("EMI is ");
		if(customer.getLoanDetails().getType().equalsIgnoreCase(LoanConstants.HOME_LOAN))
		{
			customer.getLoanDetails().setRoi(LoanConstants.HOME_LOAN_ROI);
		}
		if(customer.getLoanDetails().getType().equalsIgnoreCase(LoanConstants.AUTO_LOAN))
		{
			customer.getLoanDetails().setRoi(LoanConstants.AUTO_LOAN_ROI);
		}
		if(customer.getLoanDetails().getType().equalsIgnoreCase(LoanConstants.PERSONAL_LOAN))
		{
			customer.getLoanDetails().setRoi(LoanConstants.PERSONAL_LOAN_ROI);
		}
		
		double perMonthPrinciple=(customer.getLoanDetails().getAmount())/(customer.getLoanDetails().getDuration());
		double interest= perMonthPrinciple * (customer.getLoanDetails().getRoi());
		double totalEmi=perMonthPrinciple+interest;
		System.out.println("Your EMI is"+totalEmi);
	}
	
	public void qde(Customer customer) {
		customer.setStage(QDE);
		System.out.println("Application number "+customer.getId());
		System.out.println("Name "+customer.getPersonal().getFirtName()+""+customer.getPersonal().getLastName());
		System.out.println("You applied for a"+customer.getLoanDetails().getType()+""+"Duration"
	
	
				
				+customer.getLoanDetails().getDuration()+" Amount "+customer.getLoanDetails().getAmount());
		
		
		System.out.println("Enter the pan card");
		String panCard=scanner.next();
		System.out.println("Enter the voter id");
		String voterId=scanner.next();
		System.out.println("Enter the income");
		double income=scanner.nextDouble();
		System.out.println("Enter the Liability");
		double liability=scanner.nextDouble();
		System.out.println("Enter the phone");
		String phone=scanner.next();
		System.out.println("Enter the email");
		String email =scanner.next();
		customer.getPersonal().setVoterId(voterId);
		customer.getPersonal().setPanCard(panCard);
		customer.getPersonal().setPhone(phone);
		customer.getPersonal().setEmail(email);
		customer.setIncome(income);
		customer.setLiability(liability);
		
	}
	
//	public void scoring()
//	{
//		System.out.println("coring calls");
//	}
	public void moveToNextStage(Customer customer)
	{    
		while(true)
		{
		if(customer.getStage()==SOURCING) {
			System.out.println("Want to Move to the next stage Y/N");
			char choice=scanner.next().charAt(0);
			
		  if(choice==YES)
		  {
			  qde(customer );
		  }
		  else
		  {
			  return;
		  }
			
		}
		else
		if(customer.getStage()==QDE)
		{
			System.out.println("Want to Move to the next stage Y/N");
			char choice=scanner.next().toUpperCase().charAt(0);
			
		  if(choice==YES)
		  {
			  dedupe(customer);
		  }
		  else
		  {
			  return;
		  }
					
			
		}
		else
		if(customer.getStage()==DEDUPE)
		{
			System.out.println("Want to Move to the next stage Y/N");
			char choice=scanner.next().charAt(0);
			
		  if(choice==YES)
		  {
			  scoring(customer);
		  }
		  else
		  {
			  return;
		  }
					
			
		}
		if(customer.getStage()==SCORING)
		{
			System.out.println("Scoring Want to Move to the next stage Y/N");
			char choice=scanner.next().charAt(0);
			
		  if(choice==YES)
		  {
			  approval(customer);
		  }
		  else
		  {
			  return;
		  }
					
			
		}
		}	
	}
	int score=0;
	public int scoring(Customer customer)
	{   
		customer.setStage(SCORING);
		
		double totalIncome =customer.getIncome()- customer.getLiability();
		if(customer.getPersonal().getAge()>21 && customer.getPersonal().getAge()<=35)
		{System.out.println("i m in if 1st no one ");
			score+=10;
			customer.getLoanDetails().setScore(score);
		}
		else if(totalIncome>200000)
		{
			score+=50;
			customer.getLoanDetails().setScore(score);
		}
		return customer.getLoanDetails().getScore();
		
	}
	
	
	public void dedupe(Customer customer)
	{    
		customer.setStage(DEDUPE);
		//System.out.println("Inside dedupe");
		boolean isNegativeFound=false;
		for(Customer negativeCustomer:DB.getNegativeCutomers())
		{  
			int negativeScore=isNegative(customer, negativeCustomer);
			if(negativeScore>0)
			{
				System.out.println("Customer record found in dedupe and score is"+negativeScore);
				isNegativeFound=true;
				break;
			}
		}
		if(isNegativeFound)
		{
			System.out.println("Do you want to proceed this loan"+customer.getId());
			char choice=scanner.next().toUpperCase().charAt(0);
			if(choice==NO)
			{
				customer.setRemarks("Loan is rejected due to high score in dedupe Check");
				customer.setStage(REJECT);
				return; 
			}
		}
	}
	private int isNegative(Customer customer, Customer negative)
	{
		int percentageMatch=0;
		if(customer.getPersonal().getPhone().equals(negative.getPersonal().getPhone()))
		{
			percentageMatch+=20;
		}
		if(customer.getPersonal().getEmail().equals(negative.getPersonal().getEmail()))
		{
			percentageMatch+=20;
		}
		if(customer.getPersonal().getVoterId().equals(negative.getPersonal().getVoterId()))
		{
			percentageMatch+=20;
		}
		if(customer.getPersonal().getPanCard().equalsIgnoreCase(negative.getPersonal().getPanCard()))
		{
			percentageMatch+=20;
		}
		if(customer.getPersonal().getAge()==negative.getPersonal().getAge() && customer.getPersonal().getFirtName().equalsIgnoreCase(negative.getPersonal().getFirtName()))
		{
			percentageMatch+=20;
		}
		return percentageMatch;
	}
	
	public void sourcing()
	{   
		Customer customer=new Customer();
		customer.setStage(SOURCING);
		customer.setId(serialCounter);
		System.out.println("enter the Name");
		
		String firstName=scanner.next();
		System.out.println("Enter the last name");
		String lastName=scanner.next();
		System.out.println("enter the age");
		int age=scanner.nextInt();
		System.out.println("enter the loan type HL, AL, PL");
		String type=scanner.next();
		System.out.println("Enter the amount");
		double amount=scanner.nextDouble();
		System.out.println("Duration of loan");
		int duration=scanner.nextInt();
		PersonalInformation pd =new PersonalInformation();
		pd.setFirtName(firstName);
		pd.setLastName(lastName);
		pd.setAge(age);
		
		customer.setPersonal(pd);
		LoanDetails loandetails= new LoanDetails();
		loandetails.setAmount(amount);
		loandetails.setType(type);
		loandetails.setDuration(duration);
		customer.setLoanDetails(loandetails);
		customer.setStage(SOURCING);
		customers.add(customer);
		serialCounter++;
		System.out.println("Sourcing done");
	}
	public void checkStage(int applicationNumber)
	{    
		boolean isStageFound=false;
		
		if(customers!=null && customers.size()>0)
		{
		for(Customer customer : customers)
		{
			if(customer.getId()==applicationNumber)
			{
				System.out.println("you are on "+Utility.getStageName(customer.getStage()));
				isStageFound=true;
				moveToNextStage(customer); 
				break;
			}
		}
		
	}
	if(!isStageFound) {
		System.out.println("invalid application number");
	}
	
}
}
