package packageProject1;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;	

public class ProjectPartialLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emili\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://demo.guru99.com/test/block.html";
		
		driver.get(baseURL);
		driver.findElement(By.partialLinkText("Inside")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Outside")).click();
		System.out.println(driver.getTitle());
		driver.quit();	
	}

}
