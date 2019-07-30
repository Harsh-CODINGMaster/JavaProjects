import java.math.BigDecimal;
import java.util.Scanner;

public class Obj{
	static int count =-1;

	String UserId;
	String name;
	String password;
	String email;
	String phoneNO;
	String DOB;
	long income;
	Scanner scan = new Scanner(System.in);

	Obj[] object = new Obj[50];
	int l;
	 public void CHECKallentries(String idCHECK,Obj copydown[],String pasCHECK){
			// object[0]= new Obj();
		 String g= null;
		// System.out.println("===========================1");
//if(copydown==null) {System.out.println("Record doesn't exist...");}
	 for(int i =0;i<(count+1);i++) {
 //System.out.println("===========================1");
		//System.out.println("counts is"+count);
		//System.out.println(object[0].name);
		 if (copydown[i]==null){
			 //System.out.println("====");
			System.out.println("Record doesn't exist...");
			menu(copydown);
			break;
		}		
		
		 else if(idCHECK.equals(copydown[i].UserId) && pasCHECK.equals(copydown[i].password)) {
					l=i;
					 //System.out.println("object0.userid is"+object[0].UserId);
					System.out.println("Welcome "+copydown[l].name);
					//System.out.println("===========================2");
					break;
				
			
			}
				
			//print details of that object
				// System.out.println("Welcome 1"+object[l].name);
				//System.out.println("===========================2");

		}
//	System.out.println("===========================3");
	//System.out.println("i call authen");
	
	 checkAUTHENTICITY(copydown,idCHECK,pasCHECK);
	 }
	 public void checkAUTHENTICITY(Obj[] objectcheck,String idcheck,String pasCHECK) {
		 for(int i=0;i<(count+1);i++) {
			 if(idcheck.equals(objectcheck[i].UserId) && pasCHECK.equals(objectcheck[i].password)) {
				 menu2(idcheck,objectcheck);}
				 else if(objectcheck[i]==null) {
					 System.out.println("REGISTER FIRST...");
				 }
				 else if(!(idcheck.equals(objectcheck[i].UserId)) || !(pasCHECK.equals(objectcheck[i].password) ))
				 {
					 System.out.println("not an authentic user");
				 }

			 }
		 }
	
	 
	 public void menu2(String idCHECK,Obj[] copydown) {
		 System.out.println("1.CHANGE PASSWORD \n 2.DELETE PROFILE \n 3.UPDATE PROFILE \n 4.GO BACK");
		 char c2 = scan.next().charAt(0);
		 if(c2=='1')
		 {System.out.println("Enter the UserId for which pass to be changed");
		 scan.nextLine();
		 String Userid1 = scan.nextLine();
			 modifyPASSWORD(Userid1,copydown);
		 }
		 if(c2=='2') {
			 DeleteProfile(copydown);
		 }
	 if(c2=='3') {
		 updatePROFILE(idCHECK,copydown);
	 }
	 if(c2=='4') {
		 menu(copydown);
	 }
	 }
	 public void updatePROFILE(String idCHECK,Obj[] copydown) {
		 System.out.println("which field u want to change... you can't change ur userid and DOB \n 1.Name \n 2.Email \n 3.phoneNO \n 4.Income");
	char e=scan.next().charAt(0);
	if(e=='1') {
		System.out.println("enter the new name...");
		scan.nextLine();
		String newname = scan.nextLine();
		for(int i =0;i<(count+1);i++) {
			if(idCHECK.equals(copydown[i].UserId)) {
				copydown[i].name=newname;
				System.out.println("name successfully changed...here are d details");
				PRINTallDEATILS(copydown, i);
				menu(copydown);
			}
		}
		
	}
	if(e=='2') {}
	if(e=='3') {}
	if(e=='4') {}

	
	 }
	 public void modifyPASSWORD(String Userid2,Obj[] copydown) {
		 System.out.println("enter the new password");
		// scan.nextLine();
		 String pass1 = scan.nextLine();
		 int h=0;
		for(int k=0;k<(count+1);k++) {
			if(Userid2.equals(copydown[k].UserId)) {
			//	System.out.println("****************************"+k);
				copydown[k].password=pass1;
				h=k;
				//
				printnewPASS(Userid2,copydown,h);
				//System.out.println("your pass succesfully changed... it is "+//copydown[h].password );				}
		}
			}
		}
		//System.out.println("738426486285627356823");
		
	 public void DeleteProfile(Obj[] copyDOWN2) {
		 System.out.println("which record u want to delete,enter its userid...");
		 scan.nextLine();
		 String reg = scan.nextLine();
		 for(int i=0;i<(count+1);i++) {
			 if(reg.equals(copyDOWN2[i].UserId)) {
				 copyDOWN2[i]=null;
				 System.out.println("record deleted...");
				 //PRINTallDEATILS(copyDOWN2,i);
				 menu(copyDOWN2);
			 }
			 
		 }
		 
	 }
	 
	 
public void printnewPASS(String id,Obj[] copydown,int h) {
	 Obj[] copyDOWN2 = new Obj[50];
	    copyDOWN2= copyArray(copydown) ;
System.out.println("change of pass successfull new pass is "+copyDOWN2[h].password);
menu2(id,copyDOWN2);
//System.out.println("rest od d details are..");
//PRINTallDEATILS(0);
	 }
	public void FILLinDEATILS(int i){
		// loop for entering
		
			Scanner scanner = new Scanner(System.in);	
			object[i]=new Obj();
			
			System.out.println("enter UserId");
			String UserId= scanner.nextLine();
			object[i].UserId=UserId;
//			if(count>0) {
//				for(int l =0;l<(count);l++) {
//					if(UserId.equals(count1[i].UserId)) {
//						System.out.println("DUPLICACY OF USERID...");
//					System.exit(0);
//					}
//				}
//				}
//			
			System.out.println("enter name");
			String name = scanner.nextLine();
			object[i].name=name;
			System.out.println("enter password");
//			scanner.nextLine();
			
			String password = scanner.nextLine();
			object[i].password=password;
			System.out.println("enter email");
	//		scanner.nextLine();
			String email = scanner.nextLine();
			object[i].email= email;
			System.out.println("enter phoneno.");
		//	scanner.nextLine();
			String phoneNO = scanner.nextLine();
			int a = phoneNO.length();
			if(a==10)
			{object[i].phoneNO=phoneNO;}
			else {
				System.out.println("digit count is not 10..\nplease enter again");
				phoneNO = scanner.nextLine();
				object[i].phoneNO=phoneNO;
			}
			System.out.println("enter DOB in format (DD/MM/YYYY)");
			//scanner.nextLine();
			String DOB = scanner.nextLine();
			object[i].DOB=DOB;
			System.out.println("enter income");
			long income = scanner.nextInt();
			object[i].income=income;
			scanner.nextLine();
			
    System.out.println("YOU HAVE BEEN SUCCESSFULLY REGISTERED...");
   // System.out.println("count is"+count);
   System.out.println("YOUR DETAILS ARE...");
    PRINTallDEATILS(object,i);
    Obj[] copyDOWN = new Obj[50];
    copyDOWN= copyArray(object) ;
    menu(copyDOWN);
    
	

		
	}
	private static <object> object[] copyArray(object[] source)
	{
		return source.clone();
	}
	 public void printSECURITY(int i) {
		 int a= object[i].password.length();
		 System.out.print("your pass is");
		 for(int j =0;j<a;j++) {
			 System.out.print("*");
		 }
	 }

	public void PRINTallDEATILS(Obj[] object,int i) {
//		for(int i=0;i<50;i++)//loop for printing
		if(object[i]!=null) {
		//System.out.println("first subscript object userid value is ");
			System.out.println("Userid is "+object[i].UserId);
			TitleCase tc= new TitleCase();
			System.out.println("Name is"+tc.titleCase(object[i].name));
			
			//System.out.println(object[i].password);
printSECURITY(i);
System.out.println();
			System.out.println("your email is "+object[i].email);
            System.out.println("your phoneNO is"+object[i].phoneNO);
            CurrencyFormat cf = new CurrencyFormat();
            System.out.println("your income in INR is "+cf.currencyFormat(object[i].income));
			//System.out.println();
//			Dateformat df = new Dateformat();
//			System.out.println(df.dateFormat(object[i].DOB));
		System.out.println("your date of birth is "+object[i].DOB);}
		else
		{System.out.println("No such record exist...");}
			
		
	}

	public void menu(Obj copydown[]) {

	//	Obj obrefer = new Obj();
		
		//System.out.println(object[0].name);
		Scanner scan = new Scanner(System.in);
		System.out.println("HI WELCOME...");
		System.out.println("HERE IS THE MENU...");
		System.out.println("1.LOGIN \n 2.REGISTER \n 3.QUIT \n ");//use switch hre to go further in menu
		char c1 = scan.next().charAt(0);
		if(c1=='1') { 
			System.out.println("please enter ur userid");
			scan.nextLine();
			String idCHECK =scan.nextLine();
			
		System.out.println("please enter password");
		String passCHECK = scan.nextLine();
//		if(copydown==null) {
//			System.out.println("Record doesn't exist...");
//			}
		if(copydown==null) {
			System.out.println("u need to register first...");
			menu(copydown);
		CHECKallentries(idCHECK,copydown,passCHECK);
		
		}
		
//		catch(NullPointerException ex) {
//			System.out.println("entered wrong id or pass....");
//		}
		
		}
		
		if(c1=='2') { System.out.println("PLEASE FILL ALL THESE DETAILS...");
		count++;
		
		FILLinDEATILS(count);	
		
		}
		
		if(c1=='3') {
		System.out.println("DO U WANT TO QUIT REALLY ??? (Y OR N)");
		 char c = scan.next().charAt(0);
		 if(c=='Y')
		 {System.exit(0);
		 }
		 else if(c=='N') {
			 menu(copydown);    
		 }
		 else {
			 System.out.println("PLEASE SPECIFY (Y/N)?");
		 }
		 
		}
//		if(c1=='4') {
//			PRINTallDEATILS(1);
//			
//		}
	}
	
}