package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider3 
{
	@Test(dataProvider="dp3")
	public void testLogin3(Object i)
	{
		System.out.println(i);
	}
	
	@DataProvider()
	public Object[] dp3()
	{
		Object[] data = new Object[] {
				1,
				"Hello",
				3
		};
		
		return data;
	}
}

