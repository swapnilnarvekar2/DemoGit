import java.util.Scanner;

public class RightAngleTriangle 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int side1,side2,side3;
		
		System.out.println("Enter Side1");
		side1=sc.nextInt();
		System.out.println("Enter Side2");
		side2=sc.nextInt();
		System.out.println("Enter Side3");
		side3=sc.nextInt();
		
		if(side3*side3==side1*side1+side2*side2)
		{
			System.out.println("It is right angle triangle");
		}
		else
		{
			System.out.println("Not a Right Angle Triangle");
		}

	}

}
