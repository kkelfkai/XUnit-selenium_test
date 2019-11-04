package selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage{

	public HomePage loginWithCookie(){

		String url = "https://work.weixin.qq.com/";

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("企业登录")).click();

		//add cookies，绕过扫码登录
		driver.manage().addCookie(new Cookie("wwrtx.refid","31164998181279704"));
		driver.manage().addCookie(new Cookie("wwrtx.sid","aU8hANKeWjhY7mC4f7QEJyJhZ0rIpsilTjaL8gQFkqY24N4_-3cqVl0bMCRe7pnp"));

		driver.navigate().refresh();
		return this;

	}


	public AddressListPage gotoAddMembersPage(){

		findElement(By.linkText("添加成员")).click();
		return new AddressListPage();

	}

//	public AddressListPage gotoContactPage(){
//		return new AddressListPage();
//	}
//
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
