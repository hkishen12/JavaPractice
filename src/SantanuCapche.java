import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SantanuCapche {
 
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.zotero.org/user/register/");
        driver.findElement(By.id("username")).sendKeys("santanusahoo101");
        driver.findElement(By.id("email")).sendKeys("santanusahoo101@gmail.com");
        driver.findElement(By.id("email2")).sendKeys("santanusahoo101@gmail.com");
        driver.findElement(By.id("password")).sendKeys("santanusahoo101");
        driver.findElement(By.id("password2")).sendKeys("santanusahoo101");
       /* driver.switchTo().frame(0);
        JavascriptExecutor js = (JavascriptExecutor) driver; 
        js.executeScript("document.getElementsByName('recaptcha_response_field')[0].setAttribute('value', 'src=" https://www.google.com/recaptcha/api/image?c=03AHJ_VuvB80pRmCFngJfO71_eLChTEoCYj_wKjlU5Qa4_njhWtgt8khzxa67bG2qdsRdbgeUPGEhmS_PbC4B3jktkc3aUbOvwrqs_Qj__6YTqcHDQr1aT3irrwQacgboUdQfcfP1zTZpk5mooJxAGN3BFecrMyvtL9J57NoNV7QmiPZT-7PQhIwo5zg_k0RmzoVlnsgJPkYh-lBsok183ay_1pXZ_plxjPJdFat6waWFZznTPruKWZE8uPLpkrKc0fkYo518f0yc3Wi-bVRKmrQ6zTqVGnpF1hA&th=,nm-w-Onn773TCHu2VzJTOtvOPRrwAAAAH6AAAAAI2ADfMirrQOkFZqAVjT7N_bo4ZzM8-L0rATtsWTwPJHjNvV452bJJvbkw2cyMJcJmZQ9S13iENpgLY3iEcD6rGCb3hpdxtWYRQpNMvcnB38DpxKuIbi4EoWF9Ybx7nl2_2zVPfn9eItiFNIWYU642psgdQA61Pv99lojCIh2xW3OClTIZwz6MMaRX_UlmSqqH4PzVQCgy15T42K5NtxqKiUN4U9-tWUO--J0diAxfaQR-mAPKrsmNrQPoSGLpCBYBQMVixVZTZlrIE1greunBdbuZS1CxaCxXAg4aLNZOwNVI8g"')");
*/ 
       driver.findElement(By.name("recaptcha_response_field")).sendKeys("23129555894");
       driver.findElement(By.name("register")).click();
       
    }
}
