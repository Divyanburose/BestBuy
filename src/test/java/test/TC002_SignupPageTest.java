package test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.Homepage;

public class TC002_SignupPageTest extends ProjectSpecificationMethod {
	@BeforeTest
	public void setup() {
		excelFile="TC002_Signup";
	}	
	

@Test(dataProvider = "excelData")
	public void signup(String FirstName,String LastName,String Email,String Password,String ConPassword,String mobno) throws MalformedURLException, IOException, InterruptedException {
		// TODO Auto-generated method stub
Homepage obj = new Homepage(driver);
//obj.browserLaunch();
//obj.loadurl();
obj.nation();
obj.createAccountButton().Firstname(FirstName).Lastname(LastName).Signupemail(Email)
.Signuppassword(Password).SignupConfirmPassword(ConPassword).PhoneNum(mobno).SignupSubmit();

	
	
	}

}
