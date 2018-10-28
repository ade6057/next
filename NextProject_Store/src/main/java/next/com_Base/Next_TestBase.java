package next.com_Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import next.com_Utilities.next_TestUtili;


    public class Next_TestBase {
    	public static WebDriver driver;	
	  public static Properties prop;
	
	public Next_TestBase()
	{
		
		try {
		prop = new Properties ();
	
			FileInputStream ip = new FileInputStream("C:\\selenium revise\\NextProject_Store\\src\\main\\java\\next\\com\\data\\next.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
		  e.printStackTrace();
		} 
	
		
	}
	
		
		public static void initialization(){
	
		String BrowserName = prop.getProperty("browser");
		if(BrowserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\seleniumTools\\webdrivers\\chromedriver.exe");	
			 driver = new ChromeDriver ();
		}
		
		else if (BrowserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\seleniumTools\\webdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		 //driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(next_TestUtili.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS );
		 driver.manage().timeouts().implicitlyWait(next_TestUtili.IMPLICI_WAIT,TimeUnit.SECONDS);
		 
		 driver.get(prop.getProperty("url"));
		
		}
	}


