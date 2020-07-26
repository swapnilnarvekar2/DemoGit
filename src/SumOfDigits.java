import java.util.Scanner;

public class SumOfDigits 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find sum of digits");
		int num=sc.nextInt();
		int q,r,sum=0;
		
		while(num!=0)
		{
			q=num/10;
			r=num%10;
			sum=sum+r;
			num=q;
		}
		System.out.println("Sum of digits of number is:= "+sum);

	}

}
