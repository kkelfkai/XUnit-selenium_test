package selenium.page.manageTools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import selenium.page.BasePage;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class SendMessagesPage extends BasePage {

	//发消息
	public SendMessagesPage sendPost(String user, String title, String body, String ab, String author) throws InterruptedException {
		sleep(3000);
		System.out.println("send message");

		findElement(By.linkText("选择需要发消息的应用"),2).click();

		findElement(By.cssSelector(".ww_icon_AppNotice"),2).click();

		findElement(By.linkText("确定"),2).click();

		findElement(By.linkText("选择发送范围"),2).click();

		findElement(By.id("memberSearchInput"),2).sendKeys(user);

		findElement(By.cssSelector(".ww_searchResult_title_peopleName"),2).click();

		findElement(By.linkText("确认"),2).click();

		findElement(By.cssSelector(".ww_editorTitle"),2).sendKeys(title);

//		System.out.println(driver.getWindowHandles());
//		System.out.println(driver.getPageSource());

		//切换到frame里，再切换回来
		driver.switchTo().frame(0);
		findElement(By.cssSelector(".msg_noticeEditor_frameBody"),2).sendKeys(body);
		driver.switchTo().defaultContent();

		//((JavascriptExecutor)(driver)).executeScript("window.scrollTo(0,2000)");

		//滚动到页面底部。顶部："window.scrollTo(0,0)"
		((JavascriptExecutor)(driver)).executeScript("window.scrollTo(0,document.body.scrollHeight)");

		//坑：摘要对话框，需要先点击，才能输入。页面布局会变化。
		findElement(By.cssSelector(".msg_edit_infoItem_textWord"),2).click();

		findElement(By.cssSelector(".qui_textarea"),2).sendKeys(ab);

		findElement(By.cssSelector(".js_amrd_sendName"),2).sendKeys(author);

		findElement(By.linkText("发送"),2).click();
		waitToBeClickable(By.linkText("确定"),2);
		findElement(By.linkText("确定"),2).click();

		sleep(5000);

		return this;

	}

	//已发送
	public void postList(){

	}

	public List<String> getSendMsg() throws InterruptedException {

		findElement(By.linkText("已发送"),2).click();

		List<String> msg = new ArrayList<>();
		driver.findElements(By.cssSelector(".msg_history_msgList_td")).forEach(element ->
				msg.add(element.getText()));

		return msg;
	}

	//素材库
	public void materialStore(){

	}


}
