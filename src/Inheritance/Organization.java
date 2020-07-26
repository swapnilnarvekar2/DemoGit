package Inheritance;

public class Organization extends Employee
{
	String orgName;
	String orgLocation;
	
	void getOrgInfo()
	{
		System.out.println(orgName);
		System.out.println(orgLocation);
	}
}
