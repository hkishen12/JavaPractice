import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Pagesource
{
public static void main(String[] args)
{
    Pagesource.loadPage("http://photos.filmibeat.com/celebs/kajal-aggarwal/photos-c14-e13421-p592995.html");
}
public static void loadPage(String url)
{
    WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get(url);

    String html = driver.getPageSource();

    System.out.println(html);

    driver.quit();      
}
}