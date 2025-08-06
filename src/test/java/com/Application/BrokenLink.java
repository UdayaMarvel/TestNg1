package com.Application;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	
	public static void main(String[] args) {
		ClassA a = ClassA.method();
		ClassA a1 = ClassA.method();
		System.out.println(System.identityHashCode(a1));
		System.out.println(System.identityHashCode(a));
//		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\TestNg\\src\\test\\resources\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		List<WebElement> links = driver.findElements(By.tagName("link"));
//		Iterator<WebElement> link = links.iterator();
//		while(link.hasNext()) {
//			WebElement li = link.next();
//			String href = li.getAttribute("href");
//			if(href.isEmpty() || href == null) {
//				System.out.println("Given link is empty or null");
//			}
//			else {
//				try {
//					HttpURLConnection http = (HttpURLConnection) (new URL(href).openConnection());
//					http.setRequestMethod("HEAD");
//					http.connect();
//					int responseCode = http.getResponseCode();
//					if(responseCode == 200) {
//						System.out.println("Given link is not a broken link "+href );
//					}
//					else {
//						System.out.println("Given link is a broken link "+ href);
//					}
//				} catch (MalformedURLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//		driver.quit();
	}

}
