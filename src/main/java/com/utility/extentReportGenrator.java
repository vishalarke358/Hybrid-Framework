package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReportGenrator {
   
	  //ExtentSparkReporter
	public static ExtentReports extent;
	  public static ExtentReports getReports() {
	  String reportPath="C:\\Users\\Lenovo\\eclipse-workspace\\Hybrid_framework\\Reports\\index.html";
	  ExtentSparkReporter reporter=new ExtentSparkReporter(reportPath);
	  reporter.config().setDocumentTitle("Report Hub");
	  reporter.config().setReportName("Automation Test Reports");
	  reporter.config().setTheme(Theme.DARK);
      
      
      //ExtentReports
      ExtentReports  extent=new ExtentReports();
      extent.attachReporter(reporter);
      extent.setSystemInfo("Project Name", "ABC Project");
      extent.setSystemInfo("QA", "XYZ");
      return extent;
      
      
      
  }

}
