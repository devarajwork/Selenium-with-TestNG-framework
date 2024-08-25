package Locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.java.Base;


public class Login extends Base{
	
	
	

	public Login() {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath = "//input[@placeholder='Username']")
		public static WebElement UserName;
		
		@FindBy(xpath = "//input[@placeholder='Password']")
		public static WebElement Password;	
		
		@FindBy(id = "login-button")
		public static WebElement LoginButton;
		
		public void username(String name) {
			implicitlyWait(20);
			click(UserName);
			sendkeys(UserName, name);
		}
		
		public void password(String name) {
			implicitlyWait(20);
			click(Password);
			sendkeys(Password, name);
		}
		public void login(String name) throws InterruptedException {
			waittime(2000);
			click(LoginButton);
		}
		
		
	}
	


