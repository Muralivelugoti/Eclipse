package autobots.buildframework;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import autobots.pomclasses.Loginpage;
import autobots.pomclasses.Validations;
import autobots.resources.Baseclass;

public class ValidationsTest extends Baseclass {
	@Test
	public void urlValidationTest() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url,"https://banavaths45.github.io/selinium/");
	}
	@Test
	public void webpageTitleValidationTest() {
		String webpagetitle = driver.getTitle();
		Assert.assertEquals(webpagetitle,"React App");
	}
	@Test
	public void signinTextValidationTest() throws Exception {
		Validations valid = new Validations(driver);
		String signincheck =valid.signinTextValidation();
		Assert.assertEquals(signincheck, "Sign in");
	}
	
	
	@Test
	public void forgotPasswordTextValidationTest() throws Exception  {
		Validations valid = new Validations(driver);
		String forgottext =valid.forgotPasswordTextValidation();
		Assert.assertEquals(forgottext,"Forgot your password?");
		}
	@Test
	public void cgtAcademyTextValidationTest() throws Exception  {
		Validations valid = new Validations(driver);
		String cgtacademy =valid.cgtAcademyTextValidation();
		Assert.assertEquals(cgtacademy,"CGT Academy");
		}
	@Test
	public void cgtAcademySubTextValidationTest() throws Exception  {
		Validations valid = new Validations(driver);
		String cgtacademysubtext =valid.cgtAcademySubTextValidation();
		Assert.assertEquals(cgtacademysubtext,"An Academy to Learn Earn & Shine in your QA Career");
		}
	@Test
	public void signInButtonTextValidationTest() throws Exception  {
		Validations valid = new Validations(driver);
		String signinBtext =valid.signInButtonTextValidation();
		Assert.assertEquals(signinBtext,"Sign In");
		}
	@Test(priority=1)
	public void rememberUsernameCheckBoxUnchechValidationTest() throws Exception {
		Validations valid = new Validations(driver);
		boolean status =valid.rememberUsernameCheckBoxUncheckValidation();
		Assert.assertEquals(status,false);
		}
	@Test(priority=2)
	public void rememberUsernameCheckBoxCheckValidationTest() throws Exception {
		Validations valid = new Validations(driver);
		boolean status =valid.rememberUsernameCheckBoxCheckValidation();
		Assert.assertEquals(status,true);
		}
	@Test(priority=4)
	public void iAgreeToTheTermsAndPrivacyPolicyCheckBoxCheckValidationTest() throws Exception {
		Validations valid = new Validations(driver);
		boolean value =valid.iAgreeToTheTermsAndPrivacyPolicyCheckBoxCheckValidation();
		Assert.assertEquals(value,true);
		}
	@Test(priority=3)
	public void iAgreeToTheTermsAndPrivacyPolicyCheckBoxUncheckValidationTest() throws Exception {
		Validations valid = new Validations(driver);
		boolean value =valid.iAgreeToTheTermsAndPrivacyPolicyCheckBoxUncheckValidation();
		Assert.assertEquals(value,false);
		}

		
	
}
