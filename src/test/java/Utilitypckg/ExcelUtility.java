package Utilitypckg;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility 
{
	
	public static String GetCellValue(String xl, String sheet, int row, int col)
	{
		
		try
		{
			FileInputStream fi= new FileInputStream(xl);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFCell cell=wb.getSheet(sheet).getRow(row).getCell(col);
			
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
				
			}
		} catch(Exception e)
		{
			return "";
		}
		
	
	}
	
	public static int getRowCount(String xl, String sheet)
	{
		try
		{
			FileInputStream fi= new FileInputStream(xl);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet sh=wb.getSheet(sheet);
			return sh.getLastRowNum();
		}catch (Exception e)
		{
			return 0;
		}
		
	}

}
