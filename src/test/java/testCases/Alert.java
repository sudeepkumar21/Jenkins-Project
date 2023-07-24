package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		//webdriver.chrome.driver->value of path
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudeepkumar01\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
				driver.get("https://practice.automationtesting.in/");
				
				
				//System.out.println(driver.getTitle());
				//System.out.println(driver.getCurrentUrl())
//
				  driver.findElement(By.xpath("//a[contains(text(),'Demo Site')]")).click();
				  driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")).click();
				  driver.findElement(By.xpath("//a[contains(text(),'Alerts')]")).click();
				  //driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
				  
			//	  org.openqa.selenium.Alert alert = driver.switchTo().alert();
		//		  System.out.println("Alert message:" + alert.getText());
			//	  alert.accept();
			//	  Thread.sleep(300);
				  
				  //confirm
				//  driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
				//  driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
				  
				  //org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
				//  System.out.println("Alert message:" + alert1.getText());
				 // alert1.dismiss();
				  
				  //prompt
				  driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
				  driver.findElement(By.className("btn-info")).click();
				  
				  org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
				  alert2.sendKeys("Sudeep");
				  System.out.println("Alert message:" + alert2.getText());
				  
				  alert2.accept();
				  
				  
				  //driver.findElement(By.xpath("//button[@class="danger"]")).click();
				  //driver.switchTo()
				  //driver.switchTo().frame(driver.findElement(By.id("aswift_2")));       
				  //driver.findElement(By.id("ns-7elab-e-18")).click(); //Close Ad
				  //driver.switchTo().defaultContent(); // Return to maiadn window
				  //driver.findElement(By.className("ns-7elab-e-18")).click();
				  
				  
				  //Alert alert = driver.switchTo().alert();

	}

}
