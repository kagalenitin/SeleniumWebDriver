package com.example.SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonPage {
	public static void main(String args[]){
		WebDriver wd1 = new FirefoxDriver();
		wd1.get("http://www.amazon.com");
		
		System.out.println(wd1.getTitle());
		//wd1.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone5");
		//wd1.findElement(By.cssSelector("input.nav-submit-input")).click();
		
		Actions builder = new Actions(wd1);
		Actions hover = builder.moveToElement(wd1.findElement(By.id("nav-signin-title")));
		hover.perform();
		
		System.out.println(wd1.findElement(By.id("twotabsearchtextbox")).getText());
		wd1.close();
	}
}
