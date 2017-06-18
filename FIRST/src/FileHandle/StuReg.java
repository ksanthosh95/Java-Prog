package FileHandle;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class StuReg {
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		FileWriter out=new FileWriter("StuRegistration.txt");
		System.out.println("Enter the no of Students");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Student no:"+i);
			System.out.println("Enter the Rollno:");
			int roll=sc.nextInt();
			System.out.println("Enter the Name:");
			String nm=sc.next();
			out.write("\nRoll no is:"+roll);
			out.write("Student no:"+i);
			out.write("Name is:"+nm);
			out.write("\n---------------------\n");
		}
		out.flush();
		out.close();
		System.out.println("Your Registration is Done Successfully!!");
	}
}
