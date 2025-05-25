package testNG;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class class1 
{
	@Ignore
	@Test(groups= {"smoke"})
	public void test8()
	{
		System.out.println("smoke");	
	}
	@Test(groups= {"sanity","windows.sanity","ios.sanity"})
	public void test9()
	{
		System.out.println("sanity");	
	}
	@Test(groups= {"regression","windows.regression","ios.regression"})
	public void test10()
	{
		System.out.println("regression");	
	}
	@Test(groups= {"regression"})
	public void test11()
	{
		System.out.println("regression");	
	}
	@Test(groups= {"functional"})
	public void test12()
	{
		System.out.println("functional");	
	}
	@Test(groups= {"functional"})
	public void test13()
	{
		System.out.println("functional");	
	}
	
	
}
