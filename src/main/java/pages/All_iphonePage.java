package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class All_iphonePage extends ProjectSpecificationMethod{
	public All_iphonePage(WebDriver driver) {
		this.driver = driver;
	}

public CartPage selectMobile() {
	driver.findElement(By.xpath("(//button[@data-button-state=\"ADD_TO_CART\"])[1]")).click();
	driver.findElement(By.xpath("//a[text()=\"Go to Cart\"]")).click();
	return new CartPage(driver);
}
	
	
	
}
