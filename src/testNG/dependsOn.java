package testNG;

import org.testng.annotations.Test;

public class dependsOn 
{
	
	@Test(dependsOnMethods = {"test8","test9"})
	public void test14()
	{
		System.out.println("dependsOnMethods");	
	}
	@Test(dependsOnGroups = {"smoke"})
	public void test15()
	{
		System.out.println("dependsOnGroups");	
	}

}
