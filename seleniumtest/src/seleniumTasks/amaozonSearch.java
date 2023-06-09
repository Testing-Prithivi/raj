package seleniumTasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amaozonSearch {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32new\\chromedriver_win32 110  extracted\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);	
	    rob.keyPress(KeyEvent.VK_DOWN); 
	    rob.keyPress(KeyEvent.VK_DOWN); 
	    rob.keyPress(KeyEvent.VK_ENTER); 
	    driver.findElement(By.xpath("//div[@class='aok-relative']//descendant::img[@data-image-index='3']")).click();
	    
		
	}

}
