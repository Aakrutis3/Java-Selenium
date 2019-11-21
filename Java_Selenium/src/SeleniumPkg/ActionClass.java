package SeleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");		
		driver.manage().window().maximize();
		
		
		Actions action = new Actions(driver);		
		WebElement sourceEle = driver.findElement(By.xpath("//li[@class='block13 ui-draggable'][@id='fourth'][1]//a[@class='button button-orange']"));
		WebElement targetEle = driver.findElement(By.xpath("//ol[@id='amt7']"));
		/*
		WebElement sourceEle = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement targetEle = driver.findElement(By.xpath("//ol[@id='bank']"));
		*/
		action.dragAndDrop(sourceEle, targetEle).build().perform();
		
		//action.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();

	}

}
