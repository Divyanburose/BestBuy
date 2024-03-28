package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class PaymentDetails extends ProjectSpecificationMethod {

	public PaymentDetails(WebDriver driver) {
		this.driver = driver;
	}

public PaymentDetails creditCard() {
	driver.findElement(By.xpath("//input[@id=\"number\"]")).sendKeys("1234 5678 9235 4756");
	return this;
}

public PaymentDetails createPassword() throws InterruptedException {
	driver.findElement(By.xpath("//input[@class=\"tb-input  email-field\"]"))
	.sendKeys("divyanburose@gmail.com");
	driver.findElement(By.xpath("//input[@name=\"password\"]"))
	.sendKeys("&quot;Nine+two=Eleven&quot;");
	driver.findElement(By.xpath("//span[text()=\"Create Account\"]")).click();
	Thread.sleep(2000);
	
	String actualText = driver.findElement(By.xpath("//p[text()=\"Please enter a valid card number.\"]")).getText();
	System.out.println(actualText);
	if(actualText.equalsIgnoreCase("Please enter a valid card number.")) {
		System.out.println("Please enter a valid card detail");
	} else {
		System.out.println("valid detail");
	}
	return this;
}


}
