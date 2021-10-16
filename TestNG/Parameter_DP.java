package firstpkg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameter_DP 
{
		@Test(dataProvider="SearchProvider")
		public void testMethod(String name,String city) throws InterruptedException
		{
			System.out.println("Welcome->" + name+"   He is from->" + city);
			Thread.sleep(1000);
		}


	@DataProvider(name="SearchProvider")
	public Object[][] getDataFromDataprovider()
	{
	return new Object[][]
	{
		{"Sai","Kolhapur"},
		{"Rahi","Pune"},
		{"Era","Mumbai"}
	};
	}
}