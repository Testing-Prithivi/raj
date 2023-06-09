package seleniumTasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amozonAddToCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32new\\chromedriver 111\\chromedriver.exe");

		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(co);

	driver.get("https://www.amazon.in");

	driver.manage().window().fullscreen();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i phones");

	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();

	driver.get("https://www.amazon.in/Apple-iPhone-13-128GB-Pink/dp/B09G9FPGTN/ref=sr_1_4?crid=2GVMWJE4C7N0&keywords=iphones&qid=1673341590&sprefix=i+phone%2Caps%2C566&sr=8-4");


	WebElement add = driver.findElement(By.id("add-to-cart-button"));

	add.click();
	}

}
