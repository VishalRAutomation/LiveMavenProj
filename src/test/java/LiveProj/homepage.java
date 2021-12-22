package LiveProj;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.base.Objects;

import pageObjects.landloginpage;
import pageObjects.loginpage;

public class homepage extends base{
	
	public static Logger Log=LogManager.getLogger(base.class.getName());
	
	@Test(dataProvider="getdata")
	public void getlogin(String uname, String pwd, String text) throws IOException, InterruptedException
	{
		
		//base b=new base();
		//WebDriver driver=b.initialization();
		WebDriver driver=initialization();
		Log.info("Driver is initialized");
		driver.get("http://qaclickacademy.com");
		Log.info("qaclickacademy website is opened");

		landloginpage l=new landloginpage(driver);
		l.landlogin().click();
		loginpage lp=new loginpage(driver);
		//System.out.println(uname);
		 lp.getemail().sendKeys(uname);
		 lp.getpassword().sendKeys(pwd);
		 
		 Log.info("username and password is entered");

		 //lp.getsubmit().click();
		 Log.info(text);
		 
		
		
	
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] ob=new Object[2][3];
		
		ob[0][0]="vishal@gmail.com";
		ob[0][1]="12345678";
		ob[0][2]="Restricted User";
		
		ob[1][0]="rawat@gmail.com";
		ob[1][1]="123456789";
		ob[1][2]="Non Restricted User";
		
		return ob;
		
		
		
	}
	
	@AfterTest
	public void terminatebrowser()
	{
		driver.close();
	}
	
		

	
}
