package Esko.pages;

//import java.awt.List;
import java.util.List;
//import java.util.concurrent.TimeUnit;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

import Esko.utility.Utility;
import Highlight.highlight;

public class Login extends highlight

{

 WebDriver driver;
 
 public Login(WebDriver driver)
 {
	 this.driver=driver;
	 
 }
 
public String Jobnumber;
public String Jobnumberprintjob;
public String Jobsubmittednumber;
public String statusofthejob;
public String addvaluecategorydata = "Test First";

public void enterusername(String uname) throws IOException
{
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("login_user_name_xpath"))).sendKeys("client@_selenium.test.com");
	
	
}

public void enterusernamedao(String uname) throws IOException
{
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("login_user_name_xpath"))).sendKeys("dao@_selenium.test.com");
}

public void enterusernameaddingacategory(String uname) throws IOException
{
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("login_user_name_xpath"))).sendKeys("printmgr@_selenium.test.com");

}


public void enterPassword(String Pass) throws IOException
{
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("login_password_xpath"))).sendKeys("P@sswordD");
}


public void enterPassworddao(String Pass) throws IOException
{
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("login_password_xpath"))).sendKeys("P@sswordD");
}


public void enterPasswordaddingacategory(String Pass) throws IOException
{
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("login_password_xpath"))).sendKeys("P@sswordD");
}



public void clicksignin() throws IOException
{

	driver.findElement(By.xpath(Utility.fetchlocatorvalue("login_signin_xpath"))).click();

}

public void clicksignindao() throws IOException
{

	driver.findElement(By.xpath(Utility.fetchlocatorvalue("login_signin_xpath"))).click();

}


public void clickstartanewjob() throws IOException
{

	driver.findElement(By.xpath(Utility.fetchlocatorvalue("start_a_new_job_xpath"))).click();

}


public void clickprint() throws IOException
{

	driver.findElement(By.xpath(Utility.fetchlocatorvalue("print_job_xpath"))).click();

}

public void enterjobname(String uname) throws IOException
{
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("job_detail_xpath"))).sendKeys("pankaj");
}

public void enterjobreference(String uname) throws IOException
{
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("job_reference_xpath"))).sendKeys("pankajmehta");
}

public void projectcode(String uname) throws IOException
{
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("project_code_xpath"))).sendKeys("pankajmehtatest");
}

public void addingcategoryothers() throws IOException
{
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("others_xpath"))).click();
}

public void catalogue() throws IOException
{
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("catalogue_xpath"))).click();
}








public void jobduedate() throws IOException, InterruptedException
{
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("due_date_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("due_date_next_arrow_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("due_date_select_xpath"))).click();
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("due_time_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("close_xpath"))).click();
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("high_priority_xpath"))).click();
	
}


public void duetime() throws IOException, InterruptedException
{
	WebElement dropdown = driver.findElement(By.xpath(Utility.fetchlocatorvalue("due_time_xpath")));
	dropdown.click();
	List <WebElement> options = dropdown.findElements(By.xpath(Utility.fetchlocatorvalue("due_time_options_xpath")));
	options.get(2).click();

	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("high_priority_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("quote_Required_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("upload_file_xpath"))).click();

}
    

public void addfile() throws InterruptedException, IOException
{ 

   driver.switchTo().frame("uploadframe");
    Thread.sleep(5000);
    //driver.findElement(By.xpath(Utility.fetchlocatorvalue("upload_box_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("upload_add_file_xpath"))).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("upload_the_file_id"))).click();
	Thread.sleep(5000);
	Runtime.getRuntime().exec("C:\\Users\\pankaj.mehta\\Desktop\\AutoIT\\2.exe");
}	
	
public void Outsourcejobcreation() throws IOException, InterruptedException
{
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("others_xpath"))).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("outsource_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("job_name_xpath"))).sendKeys("outsource automation in job detail field");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("job_reference_xpath"))).sendKeys("outsource automation in job reference field");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("project_code_xpath"))).sendKeys("outsource automation in job project code field");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("job_description_xpath"))).sendKeys("outsource job description");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("campaign_xpath"))).sendKeys("outsource campaign");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("product_code_xpath"))).sendKeys("outsource projectcode");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("high_priprity_pleasenote_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("fsc_coc_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("quantityone_xpath"))).sendKeys("1238");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("quantitytwo_xpath"))).sendKeys("1239");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("quantitythree_xpath"))).sendKeys("1230");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("quantityfour_xpath"))).sendKeys("12334");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("quantityfive_xpath"))).sendKeys("123565");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("quantitysix_xpath"))).sendKeys("12323434");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("flexispec_xpath"))).click();
	Thread.sleep(15000);
	Select jobtype = new Select(driver.findElement(By.xpath(Utility.fetchlocatorvalue("job_type_selection_xpath"))));
	jobtype.selectByVisibleText("Brochures");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("pagination_no_ofpanels_xpath"))).sendKeys("12");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("other_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("other_box_xpath"))).sendKeys("otherdata");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("black_inks_xpath"))).click();
	
	
	
	
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("delivery_details_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("customer_name_xpath"))).sendKeys("customer name test");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("contact_name_xpath"))).sendKeys("contactnametest");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("phone_xpath"))).sendKeys("15424");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("address_one_xpath"))).sendKeys("test addess one");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("address_two_xpath"))).sendKeys("textaddresstwo");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("city_xpath"))).sendKeys("sydney");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("postcode_xpath"))).sendKeys("3000");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("note_xpath"))).sendKeys("test note");
	Select deliverymethod = new Select(driver.findElement(By.xpath(Utility.fetchlocatorvalue("delivery_method_xpath"))));
	deliverymethod.selectByVisibleText("Courier");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("quantity_xpath"))).sendKeys("100");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("addbutton_delivery_xpath"))).click();
	
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("delete_button_xpath"))));
	//WebElement deletebutton=driver.findElement(By.xpath(Utility.fetchlocatorvalue("delete_button_xpath")));
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("arguments[0].style.border='2px groove green'", deletebutton);	
	
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("submitbutton_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("submit_job_xpath"))).click();
	
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("job_number_submit_job_xpath"))));
	Jobnumber=driver.findElement(By.xpath(Utility.fetchlocatorvalue("job_number_submit_job_xpath"))).getText();
		//show the job number
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("hamburgermenu_xpath"))).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("logout_xpath"))).click();	

	
}

public void SendforQuoteP3() throws IOException, InterruptedException
{
  
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("searchboxicon_xpath"))).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("jobno_xpath"))).sendKeys(Jobnumber);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("filter_xpath"))).click();
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("status_xpath"))));
	statusofthejob=driver.findElement(By.xpath(Utility.fetchlocatorvalue("status_xpath"))).getText();
	//show the status
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("first_job_number_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("i_am_done_proceed_xpath"))).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("request_quote_from_p3_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("fuji_logo_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("searchboxicon_xpath"))).click();
	Thread.sleep(5000);
	driver.navigate().refresh();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("jobno_xpath"))).sendKeys(Jobnumber);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("filter_xpath"))).click();
	Thread.sleep(9000);
	WebElement image1 = driver.findElement(By.xpath(Utility.fetchlocatorvalue("green_tick_image_xpath")));
    
    Boolean imageLoaded1 = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", image1);
    if (!imageLoaded1)
    {
    	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("green_tick_image_xpath"))));   
    	System.out.println("green tick is present");
    }
    else
    {
        System.out.println("No green tick");
    }


}



/////////////Adding category item

public void Addingacategory() throws IOException, InterruptedException
{
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("hamburgermenu_xpath"))).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("admin_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("manage_client_contract_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("manage_catalogue_items_xpath"))).click();
	Select contractnumber = new Select(driver.findElement(By.xpath(Utility.fetchlocatorvalue("contract_xpath"))));
	contractnumber.selectByVisibleText("Selenium Auto Test - D210");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("add_new_category_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("add_catalogue_category_xpath"))).sendKeys(addvaluecategorydata);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("save_change_xpath"))).click();

	
}

public void clickOnTableElement(By tableLocator, String cellData, int clickIndex, int clickColumnNo) {
    try {
           String elementText = "";
           List<WebElement> colelements;
           WebElement webElem = driver.findElement(tableLocator);
           //findelement(tableLocator);
           if (null != webElem) {
                 List<WebElement> rows = webElem.findElements(By.tagName("tr"));
                 for (int i = 0; i < rows.size(); i++) {
                        if (rows.get(i).isDisplayed()) {
                               colelements = rows.get(i).findElements(By.tagName("td"));
                               if (colelements.size() > (clickColumnNo - 2) && colelements.size() > 0) {
                                      for (int columns = 0; columns < colelements.size(); columns++) {
                                             elementText = colelements.get(columns).getText();
                                             if (!elementText.isEmpty() && elementText.equalsIgnoreCase(cellData)) {
                                                    if (clickIndex > 0)
                                                           colelements.get(clickColumnNo - 1).findElements(By.xpath(".//*"))
                                                                        .get(clickIndex-1).click();
                                                    else
                                                           colelements.get(clickColumnNo - 1).click();
                                                    //setReportVariables("Click", "Passed", "Element is clicked on table");
                                                    //Log.info("Element is clicked");
                                                    break;
                                             }
                                      }
                               }
                        }
                 }
           } 
           else {
                // setReportVariables("Click", "Failed", "Element is missing");
                 //Log.info("Element is missing");
           }
    } 
    catch (Exception ex) {
           //setReportVariables("Click", "Failed", "Exception occure in clicking in table " + ex.getMessage());
           //Log.info("Exception occure in clicking in table " + ex.getMessage());
    }

 }
    



public void cataloguejobcreation() throws IOException, InterruptedException{
	
Thread.sleep(7000);
 driver.findElement(By.xpath(Utility.fetchlocatorvalue("add_new_category_xpath"))).click();
 driver.findElement(By.xpath(Utility.fetchlocatorvalue("template_name_xpath"))).sendKeys("Test Template");
 driver.findElement(By.xpath(Utility.fetchlocatorvalue("template_description_xpath"))).sendKeys("Test Template description");
 driver.findElement(By.xpath(Utility.fetchlocatorvalue("thumbnail_xpath"))).sendKeys("C:\\Users\\pankaj.mehta\\Desktop\\Final Merge sheet.xlsx");
 driver.findElement(By.xpath(Utility.fetchlocatorvalue("number_of_impression_xpath"))).sendKeys("1000");
 Thread.sleep(7000);
 driver.findElement(By.xpath(Utility.fetchlocatorvalue("add_impression_xpath"))).click();
 driver.findElement(By.xpath(Utility.fetchlocatorvalue("save_changes_xpath"))).click();
 driver.findElement(By.xpath(Utility.fetchlocatorvalue("hamburgermenu_xpath"))).click();
Thread.sleep(5000);
driver.findElement(By.xpath(Utility.fetchlocatorvalue("logout_xpath"))).click();

}

public void cataloguepagedata() throws IOException, InterruptedException
{
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("catalogue_job_name_xpath"))).sendKeys("outsource automation in job detail field");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("catalogue_job_reference_xpath"))).sendKeys("outsource automation in job project code field");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("catalogue_project_code_xpath"))).sendKeys("outsource automation in job project code field");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("due_date_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("due_date_next_arrow_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("due_date_select_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("close_xpath"))).click();
	WebElement dropdown = driver.findElement(By.xpath(Utility.fetchlocatorvalue("due_time_xpath")));
	dropdown.click();
	List <WebElement> options = dropdown.findElements(By.xpath(Utility.fetchlocatorvalue("due_time_options_xpath")));
	options.get(2).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("high_priority_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("catalogue_quote_required_xpath"))).click();
	Thread.sleep(2000);
	
	//WebElement dropdownsecond = driver.findElement(By.xpath(Utility.fetchlocatorvalue("category_selection_xpath")));
	//dropdownsecond.click();
	//List <WebElement> optionssecond = dropdownsecond.findElements(By.xpath(Utility.fetchlocatorvalue("category_selection_options_xpath")));
	//optionssecond.get(2).isSelected();
	//optionssecond.get(4).click();
	
	//Thread.sleep(4000);
	
	//WebElement dropdownthird = driver.findElement(By.xpath(Utility.fetchlocatorvalue("item_selection_xpath")));
	//dropdownthird.click();
	//List <WebElement> optionsthird = dropdownsecond.findElements(By.xpath(Utility.fetchlocatorvalue("item_selection_options_xpath")));
	//optionsthird.indexOf(2);
	
	//Thread.sleep(4000);
	
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("quantity_xpath"))).sendKeys("10");
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("delivery_details_xpath"))).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("deliver_to_me_xpath"))).click();
	
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("submitbutton_xpath"))).click();
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("submit_job_xpath"))).click();
	//Thread.sleep(5000);
	//Jobsubmittednumber=driver.findElement(By.xpath(Utility.fetchlocatorvalue("job_number_submit_job_xpath"))).getText();
	
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("hamburgermenu_xpath"))).click();
	//Thread.sleep(5000);
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("logout_xpath"))).click();

}



public void search() throws IOException, InterruptedException

{
	//search for more than one result
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("search_job_xpath"))).sendKeys("0");
	//Thread.sleep(5000);
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("search_icon_xpath"))).click();
	
	//highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("number_of_jobs_xpath"))));
	
	
	//search for one match
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("search_job_xpath"))).sendKeys("SAT000050162");
	//Thread.sleep(5000);
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("search_icon_xpath"))).click();
	//highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("job_summary_text_xpath"))));
	
	//search for no match
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("search_job_xpath"))).sendKeys("#!#!#@");
	//Thread.sleep(5000);
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("search_icon_xpath"))).click();
	//highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("no_job_found_xpath"))));
	
	
	
	
	
	
	
	//WebElement numberofjobs=driver.findElement(By.xpath(Utility.fetchlocatorvalue("number_of_jobs_xpath")));
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//Thread.sleep(5000);
	//js.executeScript("arguments[0].style.border='3px solid red'", numberofjobs);
	
	//JavascriptExecutor js = (JavascriptExecutor) driver;
    
	//js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", "element"); 
    //Thread.sleep(5000);
	
	
	
}

public void uploader() throws IOException, InterruptedException
{
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("print_job_xpath"))).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("job_detail_xpath"))).sendKeys("outsource automation in job detail field");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("job_reference_xpath"))).sendKeys("outsource automation in job reference field");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("project_code_xpath"))).sendKeys("outsource automation in job project code field");
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("due_date_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("due_date_next_arrow_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("due_date_select_xpath"))).click();
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("due_time_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("close_xpath"))).click();
	
	WebElement dropdown = driver.findElement(By.xpath(Utility.fetchlocatorvalue("due_time_xpath")));
	dropdown.click();
	List <WebElement> options = dropdown.findElements(By.xpath(Utility.fetchlocatorvalue("due_time_options_xpath")));
	options.get(2).click();
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("high_priority_xpath"))).click();
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("quote_Required_xpath"))).click();
	
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("upload_file_xpath"))).click();
	Thread.sleep(5000);
	
	
	//1.WebElement uploadElement = driver.findElement(By.xpath(Utility.fetchlocatorvalue("what_xpath")));
	//uploadElement.click();
	//Thread.sleep(7000);
	//Runtime.getRuntime().exec("C:\\Users\\pankaj.mehta\\Desktop\\PMOP\\Uploadfile.exe");
	
	
	//2.WebElement uploadElement = driver.findElement(By.xpath(Utility.fetchlocatorvalue("what_xpath")));
	//uploadElement.sendKeys("C:\\Users\\pankaj.mehta\\Desktop\\Final Merge sheet.xlsx");
	//Thread.sleep(5000);
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("upload_and_savefile_xpath"))).click();
	
	
	//3.driver.findElement(By.xpath(Utility.fetchlocatorvalue("what_xpath"))).sendKeys("C:\\Users\\pankaj.mehta\\Desktop\\Final Merge sheet.xlsx");
	
	driver.switchTo().frame("uploadframe");
    Thread.sleep(5000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("what_xpath"))).click();
	//for one file upload scenario
	//Runtime.getRuntime().exec("C:\\Users\\pankaj.mehta\\Desktop\\AutoIT\\2.exe");
	
	//for wrong file upload (Cancel scenario)
	// invalid file
	Runtime.getRuntime().exec("C:\\Users\\pankaj.mehta\\Desktop\\Invalid files\\Invalid files.exe");
	Thread.sleep(5000);
	// click on add files button
    driver.findElement(By.xpath(Utility.fetchlocatorvalue("what_xpath"))).click();
    //browse other correct file
	Runtime.getRuntime().exec("C:\\Users\\pankaj.mehta\\Desktop\\AutoIT\\2.exe");
	Thread.sleep(5000);
	//highlight wrong error mesage
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("wrong_upload_file_text_xpath"))));
	//click on cancel
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("cancel_xpath"))).click();
	
	
	//upload and save file
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("what_xpath"))).click();
	Runtime.getRuntime().exec("C:\\Users\\pankaj.mehta\\Desktop\\Invalid files\\Invalid files.exe");
	Thread.sleep(5000);
	 driver.findElement(By.xpath(Utility.fetchlocatorvalue("what_xpath"))).click();
	 Runtime.getRuntime().exec("C:\\Users\\pankaj.mehta\\Desktop\\AutoIT\\2.exe");
	Thread.sleep(5000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("upload_and_savefile_xpath"))).click();
	Thread.sleep(9000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("upload_file_xpath"))).click();
	driver.switchTo().frame("uploadframe");
	highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("remove_xpath"))));
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("remove_xpath"))).click();
	driver.switchTo().defaultContent();
	Thread.sleep(12000);
	driver.findElement(By.xpath(Utility.fetchlocatorvalue("job_details_xpath"))).click();
	Thread.sleep(12000);
	Alert alertOK = driver.switchTo().alert();
	alertOK.accept();
	
	
	
	
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("second_add_xpath"))).click();
	
	
	
	
	
	
	
	
	//Thread.sleep(15000);
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("upload_and_savefile_xpath"))).click();
	//Thread.sleep(5000);
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("quantity_xpath"))).sendKeys("10");
	//Thread.sleep(5000);
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("proof_required_xpath"))).click();
	//Thread.sleep(5000);
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("delivery_details_xpath"))).click();
	//Thread.sleep(5000);
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("delivery_option_one_xpath"))).click();
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("submitbutton_xpath"))).click();
	//driver.findElement(By.xpath(Utility.fetchlocatorvalue("submit_job_xpath"))).click();
  //highlight.highlightElement(driver, driver.findElement(By.xpath(Utility.fetchlocatorvalue("job_number_submit_job_xpath"))));
  //Jobnumberprintjob=driver.findElement(By.xpath(Utility.fetchlocatorvalue("job_number_submit_job_xpath"))).getText();
	//show the job number
 //driver.findElement(By.xpath(Utility.fetchlocatorvalue("hamburgermenu_xpath"))).click();
 //Thread.sleep(5000);
 //driver.findElement(By.xpath(Utility.fetchlocatorvalue("logout_xpath"))).click();
 
 
 
 
	  
}	
	







}





















































































