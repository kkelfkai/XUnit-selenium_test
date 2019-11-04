package selenium.page;

import org.openqa.selenium.By;

public class AddressListPage extends BasePage{  //通讯录page

	public void getMemberList(){   //获取当前联系人列表

	}

	public AddressListPage addMember(String username, String id, String phone){  //添加联系人

		findElement(By.name("username")).sendKeys(username);
		findElement(By.name("acctid")).sendKeys(id);
		findElement(By.name("mobile")).sendKeys(phone);

		return this;
	}
}
