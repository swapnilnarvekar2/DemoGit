import java.util.Scanner;

public class ReverseString 
{

	public static void main(String[] args)
	{
		String input;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		input=sc.next();
		
		StringBuilder builder=new StringBuilder();
		builder.append(input);
		
		builder=builder.reverse();
		
		System.out.println("Reverse string is:= "+builder);
		

	}

}
