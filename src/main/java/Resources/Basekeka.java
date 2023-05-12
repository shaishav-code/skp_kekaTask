package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import PageObject.Login;

public class Basekeka {

	public static WebDriver driver;
	
	public Login Lg;

	@BeforeTest
	public WebDriver initializeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\psejal\\Documents\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		// options.addArguments("--disable notifications");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);

		driver = new ChromeDriver(options);
		
		// driver=new ChromeDriver();
		driver.get("https://narolainfotech.keka.com/");
		return driver;

	}

	@BeforeClass
	public void object() {
		Lg = new Login(driver);
	}

	@AfterTest
	public void closedata() {
		//driver.close();
		
	}

}
