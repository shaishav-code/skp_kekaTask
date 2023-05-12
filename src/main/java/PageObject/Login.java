package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	WebElement emailTextBox;

	@FindBy(id = "password")
	WebElement passwordTextBox;

	public void enterEmail() {
		emailTextBox.sendKeys("sejal@narola.email");

	}

	public void enterPassword() {
		passwordTextBox.sendKeys("abcd");
	}

	@FindBy(xpath = "//button[@class='btn btn-primary mt-10 border-0']")
	WebElement Login;

	public void click_login() {
		Login.click();
	}

	@FindBy(id = "email")
	WebElement emailTextBoxNew;

	public void entervalidEmail() {
		emailTextBox.clear();
		emailTextBoxNew.sendKeys("skp@narola.email");

	}

	@FindBy(id = "password")
	WebElement passwordTextBoxNew;

	public void entervalidPassword() {
		passwordTextBoxNew.sendKeys("sp@9586220030");
	}

	@FindBy(xpath = "//button[@class='btn btn-primary mt-10 border-0']")
	WebElement LoginNew;

	public void click_login1() {
		LoginNew.click();
	}

	@FindBy(xpath = "(//span[@class='sidebar-list-label'])[2]")
	WebElement me;

	public void click_me() {
		me.click();
	}

	@FindBy(xpath = " //a[@routerlink='attendance']")
	WebElement attendance;

	public void click_attendance() {
		attendance.click();
	}

	@FindBy(xpath = "//label[@class='switch-label cursor-pointer']")
	WebElement Toggle;

	public void click_toggle() {
		Toggle.click();
	}

	@FindBy(xpath = "//span[@class='profile-name']")
	WebElement profile;

	public void Setprofile() {
		profile.click();
	}

	@FindBy(xpath = "(//a[@ class=\"dropdown-item\"])[1]")
	WebElement goprofile;

	public void Gotoprofile() {
		goprofile.click();
	}

	@FindBy(xpath = "//span[@class='ki ki-edit icon-click ki-sm ml-10']")
	WebElement addskill;

	public void click_addskill() {
		addskill.click();
	}

	@FindBy(xpath = "//div[@data-placeholder='Add your answer here']")
	WebElement writeskill;

	public void enterskill() {
		writeskill.clear();
		writeskill.sendKeys("autiomation");
		writeskill.click();
	}

	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm']")
	WebElement save;

	public void savebutton() {
		save.click();
	}

	@FindBy(xpath = "//a[@routerlink='profile']")
	WebElement routerlink;

	public void click_profile() {
		routerlink.click();
	}

	@FindBy(xpath = "(//a[@class='text-link'])[1]")
	WebElement edit;

	public void click_edit() {
		edit.click();
	}

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")
	WebElement maritial;

	@FindBy(xpath = "(//span[@class='ng-option-label'])[1]")
	WebElement single;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement update;

	public void click_maritialstatus() throws InterruptedException {
		maritial.click();
		Thread.sleep(1000);
		single.click();
		Thread.sleep(1000);
		update.click();
		Thread.sleep(1000);
	}

	@FindBy(xpath = "//span[@class='profile-name']")
	WebElement profile1;

	public void Setprofile1() {
		profile.click();
	}

	@FindBy(xpath = "//a[@routerlink='/logout']")
	WebElement logout;
	
	public void click_logout() {
		logout.click();
	}

}
