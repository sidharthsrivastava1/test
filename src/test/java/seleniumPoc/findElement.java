package seleniumPoc;

import static org.junit.Assert.*;

//import java.awt.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElement {
	FirefoxDriver driver = new FirefoxDriver();
	
	@Test
	public void testFindElement(){
	driver.get("https://mail.google.com/");
	//Get all the links displayed on Page
	java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
	//Verify there are four links displayed on the page
	assertEquals(4, links.size());
	//Iterate though the list of links and print
	//target for each link
	for(WebElement link : links)
	System.out.println(link.getAttribute("href"));
	}
}
