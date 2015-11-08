import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class iframeradiobutton {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.quackit.com/html/codes/html_radio_button.cfm");
            
        //Switch to Iframe
        WebElement iframe = driver.findElement(By.xpath("/html/body/div[1]/div/article/div[2]/div[2]/div[2]/iframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("/html/body/form/input[1]")).click();
        System.out.println("Clicked on Radio Button Red");
        driver.switchTo().defaultContent();// Iframe is Switched to Main Again
        
        //driver.close(); // Closes the current driver instance. 
	}
}
