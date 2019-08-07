package packageProject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewAccount {

	public static void main(String[] args) {
		String name = "Mary Smith";
		String email = "ms@testemail.com";
		String password = "mspass";
		String phoneNumber = "123456";
		String country = "Germany";
		String browserType = "chrome";
		String gender = "Female"; 
		boolean weeklyEmail = true;
		boolean monthlymail = false;
		boolean occasionalEmail = false;
		
		WebDriver driver;
		driver = utilities.DriverFactory.open(browserType);
				
			
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[2]/a")).click();
		
		
		WebElement nameElement = driver.findElement(By.name("ctl00$MainContent$txtFirstName"));
		WebElement emailElement = driver.findElement(By.id("MainContent_txtEmail"));
		
		WebElement phoneElement = driver.findElement(By.xpath("//*[@id=\"MainContent_txtHomePhone\"]"));
		
		WebElement passwordElement = driver.findElement(By.cssSelector("input[type='password'][id='MainContent_txtPassword'"));
		WebElement verifyPasswordElement = driver.findElement(By.name("ctl00$MainContent$txtVerifyPassword"));
		
		WebElement maleRadio = driver.findElement(By.name("ctl00$MainContent$Gender"));
		WebElement femaleRadio = driver.findElement(By.id("MainContent_Female"));
		
		WebElement countryElement = driver.findElement(By.id("MainContent_menuCountry"));
		
		WebElement weeklyCheckbox = driver.findElement(By.name("ctl00$MainContent$checkWeeklyEmail"));
		WebElement submitButton = driver.findElement(By.id("MainContent_btnSubmit"));
		
		nameElement.sendKeys(name);
		emailElement.sendKeys(email);
		phoneElement.sendKeys(phoneNumber);
		new Select(countryElement).selectByVisibleText(country);
		passwordElement.sendKeys(password);
		verifyPasswordElement.sendKeys(password);
		
		if (gender.equalsIgnoreCase("Male")) {
			maleRadio.click();
		}
		else {
			femaleRadio.click();
		}
		
		if (weeklyEmail) {
			if(!weeklyCheckbox.isSelected()) {
				weeklyCheckbox.click();
			}
		}
		else {
			if (weeklyCheckbox.isSelected()) {
				weeklyCheckbox.click();
			}
		}
		
		submitButton.click();
		
		String conf = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
		String expected = "Customer information added successfully";
		
		if (conf.equals(expected)) {
			System.out.println("CONFIRMATION "+conf);
		}
		else {
			System.out.println("TEST FAILED");
		}
		
				
		driver.close();
	}

}
