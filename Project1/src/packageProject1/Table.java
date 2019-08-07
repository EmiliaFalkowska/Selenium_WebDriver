package packageProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emili\\Tools\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		String innerText = driver.findElement(
			By.xpath("//table/tbody/tr[2]/td[2]")).getText(); 	
	        System.out.println(innerText); 
		driver.quit();
		}
	}
	

