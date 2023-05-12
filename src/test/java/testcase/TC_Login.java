package testcase;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Resources.Basekeka;

public class TC_Login extends Basekeka {
	
	
	public WebDriver driver;
	
	@Test
	public  void BasePageNavigation() throws InterruptedException {
		Thread.sleep(5000);
		Lg.enterEmail();
		Lg.enterPassword();
		Thread.sleep(10000);
		
		Lg.click_login();
		Thread.sleep(3000);
		
		Lg.entervalidEmail();
		Thread.sleep(3000);
		
		Lg.entervalidPassword();
		Thread.sleep(10000);
		
		Lg.click_login1();
		Thread.sleep(3000);
		
		Lg.click_me();
		Thread.sleep(3000);
		
		Lg.click_attendance();
		Thread.sleep(3000);
		
		Lg.click_toggle();
		Thread.sleep(3000);
		
		Lg.Setprofile();
		Thread.sleep(3000);
		
		Lg.Gotoprofile();
		Thread.sleep(3000);
		
		Lg.click_addskill();
		Thread.sleep(3000);
		
		Lg.enterskill();
		Thread.sleep(3000);
		
		Lg.savebutton();
		Thread.sleep(3000);
		
		Lg.click_profile();
		Thread.sleep(3000);

		Lg.click_edit();
		Thread.sleep(3000);
		
		Lg.click_maritialstatus();
		Thread.sleep(3000);
		
		Lg.Setprofile1();
		Thread.sleep(3000);
		
		Lg.click_logout();
		Thread.sleep(3000);
		
		
		

		
		
		
		
	}
	

}
