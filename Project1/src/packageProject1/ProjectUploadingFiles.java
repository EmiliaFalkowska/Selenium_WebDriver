package packageProject1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;	


public class ProjectUploadingFiles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emili\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/upload/";
		
		driver.get(baseUrl);
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		
		uploadElement.sendKeys("C:\\newhtml.html");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.name("send")).click();	
		
		
	}

}
