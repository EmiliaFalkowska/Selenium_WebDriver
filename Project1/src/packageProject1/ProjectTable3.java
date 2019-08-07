package packageProject1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ProjectTable3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emili\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		
		driver.get(baseUrl);
		String innerText = driver.findElement(By
				.xpath("//table/tbody/tr/td[2]/"
						+ "table/tbody/tr[4]/td/"
						+ "table/tbody/tr/td[2]/"
						+ "table/tbody/tr[2]/td[1]/"
						+ "table[2]/tbody/tr[3]/td[2]/font"))
				.getText();
		System.out.println(innerText);
		driver.quit();
		
		
	}

}
