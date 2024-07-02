package autobots.buildframework;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import autobots.datadriven.Exceldatadriven;
import autobots.pomclasses.Homepage;
import autobots.pomclasses.Itemspage;
import autobots.pomclasses.Loginpage;
import autobots.resources.Baseclass;

public class ItemspagevalidationTest extends Baseclass {
	@Test
	public void urlValidationTest() throws IOException {
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
		String url = ip.urlValidatons();
		Assert.assertEquals(url, "https://banavaths45.github.io/selinium/greenkart");
	}
	
	@Test
	public void itemsPageWebTitleValidationTest() throws IOException {
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
		String webtitle = ip.itemsPageWebTitleValidation();
		Assert.assertEquals(webtitle, "React App");
	}
	
	
	
	@Test
	public void cgtLogoTextValidationTest() throws IOException {
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
		String cgtlogotext = ip.cgtLogoTextValidation();
		Assert.assertEquals(cgtlogotext, "CGT");
	}
	
	@Test
	public void greenkartLogoTextValidationTest() throws IOException {
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
		String greenkartlogotext = ip.greenkartLogoTextValidation();
		Assert.assertEquals(greenkartlogotext, "GREENKART");
	}
	// Add the test or not discuss
//	@Test
//	public void greenkartButtonTextValidationTest() throws IOException {
//		Exceldatadriven dd = new Exceldatadriven();
//		String sname = "Login Details";
//		String cname = "Data";
//		String ctext = "Valid Login";
//		ArrayList<String> data = dd.dataDriven(sname, cname, ctext);
//		Loginpage lp = new Loginpage(driver);
//		String username = data.get(0);
//		String password = data.get(1);
//		lp.goToLogin(username, password);
//		Homepage hp = new Homepage(driver);
//		hp.navigateGreenkart();
//		Itemspage ip = new Itemspage(driver);
//		String greenkartButtontext = ip.greenkartButtonTextValidation();
//		Assert.assertEquals(greenkartButtontext, "GreenKart");
//	}
	
	@Test(groups={"itemsadd"})
	public void searchBarValidationTest() throws IOException {
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
		boolean searchbarvisible = ip.searchBarValidation();
		Assert.assertEquals(searchbarvisible, true);
	}
	
	
	@Test(groups={"itemsadd"})
	public void searchButtonValidationTest() throws IOException {
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
		boolean searchbuttonvisible = ip.searchButtonValidation();
		Assert.assertEquals(searchbuttonvisible, true);
	}
	@Test(groups={"itemsadd"})
	public void shoppingBagIconValidationTest() throws IOException {
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
		boolean shoppingbagvisible = ip.shoppingBagIconValidation();
		Assert.assertEquals(shoppingbagvisible, true);
	}
	// Not needed i think
//	@Test
//	public void shoppingClickValidation() throws IOException, InterruptedException {
//		Exceldatadriven dd = new Exceldatadriven();
//		String sname = "Login Details";
//		String cname = "Data";
//		String ctext = "Valid Login";
//		ArrayList<String> data = dd.dataDriven(sname, cname, ctext);
//		Loginpage lp = new Loginpage(driver);
//		String username = data.get(0);
//		String password = data.get(1);
//		lp.goToLogin(username, password);
//		Homepage hp = new Homepage(driver);
//		hp.navigateGreenkart();
//		Itemspage ip = new Itemspage(driver);		
//		ip.shoppingBagClickValidation();		
//	}
	
	@Test(groups={"itemsadd"})
	public void shoppingBagEmptyTextValidationTest() throws IOException, InterruptedException {
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
		String shoppingbagcartempty = ip.shoppingBagEmptyTextValidation();
		Assert.assertEquals(shoppingbagcartempty, "Your cart is Empty");
	}
	
	@Test(groups={"itemsadd"})
	public void addToCartButtonTextValidationTest() throws IOException, InterruptedException {
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
		String addtocardtext = ip.addToCartButtonTextValidation();
		Assert.assertEquals(addtocardtext, "Add to cart");
	}
	
//	@Test
//	public void addToCartButtonTextAfterClickValidationTest() throws IOException, InterruptedException {
//		Exceldatadriven dd = new Exceldatadriven();
//		String sname = "Login Details";
//		String cname = "Data";
//		String ctext = "Valid Login";
//		ArrayList<String> data = dd.dataDriven(sname, cname, ctext);
//		Loginpage lp = new Loginpage(driver);
//		String username = data.get(0);
//		String password = data.get(1);
//		lp.goToLogin(username, password);
//		Homepage hp = new Homepage(driver);
//		hp.navigateGreenkart();		
//		Itemspage ip = new Itemspage(driver);		
//		String addtocardtextafterclick = ip.addToCartButtonAfterClickTextValidationTest();
//		Assert.assertEquals(addtocardtextafterclick, "Added");
//		Thread.sleep(5000);
//	}
	@Test(groups={"itemsadd"})
	public void searchIteamAndAddToCartTest() throws IOException, InterruptedException {
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
		String vigname ="Brocolli";
		String vigname2 ="Cauliflower";
		String vigname3 ="Cucumber";
		ip.searchIteamAndAddToCart(vigname,vigname2,vigname3);
		
	}
	@Test(groups={"itemsadd"})
	public void shoopingBagItemsValidationTest() throws IOException, InterruptedException {
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
		List<String> baglist =ip.myVegsList();
		Assert.assertEquals(baglist, veglist);
	}
	
	@Test(groups={"itemsadd"})
	public void proceedToCartCheckOutText() throws IOException, InterruptedException {
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
		String proceedtocarttext = ip.validateProceedToCartButtonText();
		Assert.assertEquals(proceedtocarttext, "Proceed to checkout");
	}
	
	
	@Test
	public void proceedToCartCheckOutTest() throws IOException, InterruptedException {
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
	}
	
		
	
	}
