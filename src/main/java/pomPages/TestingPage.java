package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	@FindBy(id="Selenium Training")
	private WebElement seleniumtraining;

	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}
	
	@FindBy (id="mycart")
	private WebElement carttab;
	
	public WebElement getCarttab() {
		return carttab;
	}


	@FindBy (xpath=("(//i[@class ='fa fa-facebook'])[2]"))
	private WebElement facebook;
	
	public WebElement getFacebook() {
		return facebook;
	}
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
			public void facebookicon()
			{
				facebook.click();
			}
}
