package next.com_HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import next.com_Base.Next_TestBase;

public class HomePageContents_Data extends Next_TestBase  {

	public HomePageContents_Data(){
		PageFactory.initElements(driver, this);
	}
	
   public static String validatePageTitle(){ //PAGE FACTORY ** webpage tittle verification*****
	return driver.getTitle();
   }
	         
	@FindBy(xpath = "//*[@id='header-logo']") //PAGE FACTORY ** webpage logo*****
	WebElement logo;
	
	//action

public boolean validatePageImage() {
	 return logo.isDisplayed();
 }


}