package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.ProjectSpecificationMethod;

public class LaptopPage extends ProjectSpecificationMethod{
	public LaptopPage(WebDriver driver) {
		this.driver = driver;
	}

public LaptopPage laptopSelect() {
	/*WebElement ele = driver.findElement(By.xpath("(//button[@data-button-state=\"ADD_TO_CART\"])[1]"));
    Actions mouse =new Actions(driver);
    mouse.moveToElement(ele).perform();*/

    driver.findElement(By.xpath("(//button[@data-button-state=\"ADD_TO_CART\"])[1]")).click();
    return this;
}

public Homepage continueShopping() {
	driver.findElement(By.xpath("//button[text() =\"Continue shopping\"]")).click();
	return new Homepage(driver);
}

}
