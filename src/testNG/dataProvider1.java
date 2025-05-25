package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider1 
{
	@Test(dataProvider ="dp1")
	public void TestLogin(String s)
	{
		System.out.println(s);
	}
	
	@DataProvider(parallel = true)
	public String[] dp1()
	{
		// when u r specifically storing string data 
		String [] data = new String[]{
			"abcd",
			"efg",
			"hij"
		};
		
		return data;
	}
}
