package testNG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider6 
{
	@Test(dataProvider = "dp6")
	public void testLogin(Object s)
	{
		System.out.println(s);
	}
	
	@DataProvider()
	public Iterator<String> dp6()
	{
		List<String> data = new ArrayList<>();
		//List<Object> data = new ArrayList<>();
		data.add("swetha");
		data.add("J");
		
		return data.iterator();
	}
}

