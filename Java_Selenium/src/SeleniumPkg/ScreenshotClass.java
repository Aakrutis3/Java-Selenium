package SeleniumPkg;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotClass {
	
public static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {				
		ScreenshotClass ss = new ScreenshotClass();
		ss.LaunchBrowserMethod();
	}
	
	public void LaunchBrowserMethod() throws IOException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
		 driver = new ChromeDriver();		
		 driver.get("https://shipping-qa.exela.global");
		 
		// Take screenshot and store as a file format
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			// now copy the  screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, new File("D:/Aakruti/WowLOOKScreenshotIsHere.png"));
		}
}
