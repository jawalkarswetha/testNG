package testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
public class FlightBookingTest 
{
	
	@Test(priority =-1)
	public void signUp()
	{
		System.out.println("signUp");
	}
	@Test(priority =2)
	public void login()
	{
		System.out.println("login");
	}
	@Test(priority=3)
	public void searchForFlight()
	{
		System.out.println("searchForFlight");
	}
	@Test(priority =3)
	public void bookFlight()
	{
		System.out.println("bookFlight");
	}
	@Test(priority =5)
	public void logout()
	{
		System.out.println("logout");
	}
}
