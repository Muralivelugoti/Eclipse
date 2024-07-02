package autobots.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import autobots.pomclasses.Loginpage;
import autobots.pomclasses.Validations;

public class Baseclass {
	public WebDriver driver;

	public WebDriver browserInvoke() throws IOException {
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"E:\\01_EclipsForJava\\Autobots\\src\\main\\java\\autobots\\globalinfo\\globalparametars.Properties");
		pro.load(fis);
		String browser = pro.getProperty("browser");
		
		if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("Edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
			return driver;
	}
	@BeforeMethod(alwaysRun=true)
	public void getLogin() throws IOException, Exception {
		driver = browserInvoke();
		Loginpage lp = new Loginpage(driver);
		lp.goToUrl();
	}
	@AfterMethod(alwaysRun=true)
		public void tearDown() {
		
			driver.close();		
	}
	
	public String getScreenshot(String screenshotname, WebDriver driver) throws IOException {
		TakesScreenshot shot = ((TakesScreenshot) driver);
		File src = shot.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+"//Reports//"+screenshotname+".png");
		FileUtils.copyFile(src, file);
		return System.getProperty("user.dir")+"//Reports//"+screenshotname+".png";
	}
}
