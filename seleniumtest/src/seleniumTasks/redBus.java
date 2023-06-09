package seleniumTasks;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class redBus {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32new\\chromedriver_win32 110  extracted\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//div[@id='sign-in-icon-down']")).click();
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		WebElement ifrmae1 =driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(ifrmae1);
		
		driver.findElement(By.xpath("//div[@class='mobileInput clearfix']/child::input[@class='IP']")).sendKeys("9865380378");
		driver.switchTo().parentFrame();
		
		WebElement iframe2 = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(iframe2);
	    WebElement frame3=driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
		driver.switchTo().frame(frame3);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb ']/child::span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']")).click();
		Set <String> window =  driver.getWindowHandles();
		System.out.println(window);
		List<String> windowshandling= new ArrayList<>(window);
		driver.switchTo().window(windowshandling.get(1));
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
	   
	    	 
		
		
		
	 
	   
	 
		
//		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("koyambedu");
	//	Robot rob=new Robot();
	//	rob.keyPress(KeyEvent.VK_DOWN);
//		rob.keyPress(KeyEvent.VK_ENTER);
		
	//	Thread.sleep(3000);
		
		
		//
//		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("madurai");
	//	rob.keyPress(KeyEvent.VK_DOWN);
		//rob.keyPress(KeyEvent.VK_ENTER);
		
	//	Thread.sleep(3000);
		
	//	driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
//		driver.findElement(By.xpath("//div[@class='rb-calendar']//td[text()='Feb 2023']")).click();
//		driver.findElement(By.xpath("//div[@class='rb-calendar']//td[text()='24']")).click();
	//	driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		
		//view click
//		driver.findElement(By.xpath("//div[text()='View Seats']/ancestor::li[@id='17553934']")).click();
		
		
		
		
		
		
		

	}

	private static void get(String string) {
		// TODO Auto-generated method stub
		
	}

}
