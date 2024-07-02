package autobots.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreportscheck {
	public static ExtentReports extent;
	 ExtentTest test;
	public static ExtentReports getReports() {
		String path = System.getProperty("user.dir")+"//Reports//report.html";
		ExtentSparkReporter reports = new ExtentSparkReporter(path);
		reports.config().setReportName("Autobots");
		reports.config().setDocumentTitle("Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reports);
		extent.setSystemInfo("Tester Name", "Murali");
		return extent;		
	}
}
