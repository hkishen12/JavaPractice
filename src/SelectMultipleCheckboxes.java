import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SelectMultipleCheckboxes {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.wufoo.com/gallery/templates");
        
        //Verification for correct page
        if(driver.getTitle().trim().equals("Online Form Template | Wufoo")){
			System.out.println("Online Form Template page opened successfully!!");
		}else{
			System.out.println("Error in opening online form page!");
			System.exit(0);
		}
        
        //Click on Registrations Tab
        driver.findElement(By.xpath("//*[@id='reg']")).click();
        //Click on Call for Proposals Tab
        driver.findElement(By.xpath("//*[@id='stage']/tbody/tr/td[2]/ul/li[2]/a/b")).click();
      
        //Switch to Iframe
        WebElement iframe = driver.findElement(By.xpath("//*[@id='wufooFormwu07ihv0jonvuv']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//*[@id='Field10']")).click();
        
        //Capturing all xpath in the list
        List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement el : elements) {
        	if (!el.isSelected()) 
        		el.click();
        	System.out.println("Checkboxes are selected");
        	
        }
       
        driver.switchTo().defaultContent();// Iframe is Switched to Main Again
        
        driver.close(); // Closes the current driver instance. 
        driver.quit(); // Closes all instances of browser.
        
	  }  
	}



