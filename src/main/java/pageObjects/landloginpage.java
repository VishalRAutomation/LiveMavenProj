package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landloginpage {

	public WebDriver driver;
public landloginpage(WebDriver driver) {
		
		this.driver=driver;
	}

	By login=By.cssSelector("a[href*='sign_in']");
	By title=By.xpath("//div[@class='text-center']//h2");
	By navbar=By.xpath("//nav//ul");
	
	
	
	
	public WebElement landlogin()
	{
		return driver.findElement(login);
	}

	public WebElement gettitle()
	{
		return driver.findElement(title);
	}

	public WebElement getnavbar()
	{
		return driver.findElement(navbar);
	}
	
	
}
