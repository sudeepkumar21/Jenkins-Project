package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StandAlone {

	public static void main(String[] args) {
		
				//webdriver.chrome.driver->value of path
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudeepkumar01\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
				driver.get("https://demo.automationtesting.in/Index.html");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//System.out.println(driver.getTitle());
				//System.out.println(driver.getCurrentUrl());
				  driver.findElement(By.id("btn2")).click();
				//driver.findElement(By.xpath("//span[contains(text(),'Enter Password')]/../..//input")).sendKeys("Sudeep@F");
				//driver.findElement(By.xpath("//span[contains(text(),'Login')]/../..//button")).click();
				
				//String actual_error = driver.findElement(By.xpath("//span[contains(text(),'Please enter valid Email ID/Mobile number')]")).getText();
				//String expected_error = "Please enter valid Email ID/Mobile number";
				//Assert.assertEquals(actual_error, expected_error);
				//driver.close();

	}

}
