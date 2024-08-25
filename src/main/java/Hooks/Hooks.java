package Hooks;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Base.java.Base;
import Utils.ReadExel;




public class Hooks extends Base {
	

	
	

	@BeforeMethod public void steup() {
		browserlaunch("firefox");
		urllaunch("https://www.saucedemo.com/");
	}
	
	
	@AfterMethod public void teardown() throws InterruptedException {
		waittime(5000);
		quit();
	}

}
