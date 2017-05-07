package interFace;

public class ShowRoom {
public static void main(String[] args)
{
	System.out.println("Basic Astract And Interface Concept");
	twoWheeler v1= new twoWheeler();
	  v1.name();
	  System.out.println(v1.getSpeed());
	  System.out.println(v1.getCost());
	threeWheeler v2=new threeWheeler();
	  v2.name();
	  System.out.println(v2.getSpeed());
	  System.out.println(v2.getCost());
	fourWheeler v3=new fourWheeler();
	  v3.name();
	  System.out.println(v3.getSpeed());
	  System.out.println(v3.getCost());}
}
