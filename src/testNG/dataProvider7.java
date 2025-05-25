package testNG;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider7 
{
	@Test(dataProvider = "dp7")
	public void testLogin(Object[] s)
	{
		System.out.println(s[0]+ " "+s[1]);
	}
	
	@DataProvider()
	public Iterator<Object[]> dp7()
	{
		Set<Object[]> data = new HashSet<>();
		data.add(new Object[] {"swetha",123});
		data.add(new Object[] {"J",234});
		
		return data.iterator();
	}
}
