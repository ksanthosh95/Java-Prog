package interFace;

public class ShowRoom {
public static void main(String[] args)
{
	twoWheeler v1= new twoWheeler();
	  System.out.println(v1.getSpeed());
	  System.out.println(v1.getCost());
	threeWheeler v2=new threeWheeler();
	  System.out.println(v2.getSpeed());
	  System.out.println(v2.getCost());
	fourWheeler v3=new fourWheeler();
	  System.out.println(v3.getSpeed());
	  System.out.println(v3.getCost());}
}
