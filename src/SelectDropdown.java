import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDropdown {

	public static void main(String[] args) {
	 
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://bachecalloggi.listedisinistra.org/index.php/annunci");
        driver.findElement(By.xpath("//button[contains(text(),'Ricerca Avanzata')]")).click();
        select1(driver);
	}

        public static void select1(WebDriver driver) {
        	      //Clicking on the Element to open the dropdown. 
        		  WebElement clickme = driver.findElement(By.xpath("//*[@id='filter_energy_class_chzn']/a/span"));
        		  clickme.click();
        		  
        		  //Thread.sleep(3000);
        		  
        		  //Picking all the value from Dropdown. Use Custom Xpath for this.
        		  List<WebElement> options = driver.findElements(By.xpath("//*[@id='filter_energy_class_chzn']//*[@class='chzn-results']/li"));
        		  
        		  for (int i=0; i<options.size(); i++){
        		   if (options.get(i).getText().equalsIgnoreCase("B")){
        		    options.get(i).click();
        		   }
        		  }  
        	
        	
        	
        }
}
        	
        	
        	/*System.out.println("Trying to select");
    		WebElement element1 = driver.findElement(By.id("filter_energy_class"));
        	Select sel = new Select(element1);
        	By cssSelector = By.cssSelector("[name='filter[energy_class]']>option:last-child");
        	
        	WebElement element = new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(cssSelector));
    		element.click();

    		System.out.println(element.getText());*/
        		
        		
        	//WebElement element = driver.findElement(By.xpath("//*[@id='filter_energy_class_chzn']/a"));
        	/*WebElement element = driver.findElement(By.id("filter_energy_class"));
        	Select sel = new Select(element);
        	Thread.sleep(5000);
        	sel.selectByValue("a");*/
        
			//System.out.println("Worked");
        	//sel.selectByVisibleText("B");
			
			/*new Select(driver.findElement(By.id("filter_energy_class"))).selectByVisibleText("B");
    		
    		//this selector find the last child o
    		By cssSelector = By.cssSelector("[name='filter[energy_class]']>option:last-child");

    		//explicit wait to make sure the element present
    		WebElement element = new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(cssSelector));
    		element.click();

    		System.out.println(element.getText());*/
    	
        	
        	
