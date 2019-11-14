package selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.logs.Log;

import static java.lang.Thread.sleep;

public class BasePage {

	public static WebDriver driver;
	public static Log log = new Log();

	public WebElement findElement(By by, int timeout){
		log.printLog(by.toString());
		if (timeout > 0){
			waitToBeClickable(by, timeout);
		}
		return driver.findElement(by);

	}
	

	public void waitToBeClickable(By by, int timeout){
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(by));
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(by));
	}

	public void quit() throws InterruptedException {
		sleep(5000);
		driver.quit();
	}
}
