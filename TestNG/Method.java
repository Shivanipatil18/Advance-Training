package firstpkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Method {
	
	@Test(groups= {"Verify"})
	public void Verify()
	{
		System.out.println("First -Verify Bulid");
	}
	
	@BeforeTest
	public void B_test()
	{
		System.out.println("BEFORE TEST");
	}
	@AfterTest
	public void A_test()
	{
		System.out.println("AFTER TEST");
	}
	@BeforeClass
	public void B_class()
	{
		System.out.println(" BEFORE CLASS");
	}
	
	@AfterClass
	public void A_class()
	{
		System.out.println(" AFTER CLASS");
	}
	@BeforeMethod
	public void B_Method()
	{
		System.out.println("  BEFORE METHOD");
	}
	
	@AfterMethod
	public void A_Method()
	{
		System.out.println("  AFTER METHOD");
	}
	
	@Test (priority=2)
	public void Test_Add()
	{
		System.out.println("   Test-Adding customer here");
	}
	
	@Test (priority=1)
	public void Test_Edit()
	{
		System.out.println("   Test-Edit customer here");
	}
	
	@Test (priority=0)
	public void Test_Delete()
	{
		System.out.println("   Test-Delete customer here");
	}
	

}
