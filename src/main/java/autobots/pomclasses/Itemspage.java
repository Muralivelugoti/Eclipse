package autobots.pomclasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import autobots.utils.Abstraccomponents;

public class Itemspage extends Abstraccomponents{
	WebDriver driver;
	public Itemspage(WebDriver driver) {
		super(driver);		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h1[text()='CGT']")
	WebElement cgtlogo;
	
	@FindBy(xpath = "//a[text()='GreenKart']")
	WebElement greenkartbutton;
	
	@FindBy(xpath = "//div[@class='logo']")
	WebElement greenkartlogo;
	
	@FindBy(xpath = "//input[@class='search']")
	WebElement searchbar;
	
	@FindBy(xpath = "//button[@class='btn btn-success p-2 searchbtn']")
	WebElement searchbarbutton;
	
	@FindBy(xpath = "(//div[@class='price']/div)[1]")
	WebElement pricetext;
	@FindBy(xpath = "(//div[@class='price']/div)[2]")
	WebElement itemtext;
	
	@FindBy(xpath = "//button[@class='cartbutton']")
	WebElement addtocartbutton;	
	
	@FindBy(xpath = "//div[@class='shopping-bag']")
	WebElement shoppingbag;
	
	@FindBy(xpath = "//p[@class='cart']")
	WebElement shoppingbagemptytext;
	
	@FindBy(xpath = "//button[@class='proceed-btn']")
	WebElement proceedtochekout;
	
	
	//baggage list
	
	@FindBy(xpath="//div[@class='cartNames']")
	List<WebElement> vegslist;
	
	//Close
	
	public String urlValidatons() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public String itemsPageWebTitleValidation() {
		String webtitle = driver.getTitle();
		return webtitle;
	}
	
	public String cgtLogoTextValidation() {
		String cgtlogotext = cgtlogo.getText();
		return cgtlogotext;
	}
	public String greenkartButtonTextValidation() {
		String greenkartButtontext = greenkartbutton.getText();
		return greenkartButtontext;
	}
	
	public String greenkartLogoTextValidation() {
		String greenkartlogotext = greenkartlogo.getText();
		return greenkartlogotext;
	}
	
	public boolean searchBarValidation() {
		boolean searchbarvisible = searchbar.isDisplayed();
		return searchbarvisible;
	}
	
	public boolean searchButtonValidation() {
		boolean searchbuttonvisible = searchbarbutton.isDisplayed();
		return searchbuttonvisible;
	}	
	public boolean shoppingBagIconValidation() {
		boolean shoppingbagvisible = shoppingbag.isDisplayed();
		return shoppingbagvisible;
	}	
	
	public void shoppingBagClickValidation() {
		shoppingbag.click();		
	}
	public String shoppingBagEmptyTextValidation() {
		shoppingbag.click();
		String shoppingbagcartempty = shoppingbagemptytext.getText();
		return shoppingbagcartempty;
		}
	public String addToCartButtonTextValidation() {
		String addtocardtext = addtocartbutton.getText();
		return addtocardtext;
		}
	public String addToCartButtonAfterClickTextValidationTest() {
		addtocartbutton.click();
		String addtocardtextafterclick = addtocartbutton.getText();
		return addtocardtextafterclick;
		}
	
	public void searchIteamAndAddToCart(String veg, String veg2, String veg3) throws InterruptedException {
		searchbar.sendKeys(veg);
		addtocartbutton.click();
		searchbar.clear();
		searchbar.sendKeys(veg2);
		addtocartbutton.click();
		searchbar.clear();
		searchbar.sendKeys(veg3);
		addtocartbutton.click();
	}	
	
	public ArrayList<String> myVegsList() {
		ArrayList<String> myveg = new ArrayList<String>();
		for(int i=0;i<vegslist.size();i++) {
			String[] item = vegslist.get(i).getText().split("\\s+");
			String item1 = item[0].trim();
			myveg.add(item1);

		}
			System.out.println(myveg);
		return myveg;
	}	
	public String validateProceedToCartButtonText() {
		String proceedtocarttext = proceedtochekout.getText();
		return proceedtocarttext;
	}

	public void proceedToCartCheckOut() {
		proceedtochekout.click();
	}
}
