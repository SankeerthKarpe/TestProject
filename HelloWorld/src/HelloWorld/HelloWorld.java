package HelloWorld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		
		String exepath = "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exepath);
		WebDriver driver = (WebDriver) new ChromeDriver();
		
		driver .get("https://uat.techfynder.com");
		//driver.manage().window().maximize();
		
		
	}

}
