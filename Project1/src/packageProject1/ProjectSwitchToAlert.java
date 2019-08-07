package packageProject1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectSwitchToAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emili\\Tools\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String alertMessage = "";
		
		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		System.out.println(alertMessage);
		driver.quit();
				
		
	}

}
