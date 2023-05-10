package selenium_ex;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Capturetitile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Browser\\chromedriver.exe");
		  ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
		    ChromeDriver driver = new ChromeDriver(options);
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   String actual_title,expTitle;
		   expTitle = "Google";
		  actual_title = driver.getTitle();
		  
		  if(expTitle.contains(actual_title))
			  System.out.println("Tc is pass");
		  else
		  {
			  System.out.println("Tc is Fail");
		  System.out.println("Title of the page is "+ actual_title);
		  }  
		  driver.close();
	}
	
	+

}
