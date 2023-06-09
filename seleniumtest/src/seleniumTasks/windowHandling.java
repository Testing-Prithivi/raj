package seleniumTasks;

import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowHandling {

	private static final String List = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32new\\chromedriver 111\\chromedriver.exe");

		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String oldWindow = driver.getWindowHandle();
		System.out.println(oldWindow);
		System.out.println(driver.getCurrentUrl());
		 
		WebElement wh=driver.findElement(By.id("home"));
		wh.click();
		
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles);
		List<String> list= new ArrayList<String>(handles);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		
		
		driver.switchTo().defaultContent();
		//driver.switchTo().window(list.get(0));
		//driver.close();
		
		
		Set<String> WindowHandles2=driver.getWindowHandles();
		list.clear();
		list.addAll(WindowHandles2);
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getCurrentUrl());
		
		
		
		
	
		
		
		
		
	
		
		/*	for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
			
		}
		driver.close();*/
		
		
		
		

		Set s=new HashSet<>();
		s.add(1);
		s.add(2);
		
		s.stream().forEach(System.out::println);
		
		
		
		

	}

}
