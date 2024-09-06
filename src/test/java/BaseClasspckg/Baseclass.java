package BaseClasspckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass 
{
	public static WebDriver driver;
	String url="https://www.facebook.com";
	
	@BeforeClass
	
	public void OpenWindow()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

}
