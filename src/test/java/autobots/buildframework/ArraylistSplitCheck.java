package autobots.buildframework;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import autobots.datadriven.Exceldatadriven;
import autobots.pomclasses.Homepage;
import autobots.pomclasses.Itemspage;
import autobots.pomclasses.Loginpage;
import autobots.resources.Baseclass;

public class ArraylistSplitCheck extends Baseclass{

	@Test
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
		String vegname ="Brocolli";
		String vegname2 ="Cauliflower";
		String vegname3 ="Cucumber";
		ip.searchIteamAndAddToCart(vegname,vegname2,vegname3);
		ip.shoppingBagClickValidation();
		ip.myVegsList();
	}
		

	}


