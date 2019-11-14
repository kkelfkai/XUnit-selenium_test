package selenium.page.manageTools;

import org.openqa.selenium.By;
import selenium.page.BasePage;

public class ManageToolsPage extends BasePage {

	public SendMessagesPage gotoSendMessagesPage() throws InterruptedException {

		findElement(By.cssSelector(".ww_icon_AppGroupMessageBig"),2).click();
		return new SendMessagesPage();
	}

	public MaterialPage gotoMaterialPage() throws InterruptedException {

		findElement(By.cssSelector(".ww_icon_AppMaterialBig"),2).click();
		return new MaterialPage();
	}
}
