package test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.Homepage;

public class TC001_LoginTest extends ProjectSpecificationMethod {
	@BeforeTest
	public void setup() {
		excelFile="TC001_LoginTest";
	}
@Test(dataProvider = "excelData")

	public void logintest(String email,String password) throws MalformedURLException, IOException, InterruptedException {
		// TODO Auto-generated method stub

	Homepage obj = new Homepage(driver);
	//obj.browserLaunch();
	//obj.loadurl();
	obj.selectNation();
	obj.accountButton().loginButton().email(email).password(password).submitbutton();
	
	}

}
