import java.util.Scanner;

public class ReverseNumber 
{
	static int number,rev=0;
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		number=sc.nextInt();
		while(number!=0)
		{
			rev=rev*10;
			rev=rev+number%10;
			number=number/10;
		}
		System.out.println(rev);
		
	}

}
