package autobots.buildframework;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import autobots.datadriven.Exceldatadriven;
import autobots.pomclasses.Homepage;
import autobots.pomclasses.Loginpage;
import autobots.resources.Baseclass;

public class HomepagevalidationsTest extends Baseclass {
	
	
	public HomepagevalidationsTest (){
		this.driver = driver;
	}
	@Test
	public void urlValidationTest() throws IOException {
		Exceldatadriven dd = new Exceldatadriven();
		String sname = "Login Details";
		String cname = "Data";
		String ctext = "Valid Login";
		ArrayList<String> data = dd.dataDriven(sname, cname, ctext);
		Loginpage lp = new Loginpage(driver);
		String username = data.get(0);
		String password = data.get(1);
		lp.goToLogin(username, password);
		Homepage hp = new Homepage(driver);
		String webpageurl = driver.getCurrentUrl();
		Assert.assertEquals(webpageurl, "https://banavaths45.github.io/selinium/home");
	}
	@Test
	public void webPageTitleValidationTest() throws IOException {
		Exceldatadriven dd = new Exceldatadriven();
		String sname = "Login Details";
		String cname = "Data";
		String ctext = "Valid Login";
		ArrayList<String> data = dd.dataDriven(sname, cname, ctext);
		Loginpage lp = new Loginpage(driver);
		String username = data.get(0);
		String password = data.get(1);
		lp.goToLogin(username, password);
		Homepage hp = new Homepage(driver);
		String webpagetitle = driver.getTitle();
		Assert.assertEquals(webpagetitle, "React App");
	}
	@Test
	public void logoTextValidationTest() throws IOException {
		Exceldatadriven dd = new Exceldatadriven();
		String sname = "Login Details";
		String cname = "Data";
		String ctext = "Valid Login";
		ArrayList<String> data = dd.dataDriven(sname, cname, ctext);
		Loginpage lp = new Loginpage(driver);
		String username = data.get(0);
		String password = data.get(1);
		lp.goToLogin(username, password);
		Homepage hp = new Homepage(driver);
		String logotext = hp.logoTextValidation();
		Assert.assertEquals(logotext, "CGT");
	}
	@Test
	public void homePageTextValidationTest() throws IOException {
		Exceldatadriven dd = new Exceldatadriven();
		String sname = "Login Details";
		String cname = "Data";
		String ctext = "Valid Login";
		ArrayList<String> data = dd.dataDriven(sname, cname, ctext);
		Loginpage lp = new Loginpage(driver);
		String username = data.get(0);
		String password = data.get(1);
		lp.goToLogin(username, password);
		Homepage hp = new Homepage(driver);
		String hptext = hp.homePageTextValidation();
		Assert.assertEquals(hptext, "I'AM ANURAG");
		
	}
	@Test
	public void welcomeTextValidationTest() throws IOException {
		Exceldatadriven dd = new Exceldatadriven();
		String sname = "Login Details";
		String cname = "Data";
		String ctext = "Valid Login";
		ArrayList<String> data = dd.dataDriven(sname, cname, ctext);
		Loginpage lp = new Loginpage(driver);
		String username = data.get(0);
		String password = data.get(1);
		lp.goToLogin(username, password);
		Homepage hp = new Homepage(driver);
		String welcome = hp.welcomeTextValidation();
		Assert.assertEquals(welcome, "WELCOME TO JAVA SELENIUM COURSE");
		
	}
	
	@Test
		public void greenkartButtonTextValidationTest() throws IOException {
		Exceldatadriven dd = new Exceldatadriven();
		String sname = "Login Details";
		String cname = "Data";
		String ctext = "Valid Login";
		ArrayList<String> data = dd.dataDriven(sname, cname, ctext);
		Loginpage lp = new Loginpage(driver);
		String username = data.get(0);
		String password = data.get(1);
		lp.goToLogin(username, password);
			Homepage hp = new Homepage(driver);
			String greenkarttext = hp.greenkartButtonTextValidation();
			Assert.assertEquals(greenkarttext, "GreenKart");
		}
	@Test
	public void navigateGreenkatPage() throws IOException {
		Exceldatadriven dd = new Exceldatadriven();
		String sname = "Login Details";
		String cname = "Data";
		String ctext = "Valid Login";
		ArrayList<String> data = dd.dataDriven(sname, cname, ctext);
		Loginpage lp = new Loginpage(driver);
		String username = data.get(0);
		String password = data.get(1);
		lp.goToLogin(username, password);
		Homepage hp = new Homepage(driver);
		hp.navigateGreenkart();
		
	}
	
	
}

