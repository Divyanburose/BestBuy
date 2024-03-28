package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class LoginPage extends ProjectSpecificationMethod {

	public LoginPage(WebDriver driver) {
	this.driver = driver;	
	}
	
	public LoginPage email(String email) {
	driver.findElement(By.xpath("//input[@class=\"tb-input\"][1]")).sendKeys(email);	
	return this;
	}
	public LoginPage password(String password) {
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(password);
		return this;
	}
	
	public LoginPage submitbutton() {
		driver.findElement(By.xpath("//button[text()=\"Sign In\"]")).click();
		return this;
	}

}
