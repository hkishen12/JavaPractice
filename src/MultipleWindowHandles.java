import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MultipleWindowHandles {
	
	public static void main(String[] args) {
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 driver.get("http://www.salesforce.com/in/");
	 String mainwindow = driver.getWindowHandle();
	 System.out.println(mainwindow);
	 driver.findElement(By.xpath("//*[@id='layout']/div[1]//div[2]/div/div/ul/li[1]/a")).click();
	 driver.findElement(By.xpath("//*[@id='bannerfreetrialbtn']")).click();
	 
	 for (String currentHandle:driver.getWindowHandles()) {
        driver.switchTo().window(currentHandle);
        String windowtitle=driver.getTitle();
        System.out.println(windowtitle);
        if (windowtitle.contains("Small Business CRM & Contact Manager Software - Salesforce.com India")) 
        	break;
        }
        
        String name=driver.findElement(By.xpath("//*[@id='sticky-nav']//li[2]/a")).getText();
        System.out.println(name);
        String popupHandle = driver.getWindowHandle();
        System.out.println(popupHandle);
        driver.findElement(By.xpath("//*[@id='layout']//div[2]/div/p[2]/a[1]")).click();
        
        for (String currentpopup : driver.getWindowHandles()) {
        	driver.switchTo().window(currentpopup);
        	String popupTitle = driver.getTitle();
        	System.out.println(popupTitle);
        	if (popupTitle.contains("Demo: Small Business Center - Salesforce.com India"))
        		break;
        }
        
        driver.findElement(By.xpath("//*[@id='UserFirstName']")).sendKeys("Hari");
        driver.findElement(By.xpath("//*[@id='UserLastName']")).sendKeys("Kishen");
        driver.close();
        driver.switchTo().window(popupHandle);
        driver.close();
        driver.switchTo().window(mainwindow);
        driver.quit();
	}
	   

   }


