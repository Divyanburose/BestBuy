package test;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.Homepage;

public class TC005_BottomURLValidation extends ProjectSpecificationMethod {
@Test
	public void bottomURL() throws IOException {
		// TODO Auto-generated method stub

	Homepage obj = new Homepage(driver);
	obj.nation();
	obj.accessibility().termsAndCondition().privacy();		
		
	}

}
