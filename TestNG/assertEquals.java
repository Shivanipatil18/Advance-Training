package firstpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertEquals {
	
	@Test
	public void assertfail()
	{
	String act = "Gooooogle - Wrong string";
	System.out.println("Below assert would fail - ");
	Assert.assertEquals(act, "Google");
	}
}
