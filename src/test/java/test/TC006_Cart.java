package test;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.Homepage;

public class TC006_Cart extends ProjectSpecificationMethod {
@Test
	public void cart() throws InterruptedException, IOException {
		// TODO Auto-generated method stub

	Homepage obj = new Homepage(driver);
	obj.nation();
	obj.searchButton().laptopSelect().continueShopping().menu().appliance()
	.refrigerator().selectFridge().continueShoppingAfterFridge().menu().brand()
	.iphoneMenu().selectMobile().checkout().continueAsGuest().deliveryData()
	.contactDetail().creditCard();
	
	
	
	
	
	}

}
