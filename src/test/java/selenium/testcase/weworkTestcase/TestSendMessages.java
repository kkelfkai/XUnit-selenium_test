package selenium.testcase.weworkTestcase;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import selenium.page.HomePage;
import selenium.testcase.Send;

import java.util.List;

import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertThat;

public class TestSendMessages {

	public static HomePage homePage;

	@BeforeClass
	public static void beforeAll() throws InterruptedException {
		homePage = new HomePage();
		homePage.loginWithCookie();

	}

	@AfterClass
	public static void afterAll() throws InterruptedException {

		homePage.quit();
	}

	@Test
	@Category(Send.class)
	public void sendMessages() throws InterruptedException {  //消息工具 >> 发送公告 >> 断言是否发送成功
		String title = "kkkkk"+System.currentTimeMillis();

		List<String> sendMsg =
				homePage.gotoManageToolsPage().gotoSendMessagesPage()
						.sendPost("kangkai", title, title+title, "摘要", "kk...")
						.getSendMsg().subList(0,5);   //subList(0,5) 取前5个值

		System.out.println(sendMsg);

		//断言已发送列表中包含刚刚发送的内容。
		assertThat(sendMsg, hasItem(title));

	}
}
