package com.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vivekananda.Yaram\\workspace\\SeleniumTraining\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Wikipedia:External_links");
		driver.manage().window().maximize();
		
		int n = 7;
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		
		ArrayList<WebElement> arrList = new ArrayList<> ();
		arrList.addAll(links);
		
		if(size==0) {
			
			throw new Exception("The Link is not a valid wiki link");
		}
		
		for(int i =1;i<=n;i++) {
			
			links.get(i).click();
			arrList.addAll(driver.findElements(By.tagName("a")));
		}
		
		driver.quit();
	}
}