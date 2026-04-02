package jupilens_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://jupilens.com/");
	Thread.sleep(2000);
	Actions act = new Actions(driver);
	
	WebElement hoverTarget = driver.findElement(By.xpath("//button[contains(text(), 'Sign In')]"));
	act.moveToElement(hoverTarget).build().perform();
	Thread.sleep(3000);
	
	WebElement loginTalent = driver.findElement(By.xpath("//button[contains(text(), 'Login as Talent')]"));
	loginTalent.click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("email")).sendKeys("ankitiwari169@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.id("password")).sendKeys("Pass@543213");
	Thread.sleep(3000);
	
	WebElement signnin = driver.findElement(By.xpath("//button[@type='submit']"));
	signnin.click();
	
	Thread.sleep(3000);
	driver.quit();
	
	
}
}
