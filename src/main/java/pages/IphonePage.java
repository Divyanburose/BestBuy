package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class IphonePage extends ProjectSpecificationMethod {
 public IphonePage(WebDriver driver) {
	 this.driver = driver;
 }

public All_iphonePage iphoneMenu() {
	driver.findElement(By.xpath("(//a[text()=\"iPhone\"])[1]")).click();
	driver.findElement(By.xpath("//a[text()=\"All iPhone\"]")).click();
	return new All_iphonePage(driver);
}




}
