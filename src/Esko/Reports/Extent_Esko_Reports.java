package Esko.Reports;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Log;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
//import com.relevantcodes.extentreports.LogStatus;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Esko_Reports  {
	
	private static ExtentReports extent;
	private static ExtentTest test;
	private static ExtentHtmlReporter htmlReporter;
	private static String filePath = "./extentreport.html";
	
	
	
	
	
	public static ExtentReports GetExtent(){
		if (extent != null)
        return extent; //avoid creating new instance of html file
        extent = new ExtentReports();		
		extent.attachReporter(getHtmlReporter());
		extent.setSystemInfo("OS", "Window");
        extent.setSystemInfo("Host Name", "BRANDSDAL");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("User Name", "Pankaj Mehta");
        extent.setSystemInfo("Browser Name", "Chrome");
       
        

		return extent;
	}

	
	private static ExtentHtmlReporter getHtmlReporter() {
	
        htmlReporter = new ExtentHtmlReporter(filePath);
        htmlReporter.loadXMLConfig("./extent-config.xml");
        //htmlReporter.setAppendExisting(true);
        //return htmlReporter;
		
	// make the charts visible on report open
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("BRANDSDAL automation report");
       htmlReporter.config().setReportName("Regression suit for BRANDSDAL");
       htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
        return htmlReporter;
	}
	
	
	
	
	public static ExtentTest createTest(String name, String description){
		test = extent.createTest(name, description);
		
		
		return test;
		
		
		
		
	}
}




