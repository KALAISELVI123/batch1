package myApp;

import org.testng.Assert;
import org.testng.annotations.Test;

import myApplication.DressesObject;
import myApplication.HomePageObject;

public class DressesTest {

	DressesObject dobj;
	HomePageObject hp;

	public DressesTest() {
		dobj = new DressesObject();
		hp = new HomePageObject();
	}

	@Test
	public void verifyCounts() {
		hp.getDress().click();
	
		dobj.smallTab().click();
		
		dobj.mediumTab().click();
		dobj.largeTab().click();
		Assert.assertTrue(dobj.smallTab().isDisplayed());

		System.out.println(dobj.getProductCount());
		System.out.println(dobj.totalProduct());
		Assert.assertTrue(dobj.getProductCount() == dobj.totalProduct(), "Failed:Count Mismatch");

	}
}