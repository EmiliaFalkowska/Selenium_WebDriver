package packageProject1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;	
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ProjectSendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emili\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://www.facebook.com/";
		
		driver.get(baseUrl);
		WebElement txtUsername = driver.findElement(By.id("email"));
		
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
				.moveToElement(txtUsername)
				.click()
				.keyDown(txtUsername, Keys.SHIFT)
				.sendKeys(txtUsername, "hello")
				.keyUp(txtUsername, Keys.SHIFT)
				.doubleClick(txtUsername)
				.contextClick()
				.build();

				seriesOfActions.perform();
	}

}
