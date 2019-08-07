package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	
		public static WebDriver open(String browserType) {
			if (browserType.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\emili\\Tools\\geckodriver.exe");
				return new FirefoxDriver();
			}
			
			else if (browserType.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", "C:\\Users\\emili\\Tools\\IEDriverServer.exe");
				return new InternetExplorerDriver();
			}
			else {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\emili\\Tools\\chromedriver.exe");
				return new ChromeDriver();
			}
			
		}
	
	
	
}
