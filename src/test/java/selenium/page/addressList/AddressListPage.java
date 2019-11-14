package selenium.page.addressList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.page.BasePage;

import java.util.List;

import static java.lang.Thread.sleep;

public class AddressListPage extends BasePage {  //通讯录page

	public void getMemberList(){   //获取当前联系人列表

	}

	public AddressListPage addMember(String username, String id, String phone){  //添加联系人

		findElement(By.name("username"),2).sendKeys(username);
		findElement(By.name("acctid"),2).sendKeys(id);
		findElement(By.name("mobile"),2).sendKeys(phone);
		findElement(By.linkText("保存"),2).click();

		try {
			findElement(By.linkText("离开此页"),2).click();
		}catch (Exception e){
			return this;
		}

		return this;
	}

	public AddressListPage deleteMember(String phone) throws InterruptedException {  //删除指定联系人

		findElement(By.id("memberSearchInput"),2).clear();
		findElement(By.id("memberSearchInput"),2).sendKeys(phone);
		try {
			waitToBeClickable(By.linkText("禁用"),5);
		}catch (Exception e){
			System.out.println("not found...");
			return this;
		}

		findElement(By.linkText("删除"),2).click();
		findElement(By.linkText("确认"),2).click();


		return this;
	}

	public AddressListPage deleteOnebyOne() throws InterruptedException {  //删除列表中前5个联系人


		//findElement(By.cssSelector(".ww_checkbox")).click();  //选中第一个
		sleep(2000);

		waitToBeClickable(By.cssSelector(".ww_checkbox"),5);
		List<WebElement> elements = driver.findElements(By.cssSelector(".ww_checkbox"));

		for (int i=1; i<6; i++){

			elements.get(i).click();
			sleep(500);
		}

		findElement(By.linkText("删除"),2).click();
		findElement(By.linkText("确认"),2).click();

		return new AddressListPage();
	}

	public AddressListPage deleteCurrentPage() throws InterruptedException {  //删除当前页面所有联系人

		findElement(By.cssSelector(".ww_checkbox"),2).click();

		findElement(By.linkText("删除"),2).click();

		findElement(By.linkText("确认"),2).click();

		return new AddressListPage();
	}

}
