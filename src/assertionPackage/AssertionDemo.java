package assertionPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo
{
	@Test
	public void testCase1()
	{
		System.out.println("Test case 1 started");
		Assert.assertEquals(12, 12);
		System.out.println("Test case 1 ended");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("Test case 2 started");
		Assert.assertEquals("Hello", "Helo","Words doesnt mactch");    //This is with error message
		System.out.println("Test case 2 ended");
	}
	
	@Test
	public void testCase3()
	{
		System.out.println("Test case 3 started");
		String myStr="Swapnil";
		Assert.assertTrue(myStr.contains("Swapnil"),"Contents not matching");   //This is boolean check
		System.out.println("Test case 3 ended");
	}
}
