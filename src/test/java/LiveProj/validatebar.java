package LiveProj;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.landloginpage;

public class validatebar extends base{
	
	public static Logger Log=LogManager.getLogger(base.class.getName());


	@Test
	public void valititle() throws IOException
	{
	driver=initialization();
	driver.get("https://www.qaclickacademy.com/");
	landloginpage lp1=new landloginpage(driver);
	//Assert.assertEquals("FEATURED COURSES", lp1.gettitle().getText());
	
	Assert.assertTrue(lp1.getnavbar().isDisplayed());
	 Log.info("verified whether navigation bar is displayed or not");
		
	
}
	
	@AfterTest
	public void terminatebrowser()
	{
		driver.close();
	}
}