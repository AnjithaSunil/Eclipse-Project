package Pagepckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginpage 
{
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement pswd;
	
	@FindBy(name="login")
	WebElement fblogin;
	
	public FBLoginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void SetValues(String email, String psswd)
	{
		fbemail.sendKeys(email);
		pswd.sendKeys(psswd);
	}

	
	public void LoginClick()
	{
		fblogin.click();
	}
	
	public void ClearText()
	{
		fbemail.clear();
		pswd.clear();
	}

}
