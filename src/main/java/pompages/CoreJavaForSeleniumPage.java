package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumPage {
	//Declaration
	@FindBy(xpath="//h2[text()='core java for Selenium']")
	private WebElement pageHeader;
	@FindBy(linkText="Core Java for Selenium Training")
	private WebElement coreJavaLink;
	
	//Initialization
	public CoreJavaForSeleniumPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//utilization
	public WebElement getPageHeader()
	{
		return pageHeader;
	}
	public void clickCoreJavaLink()
	{
		coreJavaLink.click();
	}
}
