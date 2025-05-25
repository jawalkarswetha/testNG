package testNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//@Test(groups= {"all"})
public class day1 {

		// TODO Auto-generated method stub
		@AfterTest
		public void lastexecution()
		{
			System.out.println("I will execute last");
			
		}
		@Test
		public void Demo()
		{
			System.out.println("hello");//automation
			//AssertJUnit.assertTrue(false);
		}
		@AfterSuite
		public void afSyite()
		{
			System.out.println("I am the no 1 from last ");
		}
		@Test(groups= {"smoke"})
		public void SecondTest()
		{
			System.out.println("bye");
		}
		@AfterClass
		public void test1()
		{
			System.out.println("@AfterClass");
		}
		@BeforeClass
		public void test2()
		{
			System.out.println("@BeforeClass");
		}
		@BeforeSuite
		public void test3()
		{
			System.out.println("@BeforeSuite");
		}
		@BeforeTest
		public void test4()
		{
			System.out.println("@BeforeTest");
		}
		@AfterMethod
		public void test5()
		{
			System.out.println("@AfterMethod");
		}
		@BeforeMethod
		public void test6()
		{
			System.out.println("before method");
		}
		@Test(groups= {"smoke","regression"})
		public void test7()
		{
			System.out.println("test7");	
		}
		@Test(groups= {"regression"})
		public void test8()
		{
			System.out.println("test8");	
		}
		
}
