package POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3 {
	//Declaration
	   @FindBy(xpath = "//span[@class='user-id']")private WebElement userID;
	
	//Initialization
	   public POM3(WebDriver driver) {
		   PageFactory.initElements(driver, this);
	   }
	   
	//Implementation
	   public String verifyuserID() {
		 String actID = userID.getText();
		return actID;
		 
		 
		
	   }
}
