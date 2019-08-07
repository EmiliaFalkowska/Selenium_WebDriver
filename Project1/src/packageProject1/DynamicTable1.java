package packageProject1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicTable1 {
    public static void main(String[] args) {
    
    	WebDriver wd;
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\emili\\Tools\\chromedriver.exe");
		
    	wd= new ChromeDriver();
        wd.get("http://demo.guru99.com/test/web-table-element.php");         
       
        List col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are: " +col.size()); 
        
        List rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are: " + rows.size());
        wd.close();
    }
}
