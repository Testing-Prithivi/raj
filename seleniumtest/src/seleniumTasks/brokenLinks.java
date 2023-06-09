package seleniumTasks;

import java.awt.desktop.QuitEvent;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32new\\chromedriver_win32 110  extracted\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println("total links "+list.size());
		List<String> urlList=new ArrayList<String>();
		
		for (WebElement e : list) {
			String url=e.getAttribute("href");
			urlList.add(url);
			
		}
		
		long stTime=System.currentTimeMillis();
		urlList.parallelStream().forEach(e->checkBlink(e));
		long endTime=System.currentTimeMillis();
		
		System.out.println("total time taken "+(endTime-stTime));
		
		driver.quit();
	}
	public static void checkBlink(String linkUrl) {
		try {
			URL  url=new URL(linkUrl);
			HttpURLConnection urlConnection =(HttpURLConnection) url.openConnection();
			urlConnection.setConnectTimeout(5000);
			urlConnection.connect();
			
			if (urlConnection.getResponseCode()>=400) {
				System.out.println(linkUrl +"---->"+urlConnection.getResponseMessage()+"is a broken link");
				
			}
			else {
				System.out.println(linkUrl +"--->"+urlConnection.getResponseMessage());
				
			}
		}
		catch(Exception e){
			
			
		}
	}

	}


