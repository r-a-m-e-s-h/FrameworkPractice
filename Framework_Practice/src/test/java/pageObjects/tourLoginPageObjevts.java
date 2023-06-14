package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tourLoginPageObjevts {
	
	WebDriver driver;
	
	
	public tourLoginPageObjevts(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//input[@name='userName']")
	WebElement t_username;
	
	@FindBy(xpath= "//input[@name='password']")
	WebElement t_password;
	
	@FindBy(xpath = "//input[@name='submit']")
	WebElement t_submitBtn;
	
	public void getTourURL(String url)
	{
		driver.get(url);
	}
	
	public void setUsername(String txt)
	{
		t_username.sendKeys(txt);
		
	}
	public void setPassword(String pwd)
	{
		t_password.sendKeys(pwd);
	}
	public void clickSubmitBtn()
	{
		t_submitBtn.click();
	}
	
	public void pageTitle()
	{
		System.out.println("The Page Title is : "+driver.getTitle());
	}
	

}
