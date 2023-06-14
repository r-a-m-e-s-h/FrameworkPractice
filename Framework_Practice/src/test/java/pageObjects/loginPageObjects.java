package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageObjects {
	
	
	
	WebDriver driver;
	
	public loginPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[1]/td[2]/input")
	WebElement loginUsername;
	
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td[2]/input")
	WebElement LoginPassword;
	
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	WebElement loginBtn;
	
	public void EnterUsername(String txt)
	{
		loginUsername.sendKeys(txt);
	}
	public void EnterPWD(String pwd) 
	{
		LoginPassword.sendKeys(pwd);
	}
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	
	

}
