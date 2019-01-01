package Highlight;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class highlight 
{


	 
	public static void highlightElement(WebDriver driver, WebElement element) throws InterruptedException 
	{
      
        	JavascriptExecutor js = (JavascriptExecutor) driver;
      
        	js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 5px solid black;');", element); 
            Thread.sleep(5000);
            //try 
            //{
            //Thread.sleep(1000);
            //} 
            //catch (InterruptedException e) 
            //{
//
           // System.out.println(e.getMessage());
           // } 

            //js.executeScript("arguments[0].setAttribute('style','border: solid 2px yellow');", element); 

          }
   } 
            
       

        









