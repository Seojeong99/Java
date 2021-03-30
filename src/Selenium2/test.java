package Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {
	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		 FirefoxDriver driver =  new FirefoxDriver();
		 driver.get("https://shopping.naver.com/");
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div[2]/div/div[3]/a[1]")).click();


/**
	System.setProperty("webdriver.firefos.marionette","D:\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	String baseUrl="https://www.naver.com/";
	
	driver.get(baseUrl);
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[5]/a")).click();
**/
}
	//WebDriver
}