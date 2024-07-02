package autobots.pomclasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderspage {
	WebDriver driver;
	
	public Orderspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='text-black']")
	WebElement gotohomepage;
	
	@FindBy(xpath="//div/h1")
	WebElement myorders;
	
	
	@FindBy(xpath="//tbody//td[2]")
	List<WebElement> myorderslist;
	
	
	public String myordersText() {
		String myordertext = myorders.getText();
		return myordertext;
	}
	
	public String gotoGreenkartText() {
		String greenkarttext = gotohomepage.getText();
		return greenkarttext;
	}
	public List<String> myOrdersListValidation() {
		List<String> getlist = new ArrayList();
		for(WebElement orderlist : myorderslist) {
			String prolist = orderlist.getText();
			getlist.add(prolist);
		}
		return getlist;
	}
	public void navigateToHomePage() {
		gotohomepage.click();
	}
}
