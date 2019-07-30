 package com.brainmentors.los.start;

 import com.brainmentors.los.operation.LOSProcess;
 import com.brainmentors.los.utils.Utility;
 public class Application {
  
	
	public static void main(String[] args) {
		LOSProcess process=new LOSProcess(); //
		while(true)
		{
		System.out.println(" Do you have application number or Not (Enter 0 ) press -1 to exit ");
		
		int applicationNumber=Utility.scanner.nextInt();
		if(applicationNumber==-1)
		{
			System.out.println("thanks for using this system ");
		}
		if(applicationNumber==0)
		{
			//new customer
			process.sourcing();
			}
		else
		{
			
			process.checkStage(applicationNumber);
			//existing customer
		}
		
		}
   }
}
