import java.util.Scanner;

public class BiggerNumber
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter value of X");
		x=sc.nextInt();
		System.out.println("Enter value of Y");
		y=sc.nextInt();
		System.out.println("Enter value of Z");
		z=sc.nextInt();
		
		if(x>y)
		{
			if(x>z)
			{
				System.out.println("X is greater than Y and Z");
			}
			else
			{
				System.out.println("Z is greater than X and Y");
			}
		}
		else
		{
			if(y>z)
			{
				System.out.println("Y is greater than X and Z");
			}
			else
			{
				System.out.println("Z is greater than X and Y");
			}
		}

	}

}
