package testscripts;

import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class FirstTest extends BaseClass
{
	public void firstTest()
	{
		SoftAssert soft=new SoftAssert();
		home.clickGearsTab();
		home.clickSkillraryDemoAppLink();
		web.handleChildBrowser();
		soft.assertTrue(demoApp.getPageHeader().isDisplayed());
		demoApp.mouseHoverToCourseTab(web);
		demoApp.clickSeleniumTraining();
		soft.assertTrue(selenium.getPageHeader().isDisplayed());
		selenium.doubleClickPlusButton(web);
		selenium.clickAddToCart();
		web.handleAlert();
		web.screenshot();
		soft.assertAll();
	}
}
