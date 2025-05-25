package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider4 
{
	@Test(dataProvider ="dp4")
	public void testLogin(String [] s)
	{
		System.out.println(s[0]+ " "+s[1]);
	}
	
	@DataProvider()
	public String[][] dp4()
	{
		String[][] data = new String[][] {
			
			{"hyr","123"},
			{"abc","456"},
			{"xyz","739"}
			
		};
		return data;
	}
}
