package packageProject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;


public class ProjectDropDownBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emili\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		
		driver.get(baseURL);

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ALBANIA");

		
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);

	}

}
