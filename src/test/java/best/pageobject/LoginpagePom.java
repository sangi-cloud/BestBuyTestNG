package best.pageobject;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import best.baseclass.BaseClass;

public class LoginpagePom extends BaseClass{
	public LoginpagePom() {
         PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="(//img[@alt='United States'])[1]")
	private WebElement unitedstates;
	
	@FindBy(xpath ="//span[text()='Account']")
	private WebElement account;
	
	@FindBy(css="  c-button c-button-secondary c-button-sm sign-in-btn")
	private WebElement signin;
	
	@FindBy(id="fld-e")
	private WebElement username;
	
	@FindBy(xpath="//label[text()='Password']")
	private WebElement password;
	
	@FindBy(css="button[type='submit']")
	private WebElement btnsbmit;
	

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnsbmit() {
		return btnsbmit;
	}

	public WebElement getUnitedstates() {
		return unitedstates;
	}


}
