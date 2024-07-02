package autobots.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Validations {
	WebDriver driver;

	public Validations(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()='Sign in']")
	WebElement signintext;

	@FindBy(xpath = "//label[text()=' Remember my username']")
	WebElement Remembermyusernametext;

	@FindBy(xpath = "//input[@id='chkboxOne']")
	WebElement Remembermyusernamecheckbox;

	@FindBy(xpath = "//label[@for='chkboxTwo']")
	WebElement Iagreetothetermsandprivacypolicytext;

	@FindBy(xpath = "//input[@id='chkboxTwo']")
	WebElement Iagreetothetermsandprivacypolicycheckbox;

	@FindBy(xpath = "//div/a")
	WebElement forgotpassword;

	@FindBy(xpath = "//h1[text()='CGT Academy']")
	WebElement CGTAcademy;

	@FindBy(xpath = "//div//p")
	WebElement paragrapghtext;

	@FindBy(xpath = "//button[@class='submit signInBtn']")
	WebElement signinbutton;

	public String signinTextValidation() throws Exception {
		String signincheck = signintext.getText();
		return signincheck;
	}

	public String rememberMyUserNameTextValidation() {
		String remembertext = Remembermyusernametext.getText();
		return remembertext;
	}

	public String iAgreeToTheTermsAndPrivacyPolicyText() {
		String iagreetext = Iagreetothetermsandprivacypolicytext.getText();
		return iagreetext;
	}

	public String forgotPasswordTextValidation() throws Exception {
		String forgottext = forgotpassword.getText();
		return forgottext;
	}

	public String cgtAcademyTextValidation() throws Exception {
		String cgtacademy = CGTAcademy.getText();
		return cgtacademy;
	}

	public String cgtAcademySubTextValidation() throws Exception {
		String cgtacademysubtext = paragrapghtext.getText();
		return cgtacademysubtext;
	}

	public String signInButtonTextValidation() throws Exception {
		String signinBtext = signinbutton.getText();
		return signinBtext;
	}

	public boolean rememberUsernameCheckBoxUncheckValidation() throws Exception {
		boolean result = Remembermyusernamecheckbox.isSelected();
		return result;
	}

	public boolean rememberUsernameCheckBoxCheckValidation() throws Exception {
		Remembermyusernamecheckbox.click();
		boolean result = Remembermyusernamecheckbox.isSelected();
		return result;
	}
	public boolean iAgreeToTheTermsAndPrivacyPolicyCheckBoxCheckValidation() throws Exception {
		Iagreetothetermsandprivacypolicycheckbox.click();
		boolean result = Iagreetothetermsandprivacypolicycheckbox.isSelected();
		return result;
	}
	public boolean iAgreeToTheTermsAndPrivacyPolicyCheckBoxUncheckValidation() throws Exception {
		boolean result = Iagreetothetermsandprivacypolicycheckbox.isSelected();
		return result;
	}
}
