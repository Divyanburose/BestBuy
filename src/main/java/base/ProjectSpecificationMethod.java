package base;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import pages.Homepage;
import utils.Utility;

public class ProjectSpecificationMethod extends Utility {
		
@BeforeMethod	
	public void launchBrowser() throws IOException {
	browserLaunch();
}
	
public void selectNation() {
	nation();
}

public void brokenURL() throws MalformedURLException,IOException, InterruptedException { 
//Capture the link from webpage
	List<WebElement> links = driver.findElements(By.tagName("a"));
//Number of links
	System.out.println(links.size());
	
	for(int link=0;link<10;link++) {
//by using href attribute we can get url of required link
		WebElement element = links.get(link);
		String url = element.getAttribute("href");
		
		URL link1 = new URL(url);
//create a connection using url object 'link'
		HttpURLConnection httpConn = (HttpURLConnection) link1.openConnection();
//wait time 2 seconds
		Thread.sleep(2000);
//Establish connection
		httpConn.connect();
		
		int rescode =httpConn.getResponseCode();
		
		if (rescode>=400) {
			System.out.println(url +" -"+ " is broken link");
		} else {
			System.out.println(url +" -"+ " is valid link");	
		}
	}
		
}

	
@AfterMethod
public void browserClose() {
	close();
}

@DataProvider(name ="excelData")
public String[][] excelData() throws IOException {
	String[][] data = readExcel(excelFile);
	return data;
}

}
