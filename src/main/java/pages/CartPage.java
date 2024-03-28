package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificationMethod;

public class CartPage extends ProjectSpecificationMethod{
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}
public CheckoutPage checkout() throws InterruptedException {
	
	driver.findElement(By.xpath("//button[text()=\"Checkout\"]")).click();
	
	//Explicit wait
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\\\"No Thanks\\\"]")));
	
	WebElement popup = driver.findElement(By.xpath("//span[text()=\"No Thanks\"]"));
	
	Actions mouse =new Actions(driver);
	mouse.moveToElement(popup).perform();
	
	//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\\\"No Thanks\\\"]")));
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	return new CheckoutPage(driver);
}
}
