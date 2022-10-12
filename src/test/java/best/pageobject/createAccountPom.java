package best.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import best.baseclass.BaseClass;

public class createAccountPom extends BaseClass{
	public createAccountPom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="(//img[@alt='United States'])[1]")
	private WebElement unitedstates;
	@FindBy(xpath ="//span[text()='Account']")
	private WebElement account;
	@FindBy(xpath="//a[text()='Create Account']")
	private WebElement createaccount;
	
	@FindBy(css= "  c-button c-button-secondary c-button-sm sign-in-btn")
	private WebElement signin;

	@FindBy(id="firstName")
	private WebElement firstname;
	@FindBy(id="lastName")
	private WebElement lastname;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="fld-p1")
	private WebElement password;
	@FindBy(id="reenterPassword")
	private WebElement reenterpass;
	@FindBy(css="input[name='phone']")
	private WebElement mob;
	@FindBy(xpath="//button[text()='Create an Account']")
	private WebElement btnsubmit;
	public WebElement getAccount() {
		return account;
	}
	public WebElement getUnitedstates() {
		return unitedstates;
	}
	public WebElement getCreateaccount() {
		return createaccount;
	}
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getReenterpass() {
		return reenterpass;
	}
	public WebElement getMob() {
		return mob;
	}
	public WebElement getBtnsubmit() {
		return btnsubmit;
	}
	
	
	
}

