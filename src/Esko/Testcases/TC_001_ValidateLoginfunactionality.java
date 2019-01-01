package Esko.Testcases;
import org.testng.annotations.Test;
//import static org.testng.AssertJUnit.assertequals;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.ITestResult;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Esko.Reports.Extent_Esko_Reports;

import Esko.base.DriverInstance;
import Esko.pages.Login;
import Esko.utility.Utility;




public class TC_001_ValidateLoginfunactionality extends DriverInstance 
{
	

  @Test(priority=1, enabled = true)
    
    public void check_user_is_able_to_login_TC_01() throws IOException, InterruptedException
  {
	  test = extent.createTest("FUJI Website", "Verify user is able to login the application by client user");
	  test.log(Status.INFO, "user is able to login or not");
	  driver.get("https://uat2.fxa.com.au/compass/login.jsp");
	  test.log(Status.INFO, "entering URL");
	  driver.findElement(By.xpath("//input[@id='j_username44444']")).sendKeys("client@_selenium.test.com");
	  test.log(Status.INFO, "entering USERNAME");
	  driver.findElement(By.xpath("//input[@id='j_password']")).sendKeys("P@sswordDd");
	  test.log(Status.INFO, "entering PASSWORD");
	  driver.findElement(By.xpath("//*[@id='loginbtn']")).click();
	  test.log(Status.INFO, "CLICK ON BUTTON");
	  Thread.sleep(5000);
	  //If asser
	  Assert.assertEquals(driver.getTitle(),"Client Main Menu | COMPASS23");
	  test.info("title was found");
	  
	 // Assert.assertEquals
	  
  }
	 
	


  @Test(priority=2, enabled = false)
  
 public void category_item_TC_02() throws IOException, InterruptedException
 {
	  
	  test = extent.createTest("FUJI Website", "Verify user is able to login the application by client user");
	  test.log(Status.INFO, "user is able to login or not");
	  driver.get("https://uat2.fxa.com.au/compass/login.jsp");
	  test.log(Status.INFO, "entering URL");
	  driver.findElement(By.xpath("//input[@id='j_username']")).sendKeys("client@_selenium.test.com");
	  test.log(Status.INFO, "entering USERNAME");
	  driver.findElement(By.xpath("//input[@id='j_password']")).sendKeys("P@sswordDd");
	  test.log(Status.INFO, "entering PASSWORD");
	  driver.findElement(By.xpath("//*[@id='loginbtn']")).click();
	  test.log(Status.INFO, "CLICK ON BUTTON");
	  Thread.sleep(5000);
	  //If asser
	  Assert.assertEquals(driver.getTitle(),"Client Main Menu | COMPASS");
	  test.info("title was found");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
//	  test = extent.createTest("ESKO Website", "Verify category");
//	 Login login= new Login(driver);
//	  login.enterusernameaddingacategory(" ");
//	  login.enterPasswordaddingacategory(" ");
//	 login.clicksignin();
//	 login.Addingacategory();
//	 login.clickOnTableElement(By.xpath(Utility.fetchlocatorvalue("table_admin_xpath")), login.addvaluecategorydata, 1,4);
//	 login.cataloguejobcreation();
//	login.enterusername(" ");
//  	 login.enterPassword(" ");
//  	login.clicksignin();
//  	Thread.sleep(5000);
//  	 login.clickstartanewjob();
//  	 Thread.sleep(5000);
//  	 login.addingcategoryothers();
//  	 login.catalogue();
//  	Thread.sleep(5000);
//  	 login.cataloguepagedata();
  	  
 
 }
	  
  


	@Test(priority=3, enabled = false)
	  
	public void uploadingfileinfuji_TC_03() throws IOException, InterruptedException
	 {
		test = extent.createTest("ESKO Website", "Verify uploadingfile");
		 Login login= new Login(driver);
		   login.enterusername(" ");
	       login.enterPassword(" ");
	    	login.clicksignin();
	    	login.clickstartanewjob();
	      Thread.sleep(5000);
	    	login.uploader();
	    	
	
	

}




	}
























