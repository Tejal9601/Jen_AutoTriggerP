package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class AdminLoginFromExcel extends BaseClass {
	@FindBy(xpath="//input[@id='email']")
    WebElement userId;

    @FindBy(xpath="//input[@id='password']")
    WebElement password;

    @FindBy(xpath="//button[@id='loginBtn']")
    WebElement logInBtn;

    @FindBy(xpath="//input[@name='remember']")
    WebElement rememberMe;
    
    public AdminLoginFromExcel() {
    	PageFactory .initElements(driver, this);
    }
    public void adminLogin(String user, String pass) {
    	userId.sendKeys(user);
    	password.sendKeys(pass);
    	logInBtn.click();
    }
}
