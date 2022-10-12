package best.login.validation;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import best.baseclass.BaseClass;
import best.pageobject.LoginpagePom;
import best.pageobject.createAccountPom;

public class LoginValidation extends BaseClass {
	LoginpagePom l;
	List<HashMap<String, String>> m;
	@BeforeMethod
	private void beforeMethod() throws IOException {
		initializeDriver();
		urlLaunch("https://www.bestbuy.com/");
		impWait(20);
	}
	
	
	@Test (groups="login")
	private void LoginValidationTest() throws IOException {
		 l= new LoginpagePom();
		 waitTillVisibilityofElement(10, l.getUnitedstates());
		click(l.getUnitedstates());
		waitTillVisibilityofElement(10, l.getSignin());
		click(l.getSignin());
		m = getJsonDataToMap("CreateAccount");

		waitTillVisibilityofElement(10, l.getUsername());
		sendKeys(l.getUsername(), m.get(0).get("email"));
		sendKeys(l.getPassword(), m.get(0).get("password"));
		click(l.getBtnsbmit());

	}
	
	@AfterTest
	private void afterMethod() {
		quit();
	}
}


