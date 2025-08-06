package com.Application;

import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebTableTesting {
	
//	Launch the application
//	Validate the launched application
//	Validate the headers static and dynamic webtable
//	Validate the contents in the static webtable
//	Validate the contents in the dynamic webtable
	static WebDriver driver;
	static SoftAssert soft;
	@Test(priority = -1)
	public void launchTheApplication() {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\TestNg\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		soft = new SoftAssert();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Test");
	}
	
	@Test(priority = 0,enabled = false)
	public void validateApplicationLaunched() {
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("web-table")) {
			System.out.println("WebTable application launched");
		}
		else {
			System.out.println("WebTable application not launched");
		}
	}
	
	@Test(priority = 1, dependsOnMethods = "launchTheApplication")
	public void headersValidation() {
		List<WebElement> headers = driver.findElements(By.xpath("//span[contains(text(),'Demo Webtable')]"));
		Assert.assertEquals(headers.get(0).getText(),"Demo Webtable 1 (Static Table)");
		soft.assertEquals(headers.get(1).getText(),"Demo Webtable 2 (Dynamic2 Table)", "Failure at headers");
		Assert.assertEquals(headers.get(1).getText(),"Demo Webtable 2 (Dynamic2 Table)");
	}
	@Test(priority = 2)
	public void staticWebTableContentValidation() {
		List<WebElement> tableHeaders = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th/span"));
		String company = tableHeaders.get(0).getText();
		String contact = tableHeaders.get(1).getText();
		String country = tableHeaders.get(2).getText();
		List<WebElement> tr = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
			int rows = tr.size();
			
//		
		for(int i = 1;i<rows;i++) {
			WebElement row = tr.get(i);
			List<WebElement> tdata = row.findElements(By.xpath("//td/span"));
			String companyValue = tdata.get(0).getText();
			String contactValue = tdata.get(1).getText();
			String countryValue = tdata.get(2).getText();
			
			System.out.println(company +" : "+companyValue);
			System.out.println(contact +" : "+contactValue);
			System.out.println(country +" : "+countryValue);
		}
	}
	@Test(priority = 4)
	public void dynamicWebTableContentValidation() {
		soft.assertAll();
	}

}
