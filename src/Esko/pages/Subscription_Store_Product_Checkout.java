package Esko.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import brandsdal.assertion.Compare;
import Esko.utility.Utility;

public class Subscription_Store_Product_Checkout extends Compare

{

	WebDriver driver;
	 
	 public Subscription_Store_Product_Checkout(WebDriver driver)
	 {
		 this.driver=driver;
		 
	 }


	 public void clicksubscriptionstore() throws IOException
	 {

	 	driver.findElement(By.xpath(Utility.fetchlocatorvalue("subscription_store_xpath"))).click();
      
        validatePageURL(driver, "https://test-www.esko.com/en/testpages/store/teststore");
        
	 }





































}
