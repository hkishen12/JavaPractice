import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragdropElements {
 
  
 WebDriver driver = new FirefoxDriver();
 
 @BeforeTest
 public void draganddrop() 
 {
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get("http://only-testing-blog.blogspot.in/2014/09/drag-and-drop.html");
 }
 
 @Test
 public void DragdropElements() throws InterruptedException   
 {
 WebElement DragFrom = driver.findElement(By.xpath("//*[@id='dragdiv']"));
 WebElement DragTo = driver.findElement(By.xpath("//*[@id='dropdiv']"));
   
 Actions builder = new Actions(driver);
 Action dragAndDrop3 =  builder.dragAndDrop(DragFrom, DragTo).build();
 dragAndDrop3.perform();
  
 Thread.sleep(2000);
  String Texttocompare = driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/div/div/div[1]/h3")).getText();
  System.out.println(""+Texttocompare);
 Assert.assertEquals(Texttocompare, "Drag and Drop");
 
 }
 
}
