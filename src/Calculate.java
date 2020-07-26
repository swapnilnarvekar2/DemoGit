
public class Calculate
{
	
	int add(int x,int y)
	{
		return (x+y);
	}
	
	double Simple_Intrest(double p,double n,double r)
	{
		return (p*n*r)/100;
	}
	
	double updated(double res)
	{
		return (res+50);
	}

	public static void main(String[] args)
	{
		Calculate cal=new Calculate();
		double result=cal.add(60,50);
		System.out.println("Addition= "+result);
		result=cal.updated(result);
		System.out.println("Updated Result="+result);
		double result1=cal.Simple_Intrest(100,2,5);
		System.out.println("Simple Intrest= "+result1);

	}

}
