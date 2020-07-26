package assertionPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo
{
	@Test
	public void softAssert()
	{
		SoftAssert soft=new SoftAssert();
		System.out.println("Soft assertion started");
		soft.assertEquals(12, 13,"Count doesnt match");
		System.out.println("Soft assertion ended");	//this statements will execute even assertion fails
		soft.assertAll();   //This is must
	}
	
	@Test
	public void hardAssert()
	{
		System.out.println("Hard assertion started");
		Assert.assertEquals(12, 13);
		System.out.println("Hard assertion ended");	//This statement wont execute once assertion fails
	}
}
