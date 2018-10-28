package next.com_TestCases;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import next.com_Base.Next_TestBase;
import next.com_HomePage.HomePageContents_Data;


public class HomePage_contentsTest extends Next_TestBase  {


	HomePageContents_Data next_homepage;
	public HomePage_contentsTest(){
		super();
	}
	@BeforeMethod
	public void SetUp(){
	initialization() ;
	//HomePageContents_Data l = new HomePageContents_Data();
}
	
	@Test
	public void validatePageTittle(){
      String title = HomePageContents_Data.validatePageTitle();
	  Assert.assertEquals(title, "Next Official Site: Online Fashion, Kids Clothes & Homeware");
	}
	
	@Test
	public void VerifyHomePageContents_WOMEN()
	{
		String page_sour;
		page_sour = driver.getPageSource();
		assertTrue(page_sour.contains("women"));
	}
	
	@Test
	public void VerifyHomePageContents_MEN()
	{
		String page_sour;
		page_sour = driver.getPageSource();
		assertTrue(page_sour.contains("men"));
	}
		
	/*@Test
	public void nextLogoTest(){
        boolean flag =  next_homepage.validatePageImage();
        Assert.assertEquals(flag, "WOMEN");
	}
	*/
	
	@Test
	public void  nextLogoTest(){
		Assert.assertTrue(next_homepage.validatePageImage());
		
	}
	
	
}
	

