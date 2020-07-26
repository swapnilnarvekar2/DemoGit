package testNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class1 {
  
	@BeforeSuite
	public void login() {
		
		System.out.println("Login Successful");
  }
	@AfterSuite
	public void logout() {
		
		System.out.println("Logout Successful");
	}
	@Test(priority=2)
	public void addVendor() {
		
		System.out.println("Add Vendor Successful");
	}
	
	@Test(priority=3)
	public void addProduct() {
		
		System.out.println("Add Product Successful");
	}
	
	@Test(priority=4)
	public void addCurrency() {
		
		System.out.println("Add Currency Successful");
	}
}
