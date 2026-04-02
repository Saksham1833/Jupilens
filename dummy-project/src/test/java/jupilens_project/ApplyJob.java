package jupilens_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApplyJob {
	public static void main(String[] args) throws InterruptedException {

// Open the Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

// Go to Jupilens
		driver.get("https://jupilens.com/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);

// Click on Sign In
		WebElement hoverTarget = driver.findElement(By.xpath("//button[contains(text(), 'Sign In')]"));
		act.moveToElement(hoverTarget).build().perform();
		Thread.sleep(3000);

// Click on Login as Talent
		WebElement loginTalent = driver.findElement(By.xpath("//button[contains(text(), 'Login as Talent')]"));
		loginTalent.click();
		Thread.sleep(3000);

// Enter email
		driver.findElement(By.id("email")).sendKeys("ankitiwari169@gmail.com");
		Thread.sleep(1000);
// Enter password
		driver.findElement(By.id("password")).sendKeys("Pass@543213");
		Thread.sleep(1000);

// Click on SignIn button to Submit
		WebElement signnin = driver.findElement(By.xpath("//button[@type='submit']"));
		signnin.click();
		Thread.sleep(2000);

// Click on Explore
		driver.findElement(By.xpath("//nav[contains(@class, 'flex')]//a[text()= 'Explore']")).click();
		Thread.sleep(2000);
		
// Scroll to Python Developer	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement jobTitle = driver.findElement(By.xpath("//h3[contains(text(), 'Sales Expert')]/ancestor::div[@role='button']"));
		js.executeScript("arguments[0].scrollIntoView(true);", jobTitle);
		Thread.sleep(1000);
		jobTitle.click();
		
// Click on Apply Now Button
		WebElement applyNow = driver.findElement(By.xpath("//button[contains(text(), 'Apply Now')]"));
		Thread.sleep(1000);
		applyNow.click();
		
// Click on Proceed To Apply
		WebElement proceedToApply = driver.findElement(By.xpath("//button[contains(text(), 'Proceed to Apply')]"));
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(1500);
		proceedToApply.click();
		
// Click on Submit Application
		WebElement submitApp = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(1500);
		submitApp.click();
		
// Click on Profile dropdown
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[contains(text(), 'A')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(), 'Logout')]")).click();
		
		
		
// Quit browser
		Thread.sleep(2000);
		driver.quit();

	}
}
