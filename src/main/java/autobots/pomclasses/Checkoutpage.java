package autobots.pomclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import autobots.utils.Abstraccomponents;

public class Checkoutpage extends Abstraccomponents {

	WebDriver driver;
	
	public Checkoutpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div//h1[text()='CGT']")
	WebElement cgtlogo;
	
	@FindBy(xpath = "//div[@class='logo']")
	WebElement greenkartlogo;
	
	@FindBy(xpath = "//a[@class='active']")
	WebElement greenkartbutton;
	
	@FindBy(xpath = "//input[@class='search']")
	WebElement searchbar;
	
	@FindBy(xpath = "//button[@class='btn btn-success p-2 searchbtn']")
	WebElement searchbutton;
	
	@FindBy(xpath = "//input[@class='promoCode']")
	WebElement promocode;
	
	@FindBy(xpath = "//button[@class='promoBtn']")
	WebElement promocodeapply;
	
	@FindBy(xpath = "//button[@class='cartbutton1']")
	WebElement placeorder;
	
	@FindBy(xpath = "//div//h3")
	WebElement successmsg;
	
	@FindBy(xpath = "//div//h4")
	WebElement close;
	
	@FindBy(xpath = "//table[@class=\"table\"]")
	WebElement itemslisttable;
	
	@FindBy(xpath = "//table[@class=\"table\"]/thead/tr/th[3]")
	WebElement productname;
	
	@FindBy(xpath = "//tbody//tr/td[2]")
	List<WebElement> items;
	
	@FindBy(xpath = "//tbody//td[4]")
	List<WebElement> pricelist;
	
	@FindBy(xpath = "//b[@class='totAmt']")
	WebElement totalprice;
	
	
	public String validationOfURL() {
		String URL = driver.getCurrentUrl();
		return URL;
	}
	public String validationOfWebpageTitle() {
		String webtitle = driver.getTitle();
		return webtitle;
	}
	public String cgtLogoTextValidation() {
		String cgtlogotext = cgtlogo.getText();
		return cgtlogotext;
	}	
	public String greenkartLogoTextValidation() {
		String greenkartlogotext = greenkartlogo.getText();
		return greenkartlogotext;
	}
	
	public void applyPromoCode(String code) {
		promocode.sendKeys(code);
		promocodeapply.click();
		alertAccept(driver);
		scrolling(driver);
	}
	
	public String placeOrderButtonText() {
		String placeordertext = placeorder.getText();
		return placeordertext;
	}
	By po = By.xpath("//button[@class='cartbutton1']");
	public void navigateToPlaceOrder() throws InterruptedException {
		Thread.sleep(2000);
		placeorder.click();
	}
	
	public String validationOfSuccessMessageText() throws InterruptedException {		
		String msgtext = successmsg.getText();
		return msgtext;
	}	
	
	public List<String> itemsListValidation() {
		List<String> itemlist = new ArrayList();
			for(WebElement mylist : items) {
				String myarr = mylist.getText();
				System.out.println(myarr);
				itemlist.add(myarr);				
			}			
			System.out.println(itemlist);
			return itemlist;
	}	
	public void popupClose() {
		close.click();
	}
	
	//Price validation in checkout page *********************************************************
	
	public float priceListValidationWithTotal() {
		float sum=0.00f;
		List<Float> values = new ArrayList<Float>();
		for(WebElement prList : pricelist) {
			String pricetext = prList.getText();
			values.add(Float.parseFloat(pricetext));
		}
		for(float i : values)
			sum+=i;
		System.out.println(sum);
		return sum;
	}
	
	public float totalPrice() {
		String[] price = totalprice.getText().split(":");
		String v1 = price[1].trim();	
		float value = Float.parseFloat(v1);
		System.out.println(value);
		return value;
	}
	
	
	
}
