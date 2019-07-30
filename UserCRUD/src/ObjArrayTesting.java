import java.io.IOException;
import java.util.Scanner;

//class HidePasswordFromCommandLine extends Thread {
//	boolean hidepassinput = false;	
//boolean stopThread = false;
//}
public class ObjArrayTesting {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException  {
		// TODO Auto-generated method stub
//		  String password = "";
		Scanner scan = new Scanner(System.in);
		char c;
		do {
		Obj object1 = new Obj();
		Obj[] object = new Obj[50];
		object1.menu(object);
		//Runtime.getRuntime().exec("cls");
	try {	if(object==null) {
			System.out.println("REGISTER FIRST...");
			object1.menu(object);
		}
	}
	catch (NullPointerException e) {
		// TODO: handle exception
		System.out.println("REGISTER FIRST...");
		object1.menu(object);	}
		System.out.println("u wish 2 cont (y/n)?");
		c = scan.next().charAt(0);
			} while(c=='y');
		//Obj[] object = new Obj[50];
//		HidePasswordFromCommandLine hide = new HidePasswordFromCommandLine();
//		hide.start();
//ArrayList dynOBJarray = new ArrayList();
//int [] x =new int[50];

//	 Console cnsl =null;
////     
////     try {
////        // creates a console object
////        cnsl = System.console();
////
////        // if console is not null
////        if (cnsl != null) {
//          
//           // read password into the char array
//           char[] pwd = cnsl.readPassword("Password: ");
//           
//           // prints
//           System.out.println("Password is: "+pwd);
//        } 
//	Console console = System.console();
//    char[] pw = console.readPassword("Password: ");
//    String password = String.valueOf(pw);
//    System.out.println("Password: " + password);
//	ConsoleReader reader = new ConsoleReader();
//    Character mask = '*';
//    String line = null;
//    do {
//        line = reader.readLine("Enter Password(blank pwd to exit)> ", mask);
//        System.out.println("Got password: " + line);
//    } while (line != null && line.length() > 0);
//        
//     } catch(Exception ex) {
//        // if any error occurs
//        ex.printStackTrace();      
     //}
//System.out.println( "Password:" );
//scanner.nextLine();
//password = scanner.nextLine();
//hide.stopThread = true;
//System.out.println( "Password= " + password );
//	Obj x[10];
	//Obj [] arr ;
//for(int i =1;i<=50;i++) {
//	Scanner scanner = new Scanner(System.in);	
//	Obj o1 = new Obj();
//	System.out.println("enter UserId");
//	int UserId= scanner.nextInt();
//	System.out.println("enter name");
//	scanner.nextLine();
//	String name = scanner.nextLine();
//	System.out.println("enter password");
//	scanner.nextLine();
//	String password = scanner.nextLine();
//	System.out.println("enter email");
//	scanner.nextLine();
//	String email = scanner.nextLine();
//	System.out.println("enter phoneno.");
//	scanner.nextLine();
//	String phoneNO = scanner.nextLine();
//	System.out.println("enter DOB");
//	scanner.nextLine();
//	String DOB = scanner.nextLine();
//	System.out.println("enter income");
//	long income = scanner.nextInt();
//	String className = "Obj";
//}
////	String fullPathOfTheClass = className;
////
////	Class cls = Class.forName("Obj");
////	Obj myTestObject = (Obj) cls.newInstance();
////	 
////	
//	
//	
//	myTestObject.assignvalues(UserId, name, password, email, phoneNO, DOB, income);
//	arr[i] = myTestObject;
//Obj object = new Obj();
//object.assignvalues(UserId, name, password, email, phoneNO, DOB, income);
//	x[i]= object(UserId, name, password, email, phoneNO, DOB, income);
	//	dynOBJarray.add(myTestObject);
//	System.out.println(dynOBJarray.get(0));
//}
//for(int i =1;i<=50;i++) {
//	System.out.println(arr[i].DOB);
//	
//}
//System.out.println(dynOBJarray.get(0));


	}


}