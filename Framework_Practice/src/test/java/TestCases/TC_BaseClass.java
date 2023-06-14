package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Utilities.Readconfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_BaseClass {
	
	Readconfig config = new Readconfig();
	
	public static WebDriver driver;
	
	public static Logger logger ;
	
	
	String userName = config.getUserName();        
	
	String passWord  = config.getPwd();
	
	String baseURL = config.getApplicationURL();
	
	String TourURL = config.getTourURL();
	
	String tUserName = config.getTourUsername();
	
	String tPassword = config.getTourPassword();
	
	@BeforeSuite
	public void SetUP()
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get(baseURL);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		logger = logger.getLogger("practice FrameWORK");
		
		PropertyConfigurator.configure("Log4j.properties");	
		
		
		
		
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	
	public void captureScreenShot(WebDriver driver) throws IOException
	{
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dst = new File("/Users/localuser/Desktop/TourLoginpage.png");
		FileUtils.copyFile(src, dst);
		
	}

	
	
	
	
	
	
	
	
	

}
