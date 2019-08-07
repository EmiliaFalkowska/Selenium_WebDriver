package packageProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;

public class DynamicTable2 {

	public static void main(String[] args) {
    	WebDriver wd;
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\emili\\Tools\\chromedriver.exe");
		
    	wd= new ChromeDriver();
        wd.get("http://demo.guru99.com/test/web-table-element.php"); 
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement baseTable = wd.findElement(By.tagName("table"));
        
        WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));

        String rowtext = tableRow.getText();
        System.out.println("Third row of table: " + rowtext);
        
        WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
        
        String valueIneed = cellIneed.getText();
        System.out.println("Cell value is: " + valueIneed);
        wd.close();
	}

}
