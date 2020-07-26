package Inheritance;

public class MainClass 
{

	public static void main(String[] args) 
	{
		//Employee e=new Employee();   ////--No need to create object of parent class in case of Inheritance

		Department dept=new Department();  
		dept.empID=1;
		dept.empName="Swapnil";
		dept.empGender="Male";
		dept.empInfo();
		dept.orgName="ECW";
		dept.orgLocation="Mumbai";
		dept.getOrgInfo();
		
		dept.deptId=1212;
		dept.deptName="IT";
		dept.deptLoation="Chandivli";
		
		dept.getDeptInfo();

	}

}
