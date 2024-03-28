package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class FrenchDoorRefrig extends ProjectSpecificationMethod{
	public FrenchDoorRefrig(WebDriver driver) {
		this.driver=driver;
	}
	public FrenchDoorRefrig selectFridge() {
		driver.findElement(By.xpath("(//button[@data-button-state=\"ADD_TO_CART\"])[1]")).click();
		return this;
	}
 
	public Homepage continueShoppingAfterFridge() {
		driver.findElement(By.xpath("//button[@class=\"c-button-link continue-shopping\"]")).click();
		return new Homepage(driver);
	}
}
