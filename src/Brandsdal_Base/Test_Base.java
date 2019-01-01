//author : Pankaj Mehta

package Brandsdal_Base;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Email_Configuration.SendEmail;
import Esko.Reports.Extent_Esko_Reports;
import Esko.utility.Utility;
import Screenshot.GetScreenshot;

public class Test_Base 
{
	public ExtentReports extent;
	public ExtentTest test;
	public  WebDriver driver ;

	@BeforeClass
	public void M1()
	{
		extent = Extent_Esko_Reports.GetExtent();
	}

	@BeforeMethod
	public void initiateDriverInstance() throws IOException, InterruptedException
	{
		
	   if(Utility.fetchpropertyvalue("browserName").toString().equalsIgnoreCase("chrome"))
	     {
		   System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	       driver = new ChromeDriver();
	       driver.manage().window().maximize();
	    
	       }

	     
	     else if (Utility.fetchpropertyvalue("browserName").toString().equalsIgnoreCase("firefox"))
	     {   
	    	 extent = Extent_Esko_Reports.GetExtent();
	    	 System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	    		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	    		capabilities.setCapability("marionette", true);
	    		driver=new FirefoxDriver();
	    		driver.manage().window().maximize();
	     }

	     
	   else if(Utility.fetchpropertyvalue("browserName").toString().equalsIgnoreCase("ie"))
	   {
		   System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
		    driver = new InternetExplorerDriver();
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
			Thread.sleep(5000);
	   }
	  
	   else
	   {
		   System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Thread.sleep(5000);
	   }
	   
	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	   

	   
	}

	@AfterSuite
	public void endDriverInstance()
	{	
		driver.quit();
	}



	@AfterClass

	public void endDriverInstanceop()
	{		

		extent.flush();
	}


	    
	@AfterMethod
	public void getResult(ITestResult result) throws IOException, EmailException
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			
			String screenshotpath = GetScreenshot.capture(driver,"Screenshotnameerror");
			//test.fail(MarkupHelper.createLabel(result.getName() + " Test case Failed", ExtentColor.RED));
			
			test.fail(result.getThrowable());
			//test.fail("Snapshot below: "+ test.addScreenCaptureFromPath(screenshotpath));
			
			
			
			
			
			
			
			
			//SendEmail.sendemail();
			

			//logger.log(Status.FAIL, "Test Case Failed is "+result.getName());
			//MarkupHelper is used to display the output in different colors
			//logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			//logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
		}
		
		else if(result.getStatus() == ITestResult.SKIP)
		{
			
			
			test.skip(MarkupHelper.createLabel(result.getName() + " Test case Skipped", ExtentColor.YELLOW));
			//test.skip("TEST CASE WAS SKIPPED");
			//logger.log(Status.SKIP, "Test Case Skipped is "+result.getName());
			//logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));	
		}

		else
			test.pass(MarkupHelper.createLabel(result.getName() + " Test case Passed", ExtentColor.GREEN));
			
			//test.pass("TEST CASE WAS PASSED");
	}









































	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

