import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class userId {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://qlb21.resources.hewitt.com/cl77ybr5qc/ybr5cl772b/CsLogn010InptOpen.do?fTkn=539f4eddc99aef9eb1c8da11d13a3654&fWdw=intro&eWlmYBR5ClntId=00398&wdw=primary&fPg=%2FCsLogn005WelcOpen");
        System.out.println("Entered Url");
        WebElement frame=driver.findElement(By.xpath("//*[@id='lightbox_iframe_cookieBanner']"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//*[@id='lightboxarea']/div/div/a[1]")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[@id='usrId']")).sendKeys("hari");
        System.out.println("Entered the userid");
        driver.findElement(By.xpath("//*[@id='pswd']")).sendKeys("Password");
        System.out.println("Entered the Password");
       
	}

}
