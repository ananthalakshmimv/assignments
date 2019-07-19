package assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclassassignment {
	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
}	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://www.makemytrip.com/");
	
	driver.findElement(By.xpath("//span[@class='arrow arrowDown']")).click();
	WebElement drop = driver.findElement(By.xpath("//div[@class='moreOption font16 latoBold']"));
	Select s=new Select(drop);
	
	System.out.println(s.isMultiple());
	
	List<WebElement> opt = s.getOptions();
	  int count = opt.size();
	  System.out.println(count);
	  
	  for(  WebElement o:opt)
	  {
		  String sc=o.getText();
		  System.out.println(sc);
	  }
	
	
	
		// TODO Auto-generated method stub

	}

}
