package LiveProj;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

public WebDriver driver;
Properties props;
	
	public WebDriver initialization() throws IOException
	{
	props=new Properties();
	FileInputStream fls=new FileInputStream("D:\\selenium projects\\LiveProjectfinal\\src\\main\\java\\resources\\data.properties");
	props.load(fls);
	String browsername=props.getProperty("browser");
	
	if (browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browsername.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	
	
	
	
	public void getscreenshot(String testcasename, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver; 
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinatiofile=System.getProperty("user.dir")+"\\report\\"+testcasename+".png";
		FileUtils.copyFile(source,new File(destinatiofile));
		
	}
	
	
}
