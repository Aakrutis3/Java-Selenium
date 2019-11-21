package SeleniumPkg;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	
	public static void main(String[] args) {
		DynamicWebTable WebTbl = new DynamicWebTable();
		WebTbl.WebdriverAllMethods();		
	}
	
	public void WebdriverAllMethods() {
		System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		//java.util.List<WebElement> col = driver.findElements(By.xpath("//th[text()='Company']"));
		//List col = 
		List  col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("no. of columns are : "+col.size());		
	}
}
