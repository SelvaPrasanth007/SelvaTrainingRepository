package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();	
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Selenium");
		
		WebElement button = driver.findElement(By.name("btnK"));
		button.submit();
		
		driver.close();
		
		

	}

}
