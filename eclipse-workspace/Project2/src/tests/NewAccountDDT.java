package tests;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


@RunWith(value = Parameterized.class)
public class NewAccountDDT {
	String name, email, phone, gender, password, country;
	boolean weeklyEmail, monthlyEmail, occasionalEmail;
	WebElement nameElement, emailElement, phoneElement, passwordElement, verifyPasswordElement, countryElement, maleRadio, femaleRadio, weeklyChceckbox, submitButton;
	WebDriver driver;	
	
	@Test
	public void newAccountTest() {
		System.out.println("NEW RECORD: " + name + " " + email + " " + phone + " " + gender + " " + password + " " + country + " " + weeklyEmail + " " + monthlyEmail + " " + occasionalEmail);
		
		defineWebElements();
		
		nameElement.sendKeys(name);
		emailElement.sendKeys(email);
		phoneElement.sendKeys(phone);
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
			if(!weeklyChceckbox.isSelected()) {
				weeklyChceckbox.click();
			}
		}
		else {
			if (weeklyChceckbox.isSelected()) {
				weeklyChceckbox.click();
			}
			}
		}
	
	@Before
	public void setUp() {
		driver = utilities.DriverFactory.open("chrome");
		
		
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[2]/a")).click();
		}
		
	@After
	public void tearDown() {
		driver.quit();
	}
	
	public void defineWebElements() {
		
		nameElement = driver.findElement(By.name("ctl00$MainContent$txtFirstName"));
		emailElement = driver.findElement(By.id("MainContent_txtEmail"));
		phoneElement = driver.findElement(By.xpath("//*[@id=\"MainContent_txtHomePhone\"]"));
		passwordElement = driver.findElement(By.cssSelector("input[type='password'][id='MainContent_txtPassword'"));
		verifyPasswordElement = driver.findElement(By.name("ctl00$MainContent$txtVerifyPassword"));
		maleRadio = driver.findElement(By.name("ctl00$MainContent$Gender"));
		femaleRadio = driver.findElement(By.id("MainContent_Female"));
		countryElement = driver.findElement(By.id("MainContent_menuCountry"));
		weeklyChceckbox = driver.findElement(By.name("ctl00$MainContent$checkWeeklyEmail"));
		submitButton = driver.findElement(By.id("MainContent_btnSubmit"));
				
	}
	@Parameters
	public static List<String[]> getData() {
		return utilities.CSV.get("C:\\Users\\emili\\Downloads\\UserAccounts.csv");
	}
	public NewAccountDDT(String name, String email, String phone, String gender, String password, String country, String weeklyEmail, String monthlyEmail, String occasionalEmail) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.password = password;
		this.country = country;
		
		if (weeklyEmail.equals("TRUE")) { this.weeklyEmail = true; }
		else { this.weeklyEmail = false; }
		
		if (monthlyEmail.equals("TRUE")) { this.monthlyEmail = true; }
		else { this.monthlyEmail = false; }
		
		if (occasionalEmail.equals("TRUE")) { this.occasionalEmail = true; }
		else { this.occasionalEmail = false; }
		
		
		
		
	}
	
	
	
	
}
