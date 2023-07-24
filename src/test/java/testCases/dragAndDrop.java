package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudeepkumar01\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/");
		
		
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		 driver.findElement(By.xpath("//a[contains(text(),'Demo Site')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Interactions')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]")).click();
		 //add
		 driver.findElement(By.xpath("//a[contains(text(),'Static')]")).click();
		 
		 //
		 
		 driver.switchTo().frame( driver.findElement(By.className("row")));
		 
		 WebElement drag = driver.findElement(By.id("angular"));
		 WebElement drop = driver.findElement(By.id("droparea"));
		 
		 Actions ac = new Actions(driver);
		 ac.dragAndDrop(drag, drop).perform();
		  

	}

}
