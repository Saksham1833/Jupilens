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
	
	Actions act = new Actions(driver);
	
	WebElement hoverTarget = driver.findElement(By.xpath("//button[contains(text(), 'Sign In')]"));
	act.moveToElement(hoverTarget).build().perform();
	
	WebElement loginTalent = driver.findElement(By.xpath("//text() = 'Login as Talent'"));
	
	driver.findElement(By.id("email")).sendKeys("ankitiwari169@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Pass@543213");
	
	WebElement signnin = driver.findElement(By.xpath("//button[@type='submit']"));
	signnin.click();
	
	Thread.sleep(3000);
	driver.quit();
	
	
}
}
