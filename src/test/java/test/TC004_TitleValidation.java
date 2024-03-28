package test;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.Homepage;

public class TC004_TitleValidation extends ProjectSpecificationMethod{
@Test
	public void titleValidation() throws IOException {
		// TODO Auto-generated method stub

	Homepage obj = new Homepage(driver);
	obj.nation();
	obj.topDeals().dealOfTheDay().bestBySell()
	.memberships().creditCard().moreGiftCards().moreGiftIdeas();
	
	}

}