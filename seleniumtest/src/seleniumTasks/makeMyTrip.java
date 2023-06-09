package seleniumTasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class makeMyTrip {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32new\\chromedriver 111\\chromedriver.exe");

		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
				
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mumbai");
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		
		
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("delhi");
		Robot rob1=new Robot();
		rob1.keyPress(KeyEvent.VK_DOWN);
		rob1.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		rob1.keyPress(KeyEvent.VK_ENTER);
		
	}

}
