package Brandsdal_Cocopanda_DK_Testcases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import com.aventstack.extentreports.Status;

import Brandsdal_Base.Test_Base;
import Esko.utility.Utility;
import Highlight.highlight;

public class Navigation extends Test_Base

{
@Test(priority=1, enabled = true)
	
    public void TC_01() throws IOException, InterruptedException
    {
    	test = extent.createTest("COCOPANDA-DK Website", "Verify that Top Main Categories display on the website");
    	driver.get(Utility.fetchpropertyvalue("cocopanda_dK_URL").toString());
    	Thread.sleep(5000);
    	
    	test.log(Status.INFO, "entering URL");
    	
    	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("first_category_xpath"))));
    	test.log(Status.INFO, "Highlighting first category");
    	
    	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("second_category_xpath"))));
    	test.log(Status.INFO, "Highlighting second category");
    	
    	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("third_category_xpath"))));
    	test.log(Status.INFO, "Highlighting third category");
    	
    	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("fourth_category_xpath"))));
    	test.log(Status.INFO, "Highlighting fourth category");
    	
    	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("fifth_category_xpath"))));
    	test.log(Status.INFO, "Highlighting fifth category");
    	
    	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("sixth_category_xpath"))));
    	test.log(Status.INFO, "Highlighting sixth category");
    	
    	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("seventh_category_xpath"))));
    	test.log(Status.INFO, "Highlighting seventh category");
    	
    	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("eighth_category_xpath"))));
    	test.log(Status.INFO, "Highlighting eight category");
    	
    	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("ninth_category_xpath"))));
    	test.log(Status.INFO, "Highlighting ninth category");
    	
    	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("tenth_category_xpath"))));
    	test.log(Status.INFO, "Highlighting tenth category");
    	
    	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("eleventh_category_xpath"))));
    	test.log(Status.INFO, "Highlighting eleventh category");
    	
    	//test.log(Status.INFO, "Highlighting categories");
    }

@Test(priority=2, enabled = false)

public void TC_02() throws IOException, InterruptedException
{
	test = extent.createTest("COCOPANDA-DK Website", " Hover on  Main Category 1");
	driver.get(Utility.fetchpropertyvalue("cocopanda_dK_URL").toString());
	test.log(Status.INFO, "entering URL");
	WebElement firstMenu = driver.findElement(By.xpath(Utility.fetchlocatorvalue("first_category_xpath")));
	Actions actions = new Actions(driver);
	actions.moveToElement(firstMenu).perform();
	test.log(Status.INFO, "Hovering on first category");
	Thread.sleep(5000);
   WebElement subMenuviewall = driver.findElement(By.xpath(Utility.fetchlocatorvalue("view_all_xpath")));
   actions.moveToElement(subMenuviewall).perform();
   test.log(Status.INFO, "moving to subMenu");
   highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("view_all_xpath"))));
   test.log(Status.INFO, "highlighted the view all link appearing at bottom");
   Thread.sleep(3000);
   highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("brand_list_one_xpath"))));
   //test.log(Status.INFO, "highlighted the first brand list");
   Thread.sleep(3000);
   highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("brand_list_two_xpath"))));
   //test.log(Status.INFO, "highlighted the second brand list");
   Thread.sleep(3000);
   highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("brand_list_third_xpath"))));
   //test.log(Status.INFO, "highlighted the third brand list");
   test.log(Status.INFO, "highlighting brands");
}


@Test(priority=3, enabled = false)

public void TC_03() throws IOException, InterruptedException
{
	test = extent.createTest("COCOPANDA-DK Website", "Main category 1 product list page");
	driver.get(Utility.fetchpropertyvalue("cocopanda_dK_URL").toString());
	test.log(Status.INFO, "entering URL");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("first_category_xpath"))).click();
	test.log(Status.INFO, "clicking on first category");
	Thread.sleep(5000);
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("product_list_xpath"))));
	test.log(Status.INFO, "showing the product list");
	driver.navigate().refresh();
	String ActualURL = driver.getCurrentUrl();
	String ExpectedURL = "https://test.netthandelen.no:7010/";
	Assert.assertNotEquals(ActualURL, ExpectedURL );
	test.log(Status.INFO, "verified URL'S after clicking first category");
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("header_category_xpath"))));
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("filters_xpath"))));
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("sorting_xpath"))));
	driver.navigate().refresh();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("filter_xpath"))).click();
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("brand_xpath"))));
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("color_xpath"))));
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("price_xpath"))));
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("rating_xpath"))));
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("availability_xpath"))));
	test.log(Status.INFO, "highlighting details on a page");
	
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("overall_first_image_xpath"))));
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("first_image_xpath"))));
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("prodcut_name_xpath"))));
	test.log(Status.INFO, "name of the product");
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("product_price_xpath"))));
	test.log(Status.INFO, "price of the product");
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("buy_product_xpath"))));
	test.log(Status.INFO, "Buy button displaying");
}
@Test(priority=4, enabled = false)

public void TC_04() throws IOException, InterruptedException
{
	test = extent.createTest("COCOPANDA-DK Website", "Filter product list by clicking a sub category");
	driver.get(Utility.fetchpropertyvalue("cocopanda_dK_URL").toString());
	test.log(Status.INFO, "entering URL");
	WebElement firstMenu = driver.findElement(By.xpath(Utility.fetchlocatorvalue("first_category_xpath")));
	Actions actions = new Actions(driver);
	actions.moveToElement(firstMenu).perform();
	test.log(Status.INFO, "Hovering on first category");
	Thread.sleep(5000);
	WebElement subMenuviewall = driver.findElement(By.xpath(Utility.fetchlocatorvalue("first_subcategory_xpath")));
	actions.moveToElement(subMenuviewall).perform();
	test.log(Status.INFO, "moving to subMenu");
	Thread.sleep(8000);
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("first_subcategory_xpath"))));
	Thread.sleep(5000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("first_subcategory_xpath"))).click();
	Thread.sleep(8000);
	String ActualURL = driver.getCurrentUrl();
	String ExpectedURL = "https://test.netthandelen.no:7010/";
	Assert.assertNotEquals(ActualURL, ExpectedURL );
	test.log(Status.INFO, "verified URL'S after clicking sub category");
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("product_list_xpath"))));
	test.log(Status.INFO, "showing the product list of subcategory");
	driver.navigate().refresh();
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("header_category_xpath"))));
	test.log(Status.INFO, "highlighting subcategory");
}

@Test(priority=5, enabled = false)

public void TC_06() throws IOException, InterruptedException
{

	test = extent.createTest("COCOPANDA-DK Website", "Filter by color");
	driver.get(Utility.fetchpropertyvalue("cocopanda_dK_URL").toString());
	test.log(Status.INFO, "entering URL");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("first_category_xpath"))).click();
	test.log(Status.INFO, "clicking on first category");
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("filter_xpath"))).click();
	test.log(Status.INFO, "clicking on filter");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("color_arrow_xpath"))).click();
	test.log(Status.INFO, "clicking on color");
	Thread.sleep(5000);
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("color_box_xpath"))));
	Thread.sleep(6000);
    driver.findElement(By.xpath(Utility.fetchlocatorvalue("fourth_color_xpath"))).click();
    Thread.sleep(6000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("fifth_color_xpath"))).click();
	 Thread.sleep(6000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("sixth_color_xpath"))).click();
	 Thread.sleep(6000);
	test.log(Status.INFO, "color filter opened and colors are selected");
	driver.navigate().refresh();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("remove_filter_one_xpath"))).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("remove_filter_two_xpath"))).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("remove_filter_three_xpath"))).click();
	Thread.sleep(6000);
	test.log(Status.INFO, "color filter are removed");

}

@Test(priority=6, enabled = false)

public void TC_07() throws IOException, InterruptedException
{
	test = extent.createTest("COCOPANDA-DK Website", "Filter by price range");
	driver.get(Utility.fetchpropertyvalue("cocopanda_dK_URL").toString());
	test.log(Status.INFO, "entering URL");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("first_category_xpath"))).click();
	test.log(Status.INFO, "clicking on first category");
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("filter_xpath"))).click();
	test.log(Status.INFO, "clicking on filter");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("price_arrow_xpath"))).click();
	test.log(Status.INFO, "clicking on price");
	Thread.sleep(5000);
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("price_box_xpath"))));
	Thread.sleep(6000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("price_range_first_xpath"))).click();
    Thread.sleep(6000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("price_range_second_xpath"))).click();
	 Thread.sleep(6000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("price_range_third_xpath"))).click();
	 Thread.sleep(6000);
	 test.log(Status.INFO, "price filter opened and prices are selected");
	 driver.navigate().refresh();
	 driver.findElement(By.xpath(Utility.fetchlocatorvalue("remove_filter_one_xpath"))).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("remove_filter_two_xpath"))).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("remove_filter_three_xpath"))).click();
	Thread.sleep(6000);
	test.log(Status.INFO, "Price filter are removed");
}

@Test(priority=7, enabled = false)

public void TC_08() throws IOException, InterruptedException
{
	test = extent.createTest("COCOPANDA-DK Website", "Sorting  product list on main category 1 product list page");
	driver.get(Utility.fetchpropertyvalue("cocopanda_dK_URL").toString());
	test.log(Status.INFO, "entering URL");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("first_category_xpath"))).click();
	test.log(Status.INFO, "clicking on first category");
	Thread.sleep(5000);
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("product_list_xpath"))));
	test.log(Status.INFO, "showing the product list");
	 driver.navigate().refresh();
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("subcategory_xpath"))));
	 Thread.sleep(4000);
	 test.log(Status.INFO, "highlighting subcategory field");
	 driver.findElement(By.xpath(Utility.fetchlocatorvalue("subcategory_arrow_xpath"))).click();
	 Thread.sleep(6000);
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("subcategory_first_category_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("subcategory_second_category_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("subcategory_third_category_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("subcategory_fourth_category_xpath"))));
	 test.log(Status.INFO, "highlighting sections under subcategory field");
	 driver.navigate().refresh();
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("best_seller_xpath"))));
	 Thread.sleep(4000);
	 test.log(Status.INFO, "highlighting best seller field");
	 driver.findElement(By.xpath(Utility.fetchlocatorvalue("best_seller_arrow_xpath"))).click();
	 Thread.sleep(6000);
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("bestseller_first_category_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("bestseller_second_category_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("bestseller_third_category_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("bestseller_fourth_category_xpath"))));
	 test.log(Status.INFO, "highlighting sections under bestseller field");
	 driver.navigate().refresh();
	 driver.findElement(By.xpath(Utility.fetchlocatorvalue("filter_xpath"))).click();
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("brand_xpath"))));
	 Thread.sleep(4000);
	 test.log(Status.INFO, "highlighting brand field");
	 driver.findElement(By.xpath(Utility.fetchlocatorvalue("brand_arrow_xpath"))).click();
	 Thread.sleep(6000);
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("brand_first_category_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("brand_second_category_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("brand_third_category_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("brand_fourth_category_xpath"))));
	 test.log(Status.INFO, "highlighting sections under brand field");
	 
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("color_xpath"))));
	 Thread.sleep(4000);
	 test.log(Status.INFO, "highlighting color field");
	 driver.findElement(By.xpath(Utility.fetchlocatorvalue("color_arrow_xpath"))).click();
	 Thread.sleep(6000);
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("fourth_color_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("fifth_color_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("sixth_color_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("seventh_color_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("eight_color_xpath"))));
	 test.log(Status.INFO, "highlighting sections under color field");
	 
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("price_xpath"))));
	 Thread.sleep(4000);
	 test.log(Status.INFO, "highlighting price field");
	 driver.findElement(By.xpath(Utility.fetchlocatorvalue("price_arrow_xpath"))).click();
	 Thread.sleep(6000);
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("price_range_first_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("price_range_second_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("price_range_third_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("price_range_fourth_xpath"))));
	 test.log(Status.INFO, "highlighting sections under price field");
	 

	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("rating_xpath"))));
	 Thread.sleep(4000);
	 test.log(Status.INFO, "highlighting rating field");
	 driver.findElement(By.xpath(Utility.fetchlocatorvalue("rating_arrow_xpath"))).click();
	 Thread.sleep(6000);
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("rating_first_category_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("rating_second_category_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("rating_third_category_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("rating_fourth_category_xpath"))));
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("rating_fifth_category_xpath"))));
	 test.log(Status.INFO, "highlighting sections under rating field");
	 
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("availability_xpath"))));
	 Thread.sleep(4000);
	 test.log(Status.INFO, "highlighting availability field");
	 driver.findElement(By.xpath(Utility.fetchlocatorvalue("availability_arrow_xpath"))).click();
	 Thread.sleep(6000);
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("availability_stock_xpath"))));
	 test.log(Status.INFO, "highlighting stock filter under availability");
}
@Test(priority=8, enabled = false)

public void TC_09() throws IOException, InterruptedException
{
	test = extent.createTest("COCOPANDA-DK Website", "Pagination on product list on main category 1 product list page");
	driver.get(Utility.fetchpropertyvalue("cocopanda_dK_URL").toString());
	test.log(Status.INFO, "entering URL");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("first_category_xpath"))).click();
	test.log(Status.INFO, "clicking on first category");
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("pagination_count_xpath"))));
	test.log(Status.INFO, "highlighting pagination");
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("right_arrow_pagination_xpath"))));
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("right_arrow_pagination_xpath"))).click();
	test.log(Status.INFO, "On clicking right arrow for pagination");
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("left_arrow_pagination_xpath"))));
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("left_arrow_pagination_xpath"))).click();
	test.log(Status.INFO, "On clicking left arrow for pagination");
}

@Test(priority=9, enabled = false)

public void TC_10() throws IOException, InterruptedException
{
	test = extent.createTest("COCOPANDA-DK Website", "Buy button on product for products in product list ");
	driver.get(Utility.fetchpropertyvalue("cocopanda_dK_URL").toString());
	test.log(Status.INFO, "entering URL");
	
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("first_category_xpath"))).click();
	test.log(Status.INFO, "clicking on first category");
	
	
	WebElement html = driver.findElement(By.tagName("html"));
	html.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
	 //highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("overall_first_image_xpath"))));
	
	
	 Thread.sleep(6000); 
	 WebElement elementfirst = driver.findElement(By.xpath(Utility.fetchlocatorvalue("adding_product_to_cart_xpath")));
	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", elementfirst);
	 Thread.sleep(500); 
	 driver.findElement(By.xpath(Utility.fetchlocatorvalue("adding_product_to_cart_xpath"))).click();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("adding_product_to_cart_xpath"))));
	 driver.findElement(By.xpath(Utility.fetchlocatorvalue("adding_product_to_cart_xpath"))).click();
	 
//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",
	 //driver.findElement(By.xpath(Utility.fetchlocatorvalue("adding_product_to_cart_xpath"))).click();
//	test.log(Status.INFO, "adding product to cart");
//	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("item_added_to_your_cart_message_xpath"))));
//	test.log(Status.INFO, "validation message of product added to cart");
//	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("cart_icon_on_top_xpath"))));
}
}



