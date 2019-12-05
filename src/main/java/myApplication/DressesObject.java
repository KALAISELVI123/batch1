package myApplication;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;

public class DressesObject extends BasePage {

	//qsize tabs

	@FindBy(id = "layered_id_attribute_group_1")
	private WebElement small;
	

	@FindBy(id = "layered_id_attribute_group_2")
	private WebElement medium;

	@FindBy(id = "layered_id_attribute_group_3")
	private WebElement large;

	// product counts

	@FindBy(xpath = "//div[@id='center_column']/h1/span[2]")
	private WebElement headertext;

	@FindBys(@FindBy(xpath = "//*[@id='center_column']/ul/li"))//*[@id="center_column"]/ul/li
	private List<WebElement> products;

	public DressesObject() {
		PageFactory.initElements(driver, this);
	}
	
	// size methods

	public WebElement smallTab() {
		return small;

	}

	public WebElement mediumTab() {
		return medium;
	}

	public WebElement largeTab() {
		return large;
	}
	
	//count methods

	public int getProductCount() {
		String text = headertext.getText();
		String[] arr = text.split(" ");
		String value = arr[2];
		int number = Integer.parseInt(value);
		return number;

	}

	public int totalProduct() {
		return products.size();
		
	}

}
