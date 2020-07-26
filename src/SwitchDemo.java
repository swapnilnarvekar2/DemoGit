import java.util.Scanner;

public class SwitchDemo 
{

	public static void main(String[] args) 
	{
		int x,y,result,option;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of X");
		x=sc.nextInt();
		System.out.println("Enter value of Y");
		y=sc.nextInt();
		
		System.out.println("1 For Addition");
		System.out.println("2 For Substarction");
		System.out.println("3 For Multiplication");
		System.out.println("4 For Division");
		
		System.out.println("Enter Choice");
		option=sc.nextInt();
		
		switch(option)
		{
			case 1: System.out.println("Addition is:= "+(x+y));
					break;
					

			case 2: System.out.println("Substarction is:= "+(x-y));
					break;
					

			case 3: System.out.println("Multiplication is:= "+(x*y));
					break;
					

			case 4: System.out.println("Division is:= "+(x/y));
					break;
					
			default: System.out.println("Invalid choice");
					break;
		}

	}

}
