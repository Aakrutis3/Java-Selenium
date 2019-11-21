package utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {		

		 System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();		
		 driver.get("https://shipping-qa.exela.global");
	}
}
