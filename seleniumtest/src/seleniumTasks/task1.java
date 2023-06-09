package seleniumTasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Enter;

public class task1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.id("firstName"));
		username.sendKeys("jerry");
		//Thread.sleep(3000);
		WebElement lasName = driver.findElement(By.id("lastName"));
		lasName.sendKeys("jon");
		//Thread.sleep(3000);
		WebElement emailId = driver.findElement(By.id("userEmail"));
		emailId.sendKeys("prithivivijayan95@gmail.com");
	//	Thread.sleep(3000);
		WebElement sex= driver.findElement(By.xpath("//label[text()='Male']"));
		sex.click();
		//Thread.sleep(3000);
		WebElement mobile = driver.findElement(By.id("userNumber"));
		mobile.sendKeys("9265879056");
		
		Thread.sleep(4000);
		WebElement Dob= driver.findElement(By.id("dateOfBirthInput"));
		Dob.click();
		
		Thread.sleep(3000);
		WebElement year= driver.findElement(By.className("react-datepicker__year-select"));
		year.click();
		Select obj = new Select(year);
		obj.selectByValue("1988");
		//Thread.sleep(3000);
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		year.click();
		Select obj1 = new Select(month);
		obj1.selectByValue("5");
		
		Thread.sleep(3000);
		WebElement date = driver.findElement(By.xpath("//div[text()='24']"));
		date.click();
		
//		Thread.sleep(3000);
	//	WebElement sendInputs = driver.findElement(By.xpath("//div[@id='subjectsContainer']/descendant::div"));
//   sendInputs.sendKeys("jnsdoilnwsah");
		
		Thread.sleep(3000);
		WebElement sport = driver.findElement(By.xpath("//label[text()='Sports']"));
		sport.click();
		WebElement Reading = driver.findElement(By.xpath("//label[text()='Reading']"));
		Reading.click();

	
		//Thread.sleep(3000);
		WebElement sendInputs2 = driver.findElement(By.id("currentAddress"));
		sendInputs2.sendKeys("jnsdoilnwsah",Keys.TAB);
		
	
		//Thread.sleep(3000);
		WebElement state = driver.findElement(By.xpath("//div[text()='Select State']"));
		state.click();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
	
		
		//Thread.sleep(3000);
		WebElement city = driver.findElement(By.xpath("//div[text()='Select City']"));
		city.click();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		WebElement sub = driver.findElement(By.id("submit"));
		sub.click();
		
	}

}
