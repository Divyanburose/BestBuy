package test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.Homepage;

public class TC003_BrokenURL extends ProjectSpecificationMethod{
@Test
	public void brokenURL() throws MalformedURLException, IOException, InterruptedException {
		// TODO Auto-generated method stub

	Homepage obj = new Homepage(driver);
	obj.nation();
	obj.brokenURL();
	}

}
