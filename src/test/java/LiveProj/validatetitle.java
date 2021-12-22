package LiveProj;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.landloginpage;

public class validatetitle extends base{
	
	public static Logger Log=LogManager.getLogger(base.class.getName());

	
	
	@Test
	public void valititle() throws IOException
	{
	driver=initialization();
	
	//driver.get(props.getProperty("url"));
	driver.get("https://www.qaclickacademy.com/");
	landloginpage lp1=new landloginpage(driver);
	Assert.assertEquals("FEATURED COURSES", lp1.gettitle().getText());
	 Log.info("verified whether title bar is displayed or not");

	//Assert.assertTrue(lp1.getnavbar().isDisplayed());
	
	
	}
	
	@AfterTest
	public void terminatebrowser()
	{
		driver.close();
	}

}
