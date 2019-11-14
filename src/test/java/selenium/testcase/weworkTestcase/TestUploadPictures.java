package selenium.testcase.weworkTestcase;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import selenium.page.HomePage;
import selenium.testcase.upload;

import java.util.List;

import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertThat;

public class TestUploadPictures {

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

	//管理工具 >> 素材库 >> 添加图片
	@Test
	@Category(upload.class)
	public void uploadPic() throws InterruptedException {
		String path = "/Users/dk/IdeaProjects/XUnit/src/TestMy/java/selenium/page/001.png";
		String filename = "001.png";

		List<String> filenames =
				homePage.gotoManageToolsPage().gotoMaterialPage().addPicture(path).getPictureName();

		System.out.println(filenames);

		assertThat(filenames, hasItem(filename));

	}
}
