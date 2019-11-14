package selenium.page.addressList;

import org.openqa.selenium.By;
import selenium.page.BasePage;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class DepartmentPage extends BasePage {

	//搜索部门是否存在
	public Boolean searchDepartment(String name){

		try{
			if(findElement(By.xpath("//a[contains(text(),'"+name+"')]"),2).isDisplayed()){
				findElement(By.xpath("//a[contains(text(),'"+name+"')]"),2).click();
				return true;
			}

		}catch (Exception e){
			log.printLog("this is method: searchDepartment。搜索的部门不存在");
		}
		return false;
	}

	//添加部门
	public DepartmentPage addDepartment(String parentName, String DName) throws InterruptedException {

		findElement(By.xpath("//a[contains(text(),'"+parentName+"')]"),2).isDisplayed();
		findElement(By.xpath("//a[contains(text(),'"+parentName+"')]"),2).click();

		//选择菜单中的"添加子部门":
		//findElement(By.xpath("//a[contains(text(),'"+parentName+"')]"),2).findElement(By.tagName("span")).click();

		//findElement(By.linkText("添加子部门"),2).click();
		findElement(By.cssSelector(".js_add_sub_party"),2).click();
		findElement(By.name("name"),2).sendKeys(DName);
		findElement(By.linkText("确定"),2).click();

		return this;
	}

	// 删除部门
	public DepartmentPage delDepartment(String DName) throws InterruptedException {

//		findElement(By.xpath("//li[@aria-level='"+level+"']/child::a[contains(text(),'"+DName+"')]"),2)

		findElement(By.xpath("//a[contains(text(),'"+DName+"')]"),2).click();
		findElement(By.xpath("//a[contains(text(),'"+DName+"')]"),2)
		.findElement(By.tagName("span")).click();

		findElement(By.linkText("删除"), 2).click();
		findElement(By.linkText("确定"),2).click();

		return this;
	}

	//获取部门名称List
	public List<String> getDepartmentName() throws InterruptedException {

		List<String> names = new ArrayList<>();
		sleep(500);
		driver.findElements(By.cssSelector(".jstree-anchor")).forEach(element ->{
			names.add(element.getText());
		});
		return names;
	}

	//修改部门名称

	public DepartmentPage updateDeptName(String DName, String NewName){

		findElement(By.xpath("//a[contains(text(),'"+DName+"')]"),2).click();
		findElement(By.xpath("//a[contains(text(),'"+DName+"')]"),2)
				.findElement(By.tagName("span")).click();

		findElement(By.linkText("修改名称"),2).click();
		findElement(By.name("name"),2).clear();
		findElement(By.name("name"),2).sendKeys(NewName);
		findElement(By.linkText("保存"),2).click();
		return this;
	}

	//展开部门层级tree
	public DepartmentPage expandDeptTree(){

		findElement(By.xpath(".//li[@aria-expanded=\"false\"]/i"),2);

		return this;
	}

}
