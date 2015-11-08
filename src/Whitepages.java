import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Whitepages
{
public static void main(String[] args)
{
    Whitepages.loadPage("https://secure.whitepages.com/signup");
}
public static void loadPage(String url)
{
    WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get(url);
    driver.manage().window().maximize();
       System.out.println("Browser opned");
    driver.findElement(By.xpath("//*[@id='user_fname']")).sendKeys("Fname");
       System.out.println("Entered Fname");
    driver.findElement(By.xpath("//*[@id='user_lname']")).sendKeys("Lname");
       System.out.println("Entered Lname");
    driver.findElement(By.xpath("//*[@id='user_email']")).sendKeys("flag123@gmail.com");
       System.out.println("Entered email");
    driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("water123");
    driver.findElement(By.xpath("//*[@class='centered top-padding clear-all']/input")).click();
    System.out.println("Welcome to whitePages");
    driver.quit();      
}
}