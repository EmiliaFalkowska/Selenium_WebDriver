package packageProject1;

import java.util.concurrent.TimeUnit;
import java.util.List;	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emili\\Tools\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		
		String underConsTitle = "Under Construction: Mercury Tours";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(baseUrl);
		
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		String[] linkTexts = new String[linkElements.size()];
		int i = 0;
		for (WebElement e : linkElements) {
			linkTexts[i] = e.getText();
			i++;
		}
		for (String t : linkTexts) {
			driver.findElement(By.linkText(t)).click();
			if (driver.getTitle().contentEquals(underConsTitle)) {
				System.out.println("\"" + t + "\"" + " is under construction.");
			} else {
				System.out.println("\"" + t + "\"" + " is working.");
			}
			driver.navigate().back();
		}
		driver.quit();
	}

}
