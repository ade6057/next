package next.com_TestCases;

import org.testng.annotations.Test;

import next.com_Account.Next_AccountLoginData;
import next.com_Base.Next_TestBase;
import next.com_HomePage.HomePageContents_Data;

public class AccountLogin_RegisterTest extends Next_TestBase {

	Next_AccountLoginData  next_homepage;
	public AccountLogin_RegisterTest(){
		super();
	}
	@Test
	public void SetUp(){
	initialization() ;
	HomePageContents_Data login = new HomePageContents_Data();
} 
	

	@Test
	
	public void accountLogin(){
		next_homepage.account_register();
	}
}
