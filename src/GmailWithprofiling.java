import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GmailWithprofiling {
	 public static FileInputStream ip;
	 public static Properties config;
	 public static WebDriver driver;
	 
	 public static void profile() {
		 
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
	 
	 public static void dologin() {
		 driver.get("https://www.gmail.com");
	        driver.manage().window().maximize();
	           System.out.println("Browser opned");
	        driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("hkishen123@gmail.com");
	           System.out.println("Entered Email id");
	        driver.findElement(By.xpath("//*[@id='next']")).click();
	           System.out.println("Clicked on Next");
	        driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("24041988");
	           System.out.println("Entered the Password");
	        driver.findElement(By.xpath("//*[@id='signIn']")).click();
	           System.out.println("Welcome to gmail");
	 }
	 
	 public static void sendMail() {
	
	        driver.findElement(By.xpath("//*[@id=':3d']")).click();
	        System.out.println("Clicked on email");
	        String emailid = driver.findElement(By.xpath("//span[@class='go']")).getText();
	        emailid=emailid.substring(emailid.indexOf("<")+1, emailid.indexOf(">"));
	        System.out.println(emailid);
	        driver.findElement(By.xpath("//*[@id=':it']/div/div")).click();
	        System.out.println("Clicked on Compose mail");
	        driver.findElement(By.xpath("//*[@name='to']")).sendKeys(emailid);
	        System.out.println("Entered the TO Email Address");
	        driver.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys("My Mail");
	        System.out.println("Entered Subject of the email");
	        driver.findElement(By.xpath("//*[@role='button' and .='Send']")).click();
	        System.out.println("Clicked on send button");
	        
		 
	 }
	 
      
	
	public static void main(String[] args) throws InterruptedException {
		profile();
		dologin();
		sendMail();
        call1(driver);
        
        //driver.quit();
        //System.out.println("Closing the Browser");
           
	}
public static void call1(WebDriver driver){
	try{
		
	           List<WebElement> elements=driver.findElements(By.xpath("//div[@gh='s']/*[@role='button']"));
	        for(WebElement element:elements){
	        	String id=element.getAttribute("id");
	        	System.out.println(id);
	            if(element.isDisplayed()){
	                driver.findElement(By.id(id)).click();
	                Thread.sleep(2000);
	                driver.findElement(By.xpath("//*[@id='ms']")).click();
	                Thread.sleep(5000);
	            }          
	        }
		
		
		/*WebElement setting=driver.findElement(By.xpath("//*[@data-tooltip='Settings' and @role='button']"));
		WebElement settinginner= driver.findElement(By.xpath("//*[@role='menuitem']/div[.='Settings']"));
		  new Actions(driver).moveToElement(setting, -2, -2).click().moveToElement(settinginner, -1, -1).click().build().perform();*/
		
		
		/*System.out.println(driver.findElement(By.xpath("//*[@data-tooltip='Settings' and @role='button']")).getLocation());
		String[] co_ordinates = (driver.findElement(By.xpath("//*[@data-tooltip='Settings' and @role='button']")).getLocation().toString()).split(",");
		int x=Integer.parseInt(co_ordinates[0].replaceAll("^[0-9]", "").trim());
		int y=Integer.parseInt(co_ordinates[1].replaceAll("^[0-9]", "").trim());*/
		
		
		/*WebDriverWait wait = new WebDriverWait(driver, 60);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=':3d']"))).click();
	    System.out.println("Clicked On Settings Gear");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@role='menuitem']/div[.='Settings']"))).click();
	    System.out.println("Clicked On Setting");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='dt']")));
	    System.out.println("Settings Visible");
		
		
		Point point = driver.findElement(By.xpath("//div[@class='G-Ni J-J5-Ji'] [@gh ='s']/*[1]")).getLocation();
		System.out.println(point.x + "-" + point.y);
		
		Actions builder = new Actions(driver);  
		builder.moveByOffset(point.x, point.y).click().build().perform();
	//	builder.moveToElement(point , 10, 25).click().build().perform();
		
		System.out.println(driver.findElement(By.xpath("//div[text()='Settings']")).getLocation());*/
		
		
		/*WebElement mapObject = driver.findElement(By.xpath("//*[@data-tooltip='Settings' and @role='button']"));
	    Actions builder = new Actions(driver);
	    builder.contextClick(mapObject).perform();*/
		
		
		//Point co_ordinates = (driver.findElement(By.xpath("//*[@data-tooltip='Settings' and @role='button']")).getLocation();
		
		
		//System.out.println(co_ordinates);
		//System.out.println(driver.findElement(By.xpath("//*[@data-tooltip='Settings' and @role='button']")).getLocation());
		//System.out.println(driver.findElement(By.xpath("//*[@role='menuitem']/div[.='Settings']")).getLocation());
		
		/*String coordinates = driver.findElement(By.xpath("//someXpath")).getLocation();  
		System.out.println(coordinates.x +","+coordinates.y );*/
		
		/*driver.findElement(By.xpath("//*[@data-tooltip='Settings' and @role='button']")).click();
		driver.findElement(By.xpath("//*[@role='menuitem']/div[.='Settings']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement SettingWheel=driver.findElement(By.xpath("//*[@data-tooltip='Settings' and @role='button']"));
		WebElement SettingsLink=driver.findElement(By.xpath("//*[@role='menuitem']/div[.='Settings']"));
		wait.until(ExpectedConditions.elementToBeClickable(SettingWheel));
		Actions  actions  = new Actions(driver);
		actions.moveToElement(SettingWheel).moveToElement(SettingsLink).click().build().perform();
		Thread.sleep(2000);
		System.out.println("Clicked On Setting");*/
		
		
		
	
	}catch(Exception e){
		System.out.println(e.getMessage());
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
	}
}
}
