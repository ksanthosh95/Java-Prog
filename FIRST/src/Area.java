
public class Area {
	int r,h,l,b;
	double circles()
	{
		double area=3.14*r*r;
		return area;
	}
	int squares()
	{
		int area=h*l;
		return area;
	}
	int rectas()
	{
		int area=h*l;
		return area;
	}
	float tris()
	{
		float area=(float)0.5*b*h;
		return area;
	}

public static void main(String[]args)
{
	Area a1=new Area();
	a1.r=5;
	a1.h=5;
	a1.l=5;
	a1.b=5;
	a1.circles();
	a1.squares();
	a1.rectas();
	a1.tris();
	
}
}
