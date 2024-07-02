package autobots.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstraccomponents {
	WebDriver driver;
	public Abstraccomponents(WebDriver driver) {
		this.driver = driver;
	}
	
	public void alertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void explicitWait(By path) {
		WebDriverWait wait = new WebDriverWait(driver,(Duration.ofSeconds(5)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(path));
	}
	public void scrolling(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	}
	
}
