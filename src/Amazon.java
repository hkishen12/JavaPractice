import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Amazon {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
	  
		WebDriver driver = new FirefoxDriver();
		System.out.println("Firefox browser opened");
		driver.get("http://www.amazon.in");
		System.out.println("Amazon website opened");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains (text(), 'Hello. Sign in')]")).click();
		System.out.println("1st Click");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-nav-ref='nav_signin']/span")).click();
		System.out.println("2nd Click");
		
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement CogLink=driver.findElement(By.xpath("//span[contains (text(), 'Hello. Sign in')]"));
		WebElement SignInLink=driver.findElement(By.xpath("//*[@data-nav-ref='nav_signin']/span"));
		wait.until(ExpectedConditions.elementToBeClickable(CogLink));
		Actions  actions  = new Actions(driver);
		actions.moveToElement(CogLink).moveToElement(SignInLink).click().build().perform();
		Thread.sleep(2000);
		System.out.println("Clicked On SignIn");*/
		
        call(driver);
	}
      
	public static void call(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("hkishen12@gmail.com");
		driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("Hravi12345");
		driver.findElement(By.xpath("//*[@id='signInSubmit-input']")).click();
		
		String welcome = driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[1]")).getText();
		System.out.println( welcome + "- Have A Nice Experience With Amazon");
		
		
		
	}
}
