package firstpkg;

import org.testng.annotations.Test;

public class DependsClass {
	
	@Test(dependsOnMethods= {"C_method","D_method"})
	public void A_method()
	{
		System.out.println("A Mehtod -Depends on C method and D method");
	}
	
	@Test
	public void B_method()
	{
		System.out.println("B Method");
	}
	
	@Test
	public void C_method()
	{
		System.out.println("C Method");
	}
	
	@Test
	public void D_method()
	{
		System.out.println("D Method");
	}


}
