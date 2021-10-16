package firstpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameter {

		@Parameters({"URL"})
		@Test
		public void Check_Parameter(String pmt)
		{
			System.out.println("Test Parameters");
			System.out.println(pmt);
		}
}
