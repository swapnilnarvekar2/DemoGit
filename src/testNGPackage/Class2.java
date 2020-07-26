package testNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2 {
	

	@Test(priority=2)
	public void deleteVendor() {
		
		System.out.println("Delete Vendor Successful");
	}
	
	@Test(priority=3)
	public void deleteProduct() {
		
		System.out.println("Delete Product Successful");
	}
	
	@Test(priority=4)
	public void deleteCurrency() {
		
		System.out.println("Delete Currency Successful");
	}
}
