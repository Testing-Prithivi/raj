package seleniumTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class kayak {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32new\\chromedriver 111\\chromedriver.exe");

		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
				
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.kayak.co.in/flights/MAA-BLR/2023-05-10/2023-05-11?sort=bestflight_a");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.xpath(""));
	}

}
