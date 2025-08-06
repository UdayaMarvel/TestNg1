package com.Application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NewClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\Workspace\\TestNg\\src\\test\\resources\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
	}

}
