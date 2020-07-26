import java.util.Scanner;

public class IfElseLadder 
{

	public static void main(String[] args)
	{
		String city;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter City");
		city=sc.next();
		
		if(city.equalsIgnoreCase("Mumbai"))
		{
			System.out.println(city+" is a Metro city");
		}
		else if(city.equalsIgnoreCase("Pune"))
		{
			System.out.println(city+" is a Mtero city");
		}
		else if(city.equalsIgnoreCase("Nashik"))
		{
			System.out.println(city+" is Metro city");
		}
		else
		{
			System.out.println("Invalid City");
		}
		
	}

}
