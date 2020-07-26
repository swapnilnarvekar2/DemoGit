package Polymorphism;

public class Overloading 
{
	
	void add(int a,int b)
	{
		System.out.println("Addition= "+(a+b));
	}
	
	void add(double a, double b)
	{
		System.out.println("Addition= "+(a+b));
	}
	
	void add(int a, double b)
	{
		System.out.println("Addition= "+(a+b));
	}
	
	void add(String str)
	{
		System.out.println("String method is called "+str);
	}

	public static void main(String[] args)
	{
		Overloading over=new Overloading();
		over.add(0.2,2);

	}

}