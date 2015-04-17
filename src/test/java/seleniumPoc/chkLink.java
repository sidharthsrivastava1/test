package seleniumPoc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chkLink {
	FirefoxDriver driver = new FirefoxDriver();
	@Test
	
	public void gm(){
		System.out.println("hi");
		
	WebElement gmailLink = driver.findElement(By.linkText("http://gmail.com"));
	assertEquals("http://mail.google.com/",gmailLink.getAttribute("href"));
	}

}
