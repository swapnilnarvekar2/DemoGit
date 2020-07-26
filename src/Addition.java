import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Addition
{
	int number,result;
	
	public Addition()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		number=sc.nextInt();
		//number=100;
		System.out.println("Default Constructor= "+number);
	}
	
	public Addition(int x,int y)
	{
		int res;
		res=x+y;
		System.out.println("Addition= "+res);
		
	}

	public static void main(String[] args)
	{
		Addition add=new Addition();
		
	}

}
