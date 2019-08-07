package packageProject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;



public class GetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emili\\Tools\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		driver.get(baseUrl);
		
		actualTitle = driver.getTitle();
		
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		driver.close();
	}

}
