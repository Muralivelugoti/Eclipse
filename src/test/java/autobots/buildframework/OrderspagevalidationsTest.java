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
import autobots.pomclasses.Orderspage;
import autobots.resources.Baseclass;

public class OrderspagevalidationsTest extends Baseclass{
	
	@Test
	public void validationOfURL() throws InterruptedException, IOException {
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
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://banavaths45.github.io/selinium/myorders");
	}
	@Test
	public void validationOfWebpageTitle() throws InterruptedException, IOException {
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
		Thread.sleep(5000);
		co.navigateToPlaceOrder();
		co.popupClose();
		String webtitle = driver.getTitle();
		Assert.assertEquals(webtitle, "React App");
	}
	@Test
	public void myOrdersListValidationTest() throws InterruptedException, IOException {
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
		co.applyPromoCode("murali");
		co.navigateToPlaceOrder();
		co.popupClose();
		Orderspage op = new Orderspage(driver);
		List<String> getlist = op.myOrdersListValidation();
		Thread.sleep(2000);
		Assert.assertEquals(getlist, veglist);
	}
	
	@Test
	public void validationOfMyOrdersText() throws InterruptedException, IOException {
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
		Orderspage op = new Orderspage(driver);
		String myordertext = op.myordersText();
		Assert.assertEquals(myordertext, "My Orders");
	}
	
	@Test
	public void validationOfGotoGreenkartText() throws InterruptedException, IOException {
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
		Orderspage op = new Orderspage(driver);
		String greenkarttext = op.gotoGreenkartText();
		Assert.assertEquals(greenkarttext, "GOTO GreenCart");
	}
	
	@Test
	public void navigateToHomePageTest() throws InterruptedException, IOException {
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
		Orderspage op = new Orderspage(driver);
		op.navigateToHomePage();
	}
}
