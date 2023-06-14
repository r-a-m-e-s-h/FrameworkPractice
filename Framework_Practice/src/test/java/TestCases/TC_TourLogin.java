package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import pageObjects.tourLoginPageObjevts;

public class TC_TourLogin extends TC_BaseClass {
	
	
	@Test
	public void tourLoginTest() throws IOException
	{
		tourLoginPageObjevts tlg = new tourLoginPageObjevts(driver);
		
		
		tlg.getTourURL(TourURL);
		
		tlg.setUsername(tUserName);
		
		logger.info(" Tour Page Username is Entered ");
		
		tlg.setPassword(tPassword);
		
		logger.info(" Tour Page Password is entered");
		
		
		tlg.clickSubmitBtn();
		
		logger.info(" Tour Page sunmitBtn is clicked");
		
		tlg.pageTitle();
		
		logger.info(" Page Title taken ");
		
		captureScreenShot(driver);
		
		logger.info(" ScreenShot taken ");
		
		
		
	}
	

}
