import java.util.Scanner;

public class SwitchChar 
{

	public static void main(String[] args) 
	{
		char c;
		String choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter char");
		choice=sc.next();
		c=choice.charAt(0);
		
		switch(c)
		{
			case 'a': System.out.println(c+" is an owel");
			break;
			
			case 'e': System.out.println(c+" is an owel");
			break;
			
			case 'i': System.out.println(c+" is an owel");
			break;
			
			case 'o': System.out.println(c+" is an owel");
			break;
			
			case 'u': System.out.println(c+" is an owel");
			break;
			
			default :
						System.out.println("Not an owel");
						break;
		
		}
		

	}

}
