package selenium_ex;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Browser\\chromedriver.exe");
		  ChromeOptions set = new ChromeOptions();
			set.addArguments("--remote-allow-origins=*");
			set.setHeadless(true);
		    ChromeDriver driver = new ChromeDriver(set);
		    driver.get("https://the-internet.herokuapp.com");
		    
	}

}
