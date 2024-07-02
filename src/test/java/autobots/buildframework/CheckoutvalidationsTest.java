package autobots.buildframework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import autobots.datadriven.Exceldatadriven;
import autobots.pomclasses.Checkoutpage;
import autobots.pomclasses.Homepage;
import autobots.pomclasses.Itemspage;
import autobots.pomclasses.Loginpage;
import autobots.resources.Baseclass;

public class CheckoutvalidationsTest extends Baseclass {
	@Test(priority=1)
	public void validationOfURL() throws IOException, InterruptedException {
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
		Itemspage ip = new Itemspage(driver);		
		String vegname ="Brocolli";
		String vegname2 ="Cauliflower";
		String vegname3 ="Cucumber";
		ip.searchIteamAndAddToCart(vegname,vegname2,vegname3);
		ip.shoppingBagClickValidation();
		ip.proceedToCartCheckOut();
		Checkoutpage co = new Checkoutpage(driver);
		String URL = co.validationOfURL();
		Assert.assertEquals(URL, "https://banavaths45.github.io/selinium/greenkart");
	}
	
	@Test(priority=2)
	public void validationOfWebpageTitle() throws IOException, InterruptedException {
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
		Itemspage ip = new Itemspage(driver);		
		String vegname ="Brocolli";
		String vegname2 ="Cauliflower";
		String vegname3 ="Cucumber";
		ip.searchIteamAndAddToCart(vegname,vegname2,vegname3);
		ip.shoppingBagClickValidation();
		ip.proceedToCartCheckOut();
		Checkoutpage co = new Checkoutpage(driver);
		String webtitle = co.validationOfWebpageTitle();
		Assert.assertEquals(webtitle, "React App");
	}
	
	@Test(priority=3)
	public void cgtLogoTextValidation() throws IOException, InterruptedException {
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
		Itemspage ip = new Itemspage(driver);		
		String vegname ="Brocolli";
		String vegname2 ="Cauliflower";
		String vegname3 ="Cucumber";
		ip.searchIteamAndAddToCart(vegname,vegname2,vegname3);
		ip.shoppingBagClickValidation();
		ip.proceedToCartCheckOut();
		Checkoutpage co = new Checkoutpage(driver);
		String cgtlogotext = co.cgtLogoTextValidation();
		Assert.assertEquals(cgtlogotext, "CGT");
	}
	
	@Test(priority=4)
	public void greenkartLogoTextValidation() throws IOException, InterruptedException {
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
		Itemspage ip = new Itemspage(driver);		
		String vegname ="Brocolli";
		String vegname2 ="Cauliflower";
		String vegname3 ="Cucumber";
		ip.searchIteamAndAddToCart(vegname,vegname2,vegname3);
		ip.shoppingBagClickValidation();
		ip.proceedToCartCheckOut();
		Checkoutpage co = new Checkoutpage(driver);
		String greenkartlogotext = co.greenkartLogoTextValidation();
		Assert.assertEquals(greenkartlogotext, "GREENKART");
	}
	
	@Test(priority=5)
	public void applyPromoCodeTest() throws InterruptedException, IOException {
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
		Itemspage ip = new Itemspage(driver);		
		String vegname ="Brocolli";
		String vegname2 ="Cauliflower";
		String vegname3 ="Cucumber";
		ip.searchIteamAndAddToCart(vegname,vegname2,vegname3);
		ip.shoppingBagClickValidation();
		ip.proceedToCartCheckOut();
		Checkoutpage co = new Checkoutpage(driver);
		co.applyPromoCode("murali");
	}
	
	@Test(priority=6)
	public void validationOfPlaceOrderButtonText() throws InterruptedException, IOException {
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
		Itemspage ip = new Itemspage(driver);		
		String vegname ="Brocolli";
		String vegname2 ="Cauliflower";
		String vegname3 ="Cucumber";
		ip.searchIteamAndAddToCart(vegname,vegname2,vegname3);
		ip.shoppingBagClickValidation();
		ip.proceedToCartCheckOut();
		Checkoutpage co = new Checkoutpage(driver);
		co.applyPromoCode("murali");
		String placeordertext = co.placeOrderButtonText();
		Assert.assertEquals(placeordertext, "Place Order");
	}
	
	
	@Test(priority=8)
	public void navigateToPlaceOrderTest() throws InterruptedException, IOException {
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
		Itemspage ip = new Itemspage(driver);		
		String vegname ="Brocolli";
		String vegname2 ="Cauliflower";
		String vegname3 ="Cucumber";
		ip.searchIteamAndAddToCart(vegname,vegname2,vegname3);
		ip.shoppingBagClickValidation();
		ip.proceedToCartCheckOut();
		Checkoutpage co = new Checkoutpage(driver);
		co.applyPromoCode("murali");
		co.navigateToPlaceOrder();
	}
	
	@Test(priority=8)
	public void validationOfSuccessMessageText() throws InterruptedException, IOException {
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
		Itemspage ip = new Itemspage(driver);		
		String vegname ="Brocolli";
		String vegname2 ="Cauliflower";
		String vegname3 ="Cucumber";
		ip.searchIteamAndAddToCart(vegname,vegname2,vegname3);
		ip.shoppingBagClickValidation();
		ip.proceedToCartCheckOut();
		Checkoutpage co = new Checkoutpage(driver);
		co.applyPromoCode("murali");
		co.navigateToPlaceOrder();
		String msgtext = co.validationOfSuccessMessageText();
		Assert.assertEquals(msgtext, "item has been placed successfully");
	}
	
	
	@Test(priority=9)
	public void closePopupTest() throws InterruptedException, IOException {
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
		Itemspage ip = new Itemspage(driver);		
		String vegname ="Brocolli";
		String vegname2 ="Cauliflower";
		String vegname3 ="Cucumber";
		ip.searchIteamAndAddToCart(vegname,vegname2,vegname3);
		ip.shoppingBagClickValidation();
		ip.proceedToCartCheckOut();
		Checkoutpage co = new Checkoutpage(driver);
		co.applyPromoCode("murali");
		co.navigateToPlaceOrder();
		co.popupClose();
	}
	
	@Test
	public void iteamslistvalidation() throws InterruptedException, IOException {
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
		Itemspage ip = new Itemspage(driver);		
		String[] addveg = {"Brocolli","Cauliflower","Cucumber"};
		List<String> veglist = Arrays.asList(addveg);
		String vegname ="Brocolli";
		String vegname2 ="Cauliflower";
		String vegname3 ="Cucumber";
		ip.searchIteamAndAddToCart(vegname,vegname2,vegname3);
		ip.shoppingBagClickValidation();
		ip.proceedToCartCheckOut();
		Checkoutpage co = new Checkoutpage(driver);
		List<String> weblist =co.itemsListValidation();
		Assert.assertEquals(weblist, veglist);
	}
	
	// Price validation test ******************************************************************************
	@Test
	public void priceListValidationWithTotalTest() throws InterruptedException, IOException {
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
		Itemspage ip = new Itemspage(driver);		
		String[] addveg = {"Brocolli","Cauliflower","Cucumber"};
		List<String> veglist = Arrays.asList(addveg);
		String vegname ="Brocolli";
		String vegname2 ="Cauliflower";
		String vegname3 ="Cucumber";
		ip.searchIteamAndAddToCart(vegname,vegname2,vegname3);
		ip.shoppingBagClickValidation();
		ip.proceedToCartCheckOut();
		Checkoutpage co = new Checkoutpage(driver);
		float itemstotalsumintable = co.priceListValidationWithTotal();
//		co.totalPrice();
		float itemstotalprice = co.totalPrice();
		Assert.assertEquals(itemstotalsumintable, itemstotalprice);
		
	}
	
	
	
	
}
