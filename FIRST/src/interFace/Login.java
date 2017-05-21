package interFace;

import java.util.Scanner;

public class Login extends Reg {
	String Bfname,Bpasswd;
	void log()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username");
		Bfname=sc.next();
		System.out.println("enter the password");
		Bpasswd=sc.next();
		}
	
void validate()
{
	String uname1=fname+lname; 
	
	int buf=uname1.compareTo(Bfname);
	int buf1=Bpasswd.compareTo(passwd);
	if (buf==0 && buf1==0)
	{
	System.out.println("Login Succesfull");	
	}
	else
	{
		System.out.println("Incorrect Username or Password");	
	}
}
public static void main(String[] args) {
Login obj1=new Login();
obj1.reg();
obj1.display();
obj1.log();
obj1.validate();
}
}
