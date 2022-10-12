package best.createaccount;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import best.baseclass.BaseClass;
import best.pageobject.LoginpagePom;
import best.pageobject.createAccountPom;

public class CreateAccountValidation extends BaseClass{
	createAccountPom c;
	LoginpagePom l;
	List<HashMap<String, String>> m;
	@BeforeMethod
	private void beforeMethod() throws IOException {
		initializeDriver();
		urlLaunch("https://www.bestbuy.com/");
		impWait(20);
	}
	
	@Test(priority=0)
	public void createAccount() throws InterruptedException, IOException {
		 c=new createAccountPom();
		
		click(c.getUnitedstates());
		waitTillVisibilityofElement(10, c.getAccount());
		click(c.getAccount());
		waitTillVisibilityofElement(10, c.getCreateaccount());
		click(c.getCreateaccount());
		waitTillVisibilityofElement(10, c.getFirstname());
		
		m = getJsonDataToMap("CreateAccount");
		sendKeys(c.getFirstname(), m.get(0).get("firstname"));
		sendKeys(c.getLastname(), m.get(0).get("lastname"));
		sendKeys(c.getEmail(), m.get(0).get("email"));
		sendKeys(c.getPassword(), m.get(0).get("password"));
		sendKeys(c.getReenterpass(), m.get(0).get("password"));
		sendKeys(c.getMob(), m.get(0).get("mobile"));

		click(c.getBtnsubmit());

		
	}
	@Test (priority=2)
	public void LoginValidation() {
		 l= new LoginpagePom();
		 waitTillVisibilityofElement(10, c.getUnitedstates());
		click(c.getUnitedstates());
		waitTillVisibilityofElement(10, l.getSignin());
		click(l.getSignin());
		
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
