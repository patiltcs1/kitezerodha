package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {
	public WebDriver driver;
	
	public void intitilizeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get("https://kite.zerodha.com/");
	     
	  //maximize
	     driver.manage().window().maximize();
	     
	  //implicitly wait
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	}

}
