package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudeepkumar01\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/");
		
		
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		// driver.findElement(By.id("btn2")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Practice Site')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
		 
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sudeepumarx24@gmail.com");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sudeep@x24");
		 
		 driver.findElement(By.xpath("//input[@name=\"login\"]")).click();

	}

}
