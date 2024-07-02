package autobots.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import autobots.utils.Abstraccomponents;

public class Loginpage extends Abstraccomponents {

	WebDriver driver;
	

	public Loginpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='inputUsername']")
	WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;	
	
	@FindBy(xpath= "//button[@class='submit signInBtn']")
	WebElement signinbutton;
	
	
	
	public void goToUrl() {
		driver.get("https://banavaths45.github.io/selinium/");
	}
	public void goToLogin(String userID, String pass) {
		username.sendKeys(userID);
		password.sendKeys(pass);
		signinbutton.click();
		alertAccept(driver);
		
	}
	public String alertValidation(String userID, String pass) {
		username.sendKeys(userID);
		password.sendKeys(pass);
		signinbutton.click();	
		String alert = driver.switchTo().alert().getText();
		return alert;
	}
	public String validationOfAlertTextInvalidLogin(String userID, String pass) {
		username.sendKeys(userID);
		password.sendKeys(pass);
		signinbutton.click();	
		String alert = driver.switchTo().alert().getText();
		return alert;
	}
	


}
