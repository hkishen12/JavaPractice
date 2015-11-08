import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.service.DriverService;

public class clickOnAllTabOfPage {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://niraame.com/beauty.html");   
        List <WebElement> Items = driver.findElements(By.xpath("//*[@class='products-grid products-grid--max-4-col first last odd']/li/a"));
        int lenght=Items.size();
        for (int i=0; i<lenght; i++) {      
            try {
                Items.get(i).click();
                System.out.println("i value :"+i+ "|title is :" +driver.getTitle() + "|Item Url is :"+driver.getCurrentUrl());
                driver.navigate().back();
                Items = driver.findElements(By.xpath("//*[@class='products-grid products-grid--max-4-col first last odd']/li/a"));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Opened all the links on the Page and hence closing the browser");
        driver.quit();
    }
}
