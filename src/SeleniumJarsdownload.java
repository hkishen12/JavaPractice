import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumJarsdownload {

 public static FileInputStream ip;
 public static Properties config;
 public static WebDriver driver;

 @BeforeMethod public void doBeforeStuff() throws IOException{
  
  
  FirefoxProfile profile = new FirefoxProfile();
  profile.setPreference("browser.download.folderList", 2);
  profile.setPreference("browser.download.manager.showWhenStarting",false);
  profile.setPreference("browser.download.dir", System.getProperty("user.dir")+"\\src");
  //profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
  profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/java-archive");
  driver = new FirefoxDriver(profile);
  
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.manage().window().maximize();
  System.out.println(System.getProperty("user.dir"));

  
 }

 @Test public void doLogin() throws InterruptedException{

  System.out.println("inside test");
  driver.get("http://docs.seleniumhq.org/download/");
  //driver.findElement(By.xpath("//*[@id='mainContent']/table[1]/tbody/tr[1]/td[4]/a")).click();
  driver.findElement(By.xpath("//*[@id='mainContent']/p[3]/a")).click();
  

 }
}