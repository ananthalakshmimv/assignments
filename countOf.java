package assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countOf {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("Webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		List<WebElement> linkimg = driver.findElements(By.xpath("//a|//img|//"));
		int al = linkimg.size();
		System.out.println("the number of links and img present are:"+al);
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		int ab = buttons.size();
		System.out.println("the count of button:"+ab);
//		int buttonCount=0;
//		for(WebElement a : buttons){        
//		    if(a.getText().equals("buttonName")){
//		          buttonCount++;
//		}   
//		    System.out.println(buttonCount);
//		}
		driver.close();
		
		// TODO Auto-generated method stub

	}

}
