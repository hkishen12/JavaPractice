


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;


public class SynerzipRegistration {   

	public static void main(String[] args) throws InterruptedException {

		// Login to browser
		WebDriver driver= new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		if(driver.getTitle().trim().equals("Google")){
			System.out.println("Google Search page opened successfully!!");
		}else{
			System.out.println("Error in opening google search page!");
			System.exit(0);
		}

		String searchString="synerzip pune";
		WebElement googleSearchBox=driver.findElement(By.xpath("//input[@title ='Search' and @name='q']"));
		googleSearchBox.sendKeys(searchString);
		System.out.println("Entered search text = "+ searchString);
		
		
		
		try{
			WebElement searchButton1=driver.findElement(By.xpath("//*[@name='btnG']"));
			if(searchButton1.isDisplayed())
			searchButton1.click();
		}catch(ElementNotFoundException e1){
			WebElement searchButton2=driver.findElement(By.xpath("//*[@name='btnK']"));
			searchButton2.click();
		} 


		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[1]//cite")));
		System.out.println("Text searched successfully!!");
		WebElement searchLink=driver.findElement(By.xpath("//li[1]//cite"));



		if(searchLink.getText().trim().contains("synerzip.com/")){
			WebElement clickLink=driver.findElement(By.xpath("//li[1]//h3/a"));
			clickLink.click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[.='Home' and @href='http://synerzip.com/']")));
			System.out.println("Synerzip Home page opened successfully!!");
		}

		WebElement upcomingWebinarLink=driver.findElement(By.xpath("//a[.='Upcoming Webinar']"));
		upcomingWebinarLink.click();
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='REGISTER NOW']")));
		System.out.println("Registration form page opened!!");
		
		WebElement firstName=driver.findElement(By.xpath("//*[ @name='input_1' and @type='text']"));
		WebElement lastName=driver.findElement(By.xpath("//*[ @name='input_2' and @type='text']"));
		WebElement email=driver.findElement(By.xpath("//*[ @name='input_4' and @type='text']"));
		WebElement phone=driver.findElement(By.xpath("//*[ @name='input_19' and @type='text']"));
		WebElement city=driver.findElement(By.xpath("//*[ @id='input_59_5' and @type='text']"));
		WebElement state=driver.findElement(By.xpath("//*[ @name='input_20' and @type='text']"));
		WebElement country=driver.findElement(By.xpath("//*[ @name='input_18' and @type='text']"));
		WebElement company=driver.findElement(By.xpath("//*[ @name='input_10' and @type='text']"));
		WebElement jobTitle=driver.findElement(By.xpath("//*[ @name='input_16' and @type='text']"));
		WebElement registrationLink=driver.findElement(By.xpath("//input[@value='REGISTER NOW']"));


		firstName.sendKeys("testFName_"+(1000+new Random().nextInt(999)));
		lastName.sendKeys("testLName_"+(1000+new Random().nextInt(999)));
		email.sendKeys("Myemail"+(1000+new Random().nextInt(999))+"@gmail.com");
		phone.sendKeys("9988776655");
		city.sendKeys("Pune");
		state.sendKeys("Maharashtra");
		country.sendKeys("India");
		company.sendKeys("Xyz infotech");
		jobTitle.sendKeys("QA Engineer");

		registrationLink.click();

		if(driver.getTitle().trim().equals("Thank you for Registering for 'Applying Lean Startup Principles to Agile Projects' - Webinar - Synerzip")){
			System.out.println("Registered successfully!!");
		}else{
			System.out.println("Error in Registration!");
		}

		WebElement contactUsLink=driver.findElement(By.xpath("//a[.='Contact Us']"));
		contactUsLink.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[.='Contact Us']")));
		System.out.println("Contact Us page opened!! - "+ driver.getTitle());

		WebElement firstName1=driver.findElement(By.xpath("//*[ @name='input_1' and @type='text']"));
		WebElement lastName1=driver.findElement(By.xpath("//*[ @name='input_2' and @type='text']"));
		WebElement phone1=driver.findElement(By.xpath("//*[ @name='input_19' and @type='text']"));
		WebElement email_contactUS=driver.findElement(By.xpath("//*[ @name='input_20' and @type='text']"));
		WebElement company_contactUS=driver.findElement(By.xpath("//*[ @name='input_4' and @type='text']"));
		WebElement title_contactUS=driver.findElement(By.xpath("//*[ @name='input_15' and @type='text']"));
		WebElement streetAddress=driver.findElement(By.xpath("//*[ @name='input_14.1' and @type='text']"));
		WebElement city_ContactUS=driver.findElement(By.xpath("//*[ @name='input_14.3' and @type='text']"));
		WebElement zipCode=driver.findElement(By.xpath("//*[ @name='input_14.5' and @type='text']"));
		Select countryDropdown=new Select(driver.findElement(By.xpath("//*[@id='input_2_14_6' or @name='input_14.6']")));
		Select departmentDropdown=new Select(driver.findElement(By.xpath("//*[@id='input_2_18' or @name='input_18']")));
		WebElement comment=driver.findElement(By.xpath("//*[ @name='input_17' and @id='input_2_17']"));
		Select knowAboutUsFromDropdown=new Select(driver.findElement(By.xpath("//*[@id='input_2_16' or @name='input_16']")));
		WebElement receiveEmailCheckbox=driver.findElement(By.xpath("//*[@type='checkbox' and @name='input_13.1']"));
		WebElement submitButton=driver.findElement(By.xpath("//*[@id='gform_submit_button_2' and @type='submit']"));


		firstName1.sendKeys("testFName_"+(1000+new Random().nextInt(999)));
		lastName1.sendKeys("testLName_"+(1000+new Random().nextInt(999)));
		email_contactUS.sendKeys("Myemail"+(1000+new Random().nextInt(999))+"@gmail.com");
		phone1.sendKeys("9988776655");
		company_contactUS.sendKeys("Xyz infotech");
		title_contactUS.sendKeys("QA Engineer");
		streetAddress.sendKeys("Karve Road");
		city_ContactUS.sendKeys("Pune");
		zipCode.sendKeys("411038");
		countryDropdown.selectByValue("India");
		departmentDropdown.selectByValue("Career- India");
		comment.sendKeys("Synerzip code fest testing");
		knowAboutUsFromDropdown.selectByValue("Search Engine");
		receiveEmailCheckbox.click();
		submitButton.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[.='Thank You for Contacting Us']")));
		System.out.println("Thank You for Contacting Us page opened!! - "+ driver.getTitle());
		driver.close();
		driver.quit();
	}

}
