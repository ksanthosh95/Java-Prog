package interFace;
import java.util.Scanner;
public class Reg {
		String fname,lname,passwd;
		void reg()
			{
			Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st name");
		fname=sc.next();
		System.out.println("enter the last name");
		lname=sc.next();
		System.out.println("enter the password");
		passwd=sc.next();
		}
		void display()
		{
			System.out.println("Registration completed");
	System.out.println("username is:"+ fname + lname);
	System.out.println("the password is: *****");
		}


}
