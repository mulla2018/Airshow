package RunJinkins.RunJinkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class whdjhs {
	
	
	@Test 
	public void main(){
		System.setProperty("webdriver.chrome.driver", "/Users/mominmulla/Downloads/chromedriver");	
		WebDriver driver = new ChromeDriver();
		

	    driver.get("http://demo.automationtesting.in/Register.html");
	    
	    driver.quit();
		

		
		
	}

}
