package packge;

abstract class Shape
{
	abstract void No_of_sides();
}
class Trapezoid extends Shape
{
	void No_of_sides() 
	{
		System.out.println("Number of sides= 4");
	}
}
class Triangle extends Shape
{
	void No_of_sides() 
	{
		System.out.println("Number of sides= 3");
	}
}
class Hexagon extends Shape
{
	void No_of_sides() 
	{
		System.out.println("Number of sides= 6");
	}
}

public class MathematicalModel 
{
	public static void main(String[] args) 
	{
		Shape s1=new Trapezoid();
		Shape s2=new Triangle();
		Shape s3=new Hexagon();
		s1.No_of_sides();
		s2.No_of_sides();
		s3.No_of_sides();
	}

}
