package Esko.Datagenerator;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Datagenerator {


@DataProvider(name="Login from different users")
    
    public static Object [] [] testdatagenerated() throws Exception
    {
    	FileInputStream file=new FileInputStream("./TestData/TestData.xlsx");
    	XSSFWorkbook Workbook = new XSSFWorkbook(file);
    	XSSFSheet loginsheet =  Workbook.getSheet("Login");
    	int Numberofdataofrows = loginsheet.getPhysicalNumberOfRows();
    	
    	Object [][] testdata = new Object[Numberofdataofrows][2];
    	
    	for (int i=0; i<Numberofdataofrows;i++)
    	{
    		XSSFRow row= loginsheet.getRow(i);
    		XSSFCell username = row.getCell(0);
    		XSSFCell password = row.getCell(1);
    		testdata[i][0] = username.getStringCellValue();
    		testdata[i][1] = password.getStringCellValue();	
    		
    	}
    
      return testdata;

    }

 }



