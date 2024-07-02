package autobots.buildframework;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import autobots.datadriven.Exceldatadriven;
import autobots.pomclasses.Loginpage;
import autobots.resources.Baseclass;

public class LoginpagevalidationsTest extends Baseclass {

	@Test
	public void loginValidation() throws Exception {
		Exceldatadriven dd = new Exceldatadriven();
		String sname = "Login Details";
		String cname = "Data";
		String ctext = "Valid Login";
		ArrayList<String> data = dd.dataDriven(sname, cname, ctext);
		Loginpage lp = new Loginpage(driver);
		String username = data.get(0);
		String password = data.get(1);
		lp.goToLogin(username, password);
	}
	@Test
	public void loginWithInvalidValidation() throws Exception {
		Exceldatadriven dd = new Exceldatadriven();
		String sname = "Login Details";
		String cname = "Data";
		String ctext = "Invalid Username";
		ArrayList<String> data = dd.dataDriven(sname, cname, ctext);
		Loginpage lp = new Loginpage(driver);
		String username = data.get(0);
		String password = data.get(1);
		lp.goToLogin(username, password);
	}
	@Test
	public void alertValidationTest() throws IOException {
		Exceldatadriven dd = new Exceldatadriven();
		String sname = "Login Details";
		String cname = "Data";
		String ctext = "Valid Login";
		ArrayList<String> data = dd.dataDriven(sname, cname, ctext);
		Loginpage lp = new Loginpage(driver);
		String username = data.get(0);
		String password = data.get(1);
		String alert = lp.alertValidation(username, password);
		Assert.assertEquals(alert, "Logged in successfully");
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void alertValidationInvalidTest() throws IOException {
		Exceldatadriven dd = new Exceldatadriven();
		String sname = "Login Details";
		String cname = "Data";
		String ctext = "Valid Login";
		ArrayList<String> data = dd.dataDriven(sname, cname, ctext);
		Loginpage lp = new Loginpage(driver);
		String username = data.get(1);
		String password = data.get(1);
		String alert = lp.validationOfAlertTextInvalidLogin(username, password);
		Assert.assertEquals(alert, "Please enter valid username and password");
		driver.switchTo().alert().accept();
	}
	
}
