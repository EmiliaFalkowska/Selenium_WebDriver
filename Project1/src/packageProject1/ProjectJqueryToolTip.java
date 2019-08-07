package packageProject1;
import org.openqa.selenium.interactions.Actions;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;	


public class ProjectJqueryToolTip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emili\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/tooltip.html";
		String expectedTooltip = "What's new in 3.2";
		
		driver.get(baseUrl);
		WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));
		
		Actions builder = new Actions (driver);
		
		builder.clickAndHold().moveToElement(download);
		builder.moveToElement(download).build().perform();
		
		WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));
		
		String actualTooltip = toolTipElement.getText();
		
		System.out.println("Actual Titile of Tooltip: "+actualTooltip);
		if(actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test Case Passed");
		}
		driver.close();

	}

}
