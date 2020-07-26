package Abstarction;

public class Car extends Vehicle{



	@Override
	public void wheels(int number)
	{
		System.out.println("Number of vehicles= "+number);
		
	}
	
	public static void main(String[] args)
	{
		Car c=new Car();
		c.wheels(4);
		
	}

	

}
