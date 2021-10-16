package firstpkg;

import org.testng.annotations.Test;

public class Parallel_Test {
	
	@Test
	public void A_Method() throws InterruptedException
	{
		long id = Thread.currentThread().getId();
		System.out.println("A_TestMethod. Thread id is: " + id);
		Thread.sleep(1000);
	}
	
	@Test
	public void B_Method() throws InterruptedException
	{
		long id = Thread.currentThread().getId();
		System.out.println("B_TestMethod. Thread id is: " + id);
		Thread.sleep(2000);
	}
	
	@Test
	public void C_Method() throws InterruptedException
	{
		long id = Thread.currentThread().getId();
		System.out.println("C_TestMethod. Thread id is: " + id);
		Thread.sleep(3000);
	}
	
	@Test
	public void D_Method() throws InterruptedException
	{
		long id = Thread.currentThread().getId();
		System.out.println("D_TestMethod. Thread id is: " + id);
		Thread.sleep(4000);
	}
	
	
}
