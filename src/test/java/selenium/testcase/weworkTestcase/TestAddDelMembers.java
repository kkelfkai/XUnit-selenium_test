package selenium.testcase.weworkTestcase;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import selenium.page.HomePage;
import selenium.testcase.Add;
import selenium.testcase.Del;

import static java.lang.Thread.sleep;

public class TestAddDelMembers {

	public static HomePage homePage;
	public static String phone = "1331111444";

	@BeforeClass
	public static void beforeAll() throws InterruptedException {
		homePage = new HomePage();
		homePage.loginWithCookie();

		//homePage.gotoContactPage().deleteMember(phone);

	}

	@AfterClass
	public static void afterAll() throws InterruptedException {

		homePage.quit();
	}


	@Test
	@Category(Add.class)
	public void addMember() throws InterruptedException {  //新添加10个成员

		for (int i=0; i <10; i ++){

			homePage.backToHome().gotoAddMembersPage().addMember(phone+i,phone+i,phone+i);
			System.out.println(phone + i);
		}
		sleep(1000);
	}

	@Test
	@Category(Del.class)
	public void deleteCurrentPage() throws InterruptedException {  //删除当前页的所有成员

		homePage.gotoAddressListPage().deleteCurrentPage();

	}

	@Test
	@Category(Del.class)
	public void deleteOnebyOne() throws InterruptedException {  //循环删除前5个成员
		homePage.gotoAddressListPage().deleteOnebyOne();
	}

}
