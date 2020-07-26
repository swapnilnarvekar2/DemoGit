
public class SwapNumbers
{
	int num1,num2;
	
	public SwapNumbers(int x,int y)
	{
		num1=x;
		num2=y;
		
	}
	
	void beforeSwap()
	{
		System.out.println("Number1= "+num1);
		System.out.println("Number2= "+num2);
	}

	void swapNumbers()
	{
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swap");
		System.out.println("Number1= "+num1);
		System.out.println("Number2= "+num2);
	}
	public static void main(String[] args) 
	{
		SwapNumbers sn=new SwapNumbers(11, 10);
		sn.beforeSwap();
		sn.swapNumbers();

	}

}
