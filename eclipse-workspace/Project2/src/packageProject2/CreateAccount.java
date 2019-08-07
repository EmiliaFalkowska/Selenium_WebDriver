package packageProject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\emili\\Tools\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[2]/a")).click();
		
		driver.findElement(By.name("ctl00$MainContent$txtFirstName")).sendKeys("Mary Smith");
		driver.findElement(By.id("MainContent_txtEmail")).sendKeys("ms@testemail.com");
		
		driver.findElement(By.xpath("//*[@id=\"MainContent_txtHomePhone\"]")).sendKeys("12345679067");
		
		driver.findElement(By.cssSelector("input[type='password'][id='MainContent_txtPassword'")).sendKeys("mspass");
		driver.findElement(By.name("ctl00$MainContent$txtVerifyPassword")).sendKeys("mspass");
		
		driver.findElement(By.id("MainContent_Female"));
		
		new Select(driver.findElement(By.id("MainContent_menuCountry"))).selectByVisibleText("Germany");
		
		driver.findElement(By.name("ctl00$MainContent$checkMonthlyEmail")).click();
		driver.findElement(By.id("MainContent_btnSubmit")).click();
		
		String conf = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
		System.out.println("CONFIRMATION "+conf);
		
		driver.close();
	}

}
