package Inheritance;

public class Department extends Organization
{
	int deptId;
	String deptName;
	String deptLoation;
	
	void getDeptInfo()
	{
		System.out.println(deptId);
		System.out.println(deptName);
		System.out.println(deptLoation);
	}
}
