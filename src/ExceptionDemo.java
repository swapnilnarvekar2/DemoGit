import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str;
		
		do
		{
			System.out.println("Enter Divident");
			
			int divident=sc.nextInt();
			System.out.println("Enter Divisor");
			int divisor=sc.nextInt();
			int result=0;
			try
			{
				result=divident/divisor;
			}
			
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("catch block executed");
				System.out.println("============");
			}
			
			finally
			{
			System.out.println("Division is= "+result);
			System.out.println("Finally Block Executed");
			System.out.println("Do you want continue???");
			System.out.println("Press Y if you want to continue");
			System.out.println("Press any key if you want to exit");
			System.out.println("Enter choice");
			str=sc.next();
			}
		}
		while(str.equalsIgnoreCase("Y"));

	}

}
