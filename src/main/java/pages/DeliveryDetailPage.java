package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificationMethod;

public class DeliveryDetailPage extends ProjectSpecificationMethod  {
	public DeliveryDetailPage(WebDriver driver) {
		this.driver=driver;
	}
public DeliveryDetailPage deliveryData() {
	driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Divya");
	driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Anburose");
	driver.findElement(By.xpath("//input[@id=\"street\"]")).sendKeys("K Calle 12");
	driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys("Dorado");
	WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"state\"]"));
	Select select = new Select(dropdown);
	select.selectByVisibleText("IN ");
	driver.findElement(By.xpath("//input[@id=\"zipcode\"]")).sendKeys("00646");
	driver.findElement(By.xpath("//span[text()=\"Apply\"]")).click();
	return this;
}
public PaymentDetails contactDetail() {
	driver.findElement(By.xpath("//input[@id=\"user.emailAddress\"]"))
	.sendKeys("divyanburose@gmail.com");
	driver.findElement(By.xpath("//input[@id=\"user.phone\"]"))
	.sendKeys("8808697357");
	
	WebElement ele = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));
	WebDriverWait obj = new WebDriverWait(driver,Duration.ofSeconds(20));
	obj.until(ExpectedConditions.elementToBeClickable(ele));
	Actions mouse = new Actions(driver);
	mouse.moveToElement(ele).perform();
	
	driver.findElement(By.xpath("//span[text() = \"Continue to Schedule Delivery\"]")).click();
return new PaymentDetails(driver);
}



}
