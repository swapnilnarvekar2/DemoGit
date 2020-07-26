import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		int number=sc.nextInt();
		int fact=1;
		
		while(number>0)
		{
			fact=fact*number;
			number--;
		}
		System.out.println("Factorial is= "+fact);

	}

}
