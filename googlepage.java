package assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlepage {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("Webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("oneplus 7",Keys.ENTER);
		Thread.sleep(2000);
		
		int main = driver.findElement(By.xpath("//div[@id='cnt']")).getLocation().getY();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		for(int i=2;i<=10;i++){
			
		
		List<WebElement> page = driver.findElements(By.xpath("//div/following::span/div/table[@id='nav']/descendant::tr/td/a[text()='"+i+"']"));
		
		for(WebElement op:page){
			i++;
			op.click();
		}
		List<WebElement> link = driver.findElements(By.xpath("//div/div[@class='rc']/div[@class='r']/descendant::a/h3"));
		for(WebElement l:link){
			String all = l.getText();
			if(all.contains("OnePlus sends accidental push notification saying 'hahahaha ...")){
				
				
				System.out.println(all);
			}
			else{
				jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				//op.click();
				
			
			}
			}
		}
		}
	
		
		//div/div[@class='rc']/div[@class='r']/descendant::a/h3
		 
		//div/following::span/div/table[@id='nav']/descendant::tr/td/a[text()='2']
		

	}


