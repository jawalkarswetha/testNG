package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider5 
{
	@Test(dataProvider ="dp5")
	public void testLogin( Object[] s)
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
	}
	
	@DataProvider()
	public Object[][] dp5()
	{
		// jagged array where column count vary row to row
		Object[][] data = new Object[][] {
			{"hyr","123","abc","852"},
			{"pqr","567"},
			{"xyz","789","1234"}
			
			
		};
		return data;
	}
}
