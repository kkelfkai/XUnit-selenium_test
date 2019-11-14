package selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import selenium.page.addressList.AddressListPage;
import selenium.page.addressList.DepartmentPage;
import selenium.page.manageTools.ManageToolsPage;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class HomePage extends BasePage{

	public HomePage loginWithCookie(){

		String url = "https://work.weixin.qq.com/";

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setCapability("pageLoadStrategy", "none");

		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //隐式等待
		driver.get(url);
		driver.manage().window().maximize();
		findElement(By.linkText("企业登录"),2).click();

		//add cookies，绕过扫码登录
		driver.manage().addCookie(new Cookie("wwrtx.refid","31164998181279704"));
		driver.manage().addCookie(new Cookie("wwrtx.sid","aU8hANKeWjhY7mC4f7QEJ7iRy3eh1X9KzDL46-9aGXjZngtvVa5a5FxVLWw70vfa"));

		driver.navigate().refresh();
		return this;

	}

	public AddressListPage gotoAddressListPage(){
		try {
			sleep(500);
			findElement(By.linkText("通讯录"),2).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return new AddressListPage();
	}

	public DepartmentPage gotoDepartmentPage() {
		try {
			sleep(500);
			findElement(By.linkText("通讯录"),2).click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return new DepartmentPage();
	}

	public AddressListPage gotoAddMembersPage(){

		findElement(By.linkText("添加成员"),2).click();
		return new AddressListPage();

	}

	public ManageToolsPage gotoManageToolsPage() throws InterruptedException {
		findElement(By.linkText("管理工具"),2).click();
		return new ManageToolsPage();
	}


	public HomePage backToHome() throws InterruptedException {

		findElement(By.linkText("首页"),2).click();
		return new HomePage();
	}

//	public AddressListPage gotoAppManagementPage(){
//		return new AddressListPage();
//	}
//
//	public AddressListPage gotoCustomRelationPage(){
//		return new AddressListPage();
//	}
//
//	public AddressListPage gotoManageToolsPage(){
//		return new AddressListPage();
//	}
//
//	public AddressListPage gotoMyCompany(){
//		return new AddressListPage();
//	}


}
