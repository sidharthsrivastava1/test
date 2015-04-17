package seleniumPoc;

import static org.junit.Assert.assertEquals;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	
	FirefoxDriver driver = new FirefoxDriver();
	@Test
	public void UG() throws InterruptedException {
		System.out.println( "Hello World!" );
		
		//WebDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("http://gmail.com");
		//java.util.List<WebElement> links = driver.findElements(By.tagName("<a>"));
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("sidharthsrivastava1");
		// Enter Password
		driver.findElement(By.id("Passwd")).sendKeys("mitulsid!@#$");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Click on 'Sign In' button
		driver.findElement(By.id("signIn")).click();
		driver.findElement(By.xpath("//div[@class='z0']/div")).click();
		Thread.sleep(5000);
		//Logout
				
		driver.findElement(By.xpath("//div[@class='gb_ma gb_qb gb_0c gb_n gb_Ra']/div[1]/a/span]")).click();
				                                   
		driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();
		
		driver.close();
		
		}
	
	
	@Test
		
		public void gm(){
		WebElement gmailLink = driver.findElement(By.linkText("GMail"));
		assertEquals("http://mail.google.com/",
		gmailLink.getAttribute("href"));
		}
		/*public void testFindElement(){
		driver.get("https://mail.google.com/");
		//Get all the links displayed on Page
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		//Verify there are four links displayed on the page
		assertEquals(4, links.size());
		//Iterate though the list of links and print
		//target for each link
		for(WebElement link : links)
		System.out.println(link.getAttribute("href"));
		}*/
		


}
