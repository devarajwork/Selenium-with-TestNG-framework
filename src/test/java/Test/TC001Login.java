package Test;



import org.testng.annotations.Test;


import Hooks.Hooks;
import Locators.Login;

public class TC001Login extends Hooks {

	@Test 
	public void  Logintest() throws InterruptedException {
		
		Login a=new Login();
		
		a.username("standard_user");
		a.password("secret_sauce");
		a.login(null);
		
	}
}

