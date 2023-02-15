package selenium_TestCase;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
ChromeDriver driver;

	@Test
	public void creatLead() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("ABC");
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
		WebElement ele = driver.findElementByCssSelector("select[id='createLeadForm_dataSourceId']");
		Select dd = new Select(ele);
		dd.selectByVisibleText("Direct Mail");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snap/img.png");
		FileUtils.copyFile(src, dst);
		String fstwindow = driver.getWindowHandle();
		System.out.println(fstwindow);
		Set<String> allwindow = driver.getWindowHandles();
		for(String eachWindow:allwindow) {
			System.out.println(eachWindow);
		}
		Thread.sleep(2000);
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByClassName("smallSubmit")));
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Hem").perform();
		

		
		
		
		
		
		
		
	}

}
