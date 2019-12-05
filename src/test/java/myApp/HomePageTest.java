package myApp;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import myApplication.BasePage;
import myApplication.DressesObject;
import myApplication.HomePageObject;

public class HomePageTest {

	HomePageObject homePage;
	BasePage bp;
	DressesObject dobj;

	public HomePageTest() {
		homePage = new HomePageObject();
		bp = new BasePage();

	}

	@Test
	public void verifyTabs() {
		Assert.assertTrue(homePage.getWomen().isDisplayed());
		homePage.getWomen().click();
		Assert.assertTrue(homePage.getDress().isDisplayed());
		homePage.getDress().click();
		Assert.assertTrue(homePage.getTshirt().isDisplayed());
		homePage.getTshirt().click();

	}

}
