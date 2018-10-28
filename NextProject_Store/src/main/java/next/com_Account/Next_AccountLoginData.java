package next.com_Account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import next.com_Base.Next_TestBase;

public class Next_AccountLoginData  extends Next_TestBase{
	public Next_AccountLoginData(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/header/div/section/section[2]/ul/li[1]/a")
	WebElement Account;
	
	public void account_register(){
		Account.click();
		
	}

}
