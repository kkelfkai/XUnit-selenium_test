package selenium.testcase;

import org.junit.BeforeClass;
import org.junit.Test;
import selenium.page.HomePage;


public class TestWeWork {

	public static HomePage homePage;

	@BeforeClass
	public static void beforeAll(){
		homePage = new HomePage();
		homePage.loginWithCookie();

	}

	@Test
	public void testStart() throws InterruptedException {

		String phone = "13311114445";
		homePage.gotoAddMembersPage().addMember(phone,phone,phone);

	}
}