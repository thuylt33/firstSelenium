package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class loginpage {
	private WebDriver driver;
	
	@FindBy(css="div.mod-login-input-loginName>input")
	public WebElement txtUserName;
	@FindBy(css="div.mod-login-input-loginName>span")
	public WebElement lbUserNameError;
	@FindBy(css="div.mod-login-input-password>input[type=password]")
	public WebElement txtPassword;
	@FindBy(css="div.mod-login-input-password>span")
	public WebElement lbPasswordError;
	@FindBy(css="button.next-btn-primary")
	public WebElement btnLogin;
	@FindBy(css="div.next-feedback-toast")
	public WebElement pnlNotifier;
	@FindBy(css="div.next-feedback-toast .next-feedback-content")
	public WebElement lbNotification;
	
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
