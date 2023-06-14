package TestCases;

import org.testng.annotations.Test;

import pageObjects.loginPageObjects;

public class TC_Login extends TC_BaseClass{
	
	@Test
	public void Login()
	{
		 loginPageObjects lg = new loginPageObjects(driver);
		 
		 
		 lg.EnterUsername(userName);
		 
		 logger.info(" Username entered ");
		 
		 lg.EnterPWD(passWord);
		 
		 logger.info(" Password entered ");
		 
		 lg.clickLoginBtn();
		 
		 logger.info(" login Button clicked " );
		
		
		
	}

}
