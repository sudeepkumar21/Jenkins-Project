package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudeepkumar01\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/");
		
		
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		 //driver.findElement(By.id("btn2")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Practice Site')]")).click();
		 

		 
		 driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
		 

		 driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]")).click();
		//org.openqa.selenium.Alert alert2= driver.switchTo().alert();
		 //String TextOnAlert= alert2.getText();
		 //System.out.println("Alert message:" + alert2.getText());
		// alert2.accept();
		 
		
		 //alert2.dismiss();
		 
		// org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		  //alert2.sendKeys("Sudeep");
		 // System.out.println("Alert message:" + alert2.getText());
		  
		  //alert2.accept();
		 
		 driver.findElement(By.xpath("//input[@id='reg_email']")).sendKeys("sudeepumarx24@gmail.com");
		 driver.findElement(By.xpath("//input[@id='reg_password']")).sendKeys("Sudeep@x24");
		 
		 driver.findElement(By.xpath("//input[@name=\"register\"]")).click();
		 
		 
		
		

	}

}
