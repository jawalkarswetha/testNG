package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class webElementsCommands
{
	WebDriver driver = new ChromeDriver();
//	@Test
//	public void practise1()
//	{
//	//System.setProperty("webdriver.chrome.driver","/Users/swetha/Downloads/chromedriver-mac-arm64/chromedriver");
//	driver.get("https://www.youtube.com/watch?v=MQWpfLDtsbA");
//	String s = driver.getTitle();
//	System.out.println(s);
//	System.out.println(s.length());
//	String pageS = driver.getCurrentUrl();
//	System.out.println(s);
//	String s1 = driver.getPageSource();
//	System.out.println(s1.length());
//	driver.close();
//	}
//	
//	@Test
//	public void pratice2()
//	{
//		driver.get("https://demoqa.com/browser-windows/");
//		driver.findElement(By.id("New Browser Window")).click();
//		driver.close();
//	}
//	
//	@Test
//	public void practise3()
//	{
//		String Url = "https://www.toolsqa.com/selenium-webdriver/selenium-navigation-commands/";
//		driver.get(Url);
//		driver.findElement(By.xpath("//a[text()='Home")).click();
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().to(Url);
//		driver.navigate().refresh();
//	}
//	
	@Test
	public void practise4() throws InterruptedException
	{
		driver.get("https://www.makemytrip.com/flights/");
		driver.findElement(By.className("commonModal__close")).click();
		Thread thread = new Thread();
		thread.wait(5000);
		driver.findElement(By.className("headerIcons")).click();
		driver.findElement(By.xpath("//input[@class='hsw_inputField']")).click();
		driver.findElement(By.cssSelector("input[class='react-autosuggest__input']")).sendKeys("bang");
		List<WebElement> places = driver.findElements(By.cssSelector("input[class='react-autosuggest__container']"));
		for(WebElement i : places )
		{
			System.out.println(i);
		}
		
		driver.quit();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
