package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class RefrigeratorPage extends ProjectSpecificationMethod {
	public RefrigeratorPage(WebDriver driver) {
		this.driver = driver;
	}

	public FrenchDoorRefrig refrigerator() {
		driver.findElement(By.xpath("(//a[text()=\"French door refrigerators\"])[1]")).click();
		return new FrenchDoorRefrig(driver);
	}
	
	}

	

