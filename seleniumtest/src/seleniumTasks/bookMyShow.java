package seleniumTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class bookMyShow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32new\\chromedriver 111\\chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
			
		
		WebDriver driver=new ChromeDriver(co);          
		driver.get("https://in.bookmyshow.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		driver.findElement(By.xpath("//div[text()='Varisu']")).click();
		
		driver.findElement(By.id("page-cta-container")).click();
		
		driver.findElement(By.id("wzrk-confirm")).click();
	
		driver.findElement(By.xpath("//a[@class='date-href']/child::div[contains(text(),'17')]"));
		
		
	 driver.findElement(By.xpath("//div[text()='Filter Price Range']")).click();
		
		driver.findElement(By.xpath("//label[@for='filter-0-100']")).click();
		
		//li[@data-name="INOX: Chennai Citi Centre, Dr. RK Salai"]/descendant::div[contains(text(),'10:35 PM')]
		
		driver.findElement(By.xpath("//li[@data-name='AGS Cinemas: T. Nagar']/descendant::div[@class='__text']")).click();
		driver.findElement(By.xpath("//div[@id='btnPopupAccept']")).click();
		driver.findElement(By.xpath("//li[text()='1']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Select Seats')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'8')]/ancestor::td[@class='SRow1']/descendant::div[@id='A_7_11']")).click();
		driver.findElement(By.xpath("//span[text()='Rs.190.00']/parent::a[@id='btmcntbook']")).click();
		
		

	}

}
