package seleniumTasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32new\\chromedriver_win32 110  extracted\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches",Keys.ENTER);
		
		List<WebElement>obj=driver.findElements(By.xpath("//div[@data-asin]"));
		obj.get(3).click();
		/*
		 * driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone13"
		 * ); Robot obj=new Robot(); obj.keyPress(KeyEvent.VK_DOWN);
		 * obj.keyPress(KeyEvent.VK_DOWN); obj.keyPress(KeyEvent.VK_DOWN);
		 * obj.keyPress(KeyEvent.VK_DOWN); obj.keyPress(KeyEvent.VK_DOWN);
		 * obj.keyPress(KeyEvent.VK_ENTER);
		 * 
		 * List<WebElement> prods = driver.findElements(By.xpath("//div[@data-id]"));
		 * prods.get(5).click();
		 * 
		 */
	}
		
		
		
		
		
		

	}
