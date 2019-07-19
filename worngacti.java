package assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class worngacti {
	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("ganga");
		WebElement pw = driver.findElement(By.name("pwd"));
		driver.findElement(By.id("loginButton")).click();
		
		
		WebElement una = driver.findElement(By.id("username"));
				una.sendKeys("admin");
		Thread.sleep(1000);
		WebElement pwa = driver.findElement(By.name("pwd"));
		pwa.sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(1000);
		
		
		
		// TODO Auto-generated method stub

	}

}
