package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class CheckoutPage extends ProjectSpecificationMethod {
 public CheckoutPage(WebDriver driver) {
	 this.driver=driver;
 }
public DeliveryDetailPage continueAsGuest() {
	driver.findElement(By.xpath("//button[text()=\"Continue as Guest\"]")).click();
	return  new DeliveryDetailPage(driver);
}



}
