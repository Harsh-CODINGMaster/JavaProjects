import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "harsh";
		System.out.println("enter new string");
		Scanner sc = new Scanner(System.in);
		String namenew = sc.nextLine();
		name = namenew;
		System.out.println("new string copied is"+name);

	}

}
