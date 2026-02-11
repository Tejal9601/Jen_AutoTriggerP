package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class AdminLoginsWithPara3  extends BaseClass {
	@FindBy(xpath="//input[@id='email']")
    WebElement userId;

    @FindBy(xpath="//input[@id='password']")
    WebElement password;

    @FindBy(xpath="//button[@id='loginBtn']")
    WebElement logInBtn;

    @FindBy(xpath="//input[@name='remember']")
    WebElement rememberMe;
public AdminLoginsWithPara3() {
	PageFactory.initElements(driver,this);
}
public void adminLogins(String user, String pass) {
	userId.sendKeys(user);
	password.sendKeys(pass);
	logInBtn.click();
}
}
