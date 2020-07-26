package Interface;

public class C implements A,B
{
	@Override
	public void display() 
	{
		System.out.println("display method from C ");
		
		
	}

	public static void main(String[] args) 
	{
		C c=new C();
		System.out.println(A.a);
		c.display();
		System.out.println(B.a);
		
	}

	
}
