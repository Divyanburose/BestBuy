package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class SignupPage extends ProjectSpecificationMethod {

	public SignupPage(WebDriver driver) {
	this.driver=driver;	
	}
	
	public SignupPage Firstname(String FirstName) {
		driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys(FirstName);
		return this;
	}
	
	public SignupPage Lastname(String LastName) {
		driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys(LastName);
		return this;
	}
	
	public SignupPage Signupemail(String Email) {
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(Email);
		return this;
	}
	
	public SignupPage Signuppassword(String Password) {
		driver.findElement(By.xpath("//input[@maxlength=\"54\"][1]")).sendKeys(Password);
		return this;
	}
	
	public SignupPage SignupConfirmPassword(String ConPassword) {
		driver.findElement(By.xpath("//input[@id=\"reenterPassword\"]")).sendKeys(ConPassword);
		return this;
	}
   public SignupPage PhoneNum(String mobno) {
	   driver.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys(mobno);
	   return this;
   }
   public SignupPage SignupSubmit() {
	   driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	   return this;
   }

}
