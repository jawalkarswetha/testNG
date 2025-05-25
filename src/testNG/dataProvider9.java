package testNG;

import org.testng.annotations.Test;

public class dataProvider9 
{
	@Test(dataProvider ="dp1", dataProviderClass = dataProvider1.class)
	public void TestLogin(String s)
	{
		System.out.println(s);
	}
}
