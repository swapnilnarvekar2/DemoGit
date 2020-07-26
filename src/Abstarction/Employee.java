package Abstarction;

public class Employee extends Boss
{

	@Override
	public void testCase() 
	{
		System.out.println("Test cas executed");
		
	}

	@Override
	public void reports() 
	{
		System.out.println("Reports done");
		
	}
	
	public void demo()
	{
		System.out.println("Method from child class");
	}
	
	
	
	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.testCase();
		e.reports();
		e.test();
		e.demo();

	}

	

}
