package POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {
	
	//Declaration
	@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
	@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
	@FindBy(xpath = "//button[text()='Login ']")private WebElement LOGINBTN;
	
	//Initialization
	public POM1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Implementation
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}
	public void clickLOGINBTN() {
		LOGINBTN.click();
	}

}
