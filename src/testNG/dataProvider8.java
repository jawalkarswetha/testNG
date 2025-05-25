package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider8 
{
	
	// partial dataProvider8
	@Test(dataProvider ="dp8")
	public void TestLogin(String s)
	{
		System.out.println(s);
	}
	
	@DataProvider(indices = {0,2})
	public String[] dp8()
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
