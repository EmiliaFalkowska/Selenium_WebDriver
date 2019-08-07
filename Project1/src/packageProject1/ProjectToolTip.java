package packageProject1;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;	

public class ProjectToolTip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emili\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/social-icon.html";
		driver.get(baseUrl);
		String expectedTooltip = "Github";
		
		WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));
		
		String actualTooltip = github.getAttribute("title");
		
		System.out.println("Actual Title of Tooltip: " + actualTooltip);
		if(actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test Case Passed");
		}
		driver.close();
		

	}

}
