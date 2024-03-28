package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethod;

public class Homepage extends ProjectSpecificationMethod {
	//parameterized constructor
	public Homepage(WebDriver driver) {
		this.driver=driver;
	}

public Homepage accountButton() throws InterruptedException  {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='v-p-right-xxs line-clamp']")).click();
	return this;
}
public LoginPage loginButton() {
	driver.findElement(By.xpath("//a[text() = \"Sign In\"]")).click();
	return new LoginPage(driver);
}

public SignupPage createAccountButton() {
	driver.findElement(By.xpath("//a[text()=\"Create Account\"]")).click();
	return new SignupPage(driver);
	
}

//TITLE VALIDATION FOR EACH MENU
public Homepage topDeals() {
    driver.findElement(By.xpath("//a[text()=\"Top Deals\"]")).click();
    String ActualTitle = driver.getTitle();
    System.out.println(ActualTitle);
    
 //validating top deals title
    
    if (ActualTitle.equalsIgnoreCase("Top Deals and Featured Offers on Electronics - Best Buy")) {
    	System.out.println("Top deals page title validation success");
    }else {
    	System.out.println("Top deals page title validation failure");
    }
	return this;
}

//validating Deal of the day
public Homepage dealOfTheDay() {
	driver.findElement(By.xpath("//a[text()=\"Deal of the Day\"]")).click();
	String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle);
	
	if (ActualTitle.equalsIgnoreCase("Deal of the Day: Electronics Deals - Best Buy")){
	System.out.println("Deal of the day page title validation success");
}else {
	System.out.println("Deal of the day page title validation failure");
}
	return this;
}

//validating best by sell
public Homepage bestBySell() {
	driver.findElement(By.xpath("//a[text()=\"Yes, Best Buy Sells That\"]")).click();
	String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle);

if (ActualTitle.equalsIgnoreCase("Yes, Best Buy Sells That – Best Buy")) {
	System.out.println("Best by sell page title validation success");
}else {
	System.out.println("Best by sell page title validation failure");
}
return this;
}

//validating memberships
public Homepage memberships() {
	driver.findElement(By.xpath("(//a[text()=\"My Best Buy Memberships\"])[1]")).click();
	String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle);
	
	if (ActualTitle.equalsIgnoreCase("My Best Buy Memberships")) {
		System.out.println("Membership page title validation success");
	} else {
		System.out.println("Membership page title validation failure");
	}
return this;
}

//validating credit card
public Homepage creditCard() {
	driver.findElement(By.xpath("//a[text()=\"Credit Cards\"]")).click();
	String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle);
	
	if (ActualTitle.equalsIgnoreCase("Best Buy Credit Card: Rewards & Financing")){
	System.out.println("Credit Card page title validation success ");
}else {
	System.out.println("Credit card Page title validation failure");
}
return this;
}

//validating MoreGiftCards
public Homepage moreGiftCards() {
	driver.findElement(By.xpath("//span[text()=\"More\"]")).click();
	driver.findElement(By.xpath("(//a[text()=\"Gift Cards\"])[2]")).click();
	String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle);
	if(ActualTitle.equalsIgnoreCase("Gifts Cards and E-Gift Cards - Best Buy")){
	System.out.println("Gift cards page validation success");
} else {
	System.out.println("Gift cards page validation failure");
}
return this;
}

//validating MoreGiftIdeas
public Homepage moreGiftIdeas() {
	driver.findElement(By.xpath("//span[text()=\"More\"]")).click();
	driver.findElement(By.xpath("(//a[text()=\"Gift Ideas\"])[2]")).click();
	String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle);
	
	if(ActualTitle.equalsIgnoreCase("Gift Ideas 2024: Best Gifts to Give This Year - Best Buy")){
	System.out.println("Gift ideas page validation success");
}else {
	System.out.println("Gift ideas page validation failure");
}
return this;
}

//TITLE VALIDATION FOR EACH BOTTOM LINK
//Accessibility
public Homepage accessibility() {
	driver.findElement(By.xpath("//a[text()=\"Accessibility\"]")).click();
	String Actualurl = driver.getCurrentUrl();
	System.out.println(Actualurl);

if(Actualurl.equalsIgnoreCase("https://www.bestbuy.com/site/help-topics/accessibility/pcmcat1496336482680.c?id=pcmcat1496336482680")) {
	System.out.println("Accessibility bottom link validation success");
}else {
	System.out.println("Accessibility bottom link validation failure");
}
return this;

}

//Terms and conditions
public Homepage termsAndCondition() {
	driver.findElement(By.xpath("//a[text()=\"Terms & Conditions\"]")).click();
	String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle);
	
	if(ActualTitle.equalsIgnoreCase("BestBuy.com Terms and Conditions")) {
		System.out.println("Terms and condition bottom link validation success");
	} else {
		System.out.println("Terms and condition bottom link validation failure");
	}
return this;	
}

//Privacy
public Homepage privacy() {
	driver.findElement(By.xpath("//a[text()=\"Privacy\"]")).click();
	String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle);
	
	if(ActualTitle.equalsIgnoreCase("Privacy Policy Hub - Best Buy")){
		System.out.println("Privacy bottom link validation success");
	}else {
		System.out.println("Privacy bottom link validation failure");
	}
	return this;
}

// ADDING ITEM TO THE CART FROM SEARCH
public LaptopPage searchButton() {
	driver.findElement(By.xpath("//input[@placeholder=\"What can we help you find today?\"]"))
	.sendKeys("Laptop");
	driver.findElement(By.xpath("//button[@title=\"submit search\"]")).click();
	return new LaptopPage(driver);
	
}

//ADDING ITEM TO CART BY DEPARTMENT
public Homepage menu() {
	driver.findElement(By.xpath("//button[@aria-label=\"Menu\"]")).click();
	return this;
}

public RefrigeratorPage appliance() {
	driver.findElement(By.xpath("//button[@data-lid=\"ubr_app\"]")).click();
	driver.findElement(By.xpath("//button[@data-lid=\"ubr_app_mka\"]")).click();
	driver.findElement(By.xpath("//a[text() = \"Refrigerators\"]")).click();
	return new RefrigeratorPage(driver);
}

//ADDING ITEM TO CART BY BRAND
public IphonePage brand() {
	driver.findElement(By.xpath("(//button[@class=\"c-button-unstyled top-four v-fw-medium\"])[3]")).click();
	driver.findElement(By.xpath("//a[text() = \"Apple\"]")).click();
	return new IphonePage(driver);
}


}

