package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_alert {
	public ChromeDriver driver;

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver= new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElementByXPath("//button[text()='Click for JS Alert']").click();
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
	    WebElement ele = driver.findElementById("result");
	    System.out.println(ele.getText());
	    System.out.println(driver.findElementById("result"));
	    
	    driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();
	    Alert alert1 = driver.switchTo().alert();
	    alert1.getText();
	    System.out.println(alert1.getText());
	    alert1.sendKeys("Hi");
	    alert1.accept();
	    WebElement ele1 = driver.findElementById("result");
	    System.out.println(ele1.getText());
	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//button[text()='Click for JS Prompt']")));
	    

	}

}
