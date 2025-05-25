package testNG;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.testng.annotations.Test;

public class timeOut_and_exception 
{
	@Test(timeOut=5000)
	public void testMethod()
	{
		System.out.println("SWETHA");
	}
	@Test(invocationCount=5, invocationTimeOut =1000, threadPoolSize=2)
	public void repeat()
	{
		System.out.println("Jawalkar");
	}
	@Test(expectedExceptions = {NoSuchElementException.class, TimeoutException.class})
	public void testt()
	{
		System.out.println("Hi");
	}
}
