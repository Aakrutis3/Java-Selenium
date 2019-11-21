package SeleniumPkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioBtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tinyurl.com/cn5pum8");		
		driver.manage().window().maximize();
		
		List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@type='radio']"));		
		System.out.println(radioBtns.size());
		
		for(int i = 0; i < radioBtns.size(); i++) {
			System.out.println(radioBtns.get(i).getText());
		}		
		driver.quit();
	}

}
