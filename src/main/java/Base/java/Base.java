package Base.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static RemoteWebDriver driver;
// browser methods
	public static WebDriver browserlaunch(String Browsername) {
		if (Browsername.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("use-fake-ui-for-media-stream");
			driver = new ChromeDriver(options);
		} else if (Browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();  
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--disable-notifications");
			driver = new EdgeDriver(options);
		} else if (Browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--disable-notifications");
			driver = new FirefoxDriver(options);
		}
		return driver;
	}
	
	//selenium elements, actions methods

	public static void urllaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void waittime(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public void implicitlyWait(int time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

	public static void click(WebElement a) {
		a.click();
	}

	public static void sendkeys(WebElement a, String string) {
		a.sendKeys(string);
	}

	
	public static void clear(WebElement a) {
		a.clear();
	}

	public static void gettext(WebElement a) {       
		a.getText();
	}



	public static void quit() {
		driver.quit();
	}

	public static void selectbyindex(WebElement a, int b) {
		Select s = new Select(a);
		s.selectByIndex(b);

	}

	public static void selectbyvalue(WebElement a, String b) {
		Select s1 = new Select(a);
		s1.selectByValue(b);

	}

	public static void selectbyvisibletext(WebElement a, String b) {
		Select s2 = new Select(a);
		s2.selectByVisibleText(b);
	}

	public static void movetoelement(WebElement a) {
		Actions a1 = new Actions(driver);
		a1.moveToElement(a).perform();
	}

	public static void draganddrop(WebElement Sorce, WebElement Target) {
		Actions a2 = new Actions(driver);
		a2.dragAndDrop(Sorce, Target).perform();
	}

	public static void rightclick(WebElement b) {
		Actions a3 = new Actions(driver);
		a3.contextClick(b).perform();
	}

	public static void alertaccept() {
		driver.switchTo().alert().accept();
	}

	public static void alertdismiss() {
		driver.switchTo().alert().dismiss();
	}

	public static void pagerefresh() {
		driver.navigate().refresh();
	}

	public static void previouspage() {
		driver.navigate().back();
	}

	
		
	

}
