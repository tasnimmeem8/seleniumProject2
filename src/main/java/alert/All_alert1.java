package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class All_alert1 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver ();
		driver.navigate().to("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElementByXPath("//button[@onclick='jsAlert()']").click();
        driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        WebElement text = driver.findElementByXPath("//p[text()='You successfully clicked an alert']");
        System.out.println(text.getText());
        
        driver.findElementByXPath("Click for JS Confirm").click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        driver.findElementsByCssSelector("");
	}

}
