package interFace;

public class threeWheeler extends Pname implements Vechile{
	public int getSpeed()
	{
		System.out.println("Speed is:");
	 return 80;
	}
	public double getCost()
	{
		System.out.println("The Cost is:");
		return 65000.00;
	}
	void name() 
	{
		System.out.println("MahinAuto");
		
	}
}
