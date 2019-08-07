package packageProject1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;	
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class ProjectMoveToElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\emili\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		
		driver.get(baseUrl);
		WebElement link_Home = driver.findElement(By.linkText("Home"));
		WebElement td_Home = driver.
				findElement(By.
						xpath("//html/body/div"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr"));

		Actions builder = new Actions(driver);
		Action mouseOverHome = builder
				.moveToElement(link_Home)
				.build();
			
		String bgColor = td_Home.getCssValue("background-color");
		System.out.println("Before hover: " + bgColor);
		mouseOverHome.perform();
		bgColor = td_Home.getCssValue("background-color");
		System.out.println("After hover: " + bgColor);
		driver.close();		
		
		
	}

}
