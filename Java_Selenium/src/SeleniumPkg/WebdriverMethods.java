package SeleniumPkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {
	
	public static void main(String[] args) {
		WebdriverMethods wd = new WebdriverMethods();
		wd.WebdriverAllMethods();		
	}
	
	public void WebdriverAllMethods() {
		System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://hgmventures.atlassian.net/secure/Dashboard.jspa");
		
/*		System.out.println("driver.getCurrentUrl() "+driver.getCurrentUrl());
		System.out.println("driver.getTitle() "+driver.getTitle());
		System.out.println("driver.getClass() "+driver.getClass());*/
		//System.out.println("driver.getPageSource() "+driver.getPageSource());
		System.out.println("driver.findElements= "+driver.findElements(By.tagName("div")));
		System.out.println("driver.findElement gettext= "+driver.findElement(By.tagName("div")).getText());
	/*	System.out.println("driver.navigate()) = "+driver.navigate());*/
		
		
		driver.close();
	}

}
