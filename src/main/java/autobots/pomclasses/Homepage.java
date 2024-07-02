package autobots.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[text()='CGT']")
	WebElement cgtlogo;
	
	@FindBy(xpath = "//a[text()='GreenKart']")
	WebElement greenkartbutton;
	
	@FindBy(xpath = "//div/p")
	WebElement homepagetext;
	
	@FindBy(xpath = "//div[@class='details']//h1")
	WebElement Welcometext;
	
	public String greenkartButtonTextValidation() {
		String greekarttext = greenkartbutton.getText();
		return greekarttext;
	}
	
	public void navigateGreenkart() {
		greenkartbutton.click();
	}
	
	public String logoTextValidation() {
		String logotext = cgtlogo.getText();
		return logotext;
	}

	public String homePageTextValidation() {
		String hptext = homepagetext.getText();
		return hptext;
	}
	public String welcomeTextValidation() {
		String welcome = Welcometext.getText();
		return welcome;
	}
	
	
	
}
