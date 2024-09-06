package Testpckg;

import org.testng.annotations.Test;

import BaseClasspckg.Baseclass;
import Pagepckg.FBLoginpage;
import Utilitypckg.ExcelUtility;

public class FBTestpage extends Baseclass

{
	
	@Test
	public void FBCredentials()
	{
		FBLoginpage ob=new FBLoginpage(driver);
		
		String xl="C:\\Users\\nisha\\OneDrive\\Desktop\\DataDriver.xlsx";
		
		String sheet="Sheet1";
		
		int row=ExcelUtility.getRowCount(xl, sheet);
		
		for(int i=1; i<=row; i++)
		{
			String name= ExcelUtility.GetCellValue(xl, sheet, i, 0);
			System.out.println("Username is: " +name);
			String password=ExcelUtility.GetCellValue(xl, sheet, i, 1);
			System.out.println("Password is: " +password);
			
			ob.SetValues(name, password);
			ob.LoginClick();
			ob.ClearText();
		}
	}

}
