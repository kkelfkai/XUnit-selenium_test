package selenium.testcase.weworkTestcase;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import selenium.page.HomePage;
import selenium.testcase.Add;
import selenium.testcase.Del;

import java.util.List;

import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertThat;

public class TestDepartmentFunc{

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

	//1---通讯录 >> 添加子部门
	@Test
	@Category(Add.class)
	public void addDepartment() throws InterruptedException {
		String rootName = "恒利文体批发";
		String parentName = "研发部";
		String DName = "部1";
		try {
			Boolean r = homePage.gotoDepartmentPage().searchDepartment(parentName);
			if(r == true){
				System.out.println("====if====");
				List<String> deptnames =
				homePage.gotoDepartmentPage().addDepartment(parentName, DName).getDepartmentName();  //有父节点，直接添加子部门。
				System.out.println(deptnames);
				assertThat(deptnames, hasItem(DName));
			}else {
				System.out.println("====else====");
				List<String> deptnames =
				homePage.gotoDepartmentPage().addDepartment(rootName, parentName).addDepartment(parentName,DName).getDepartmentName();  //没有父节点，先添加父节点再添加子部门。
				System.out.println(deptnames);
				assertThat(deptnames, hasItem(DName));
			}

		}catch (Exception e){
			System.out.println("添加子部门失败:" + e);
		}

	}


	//2---通讯录 >> 删除指定部门
	@Test
	@Category(Del.class)
	public void delDepartment() throws InterruptedException {
		String parentName = "恒利文体批发";
		String DName = "子部门1";

		try {
			Boolean r = homePage.gotoDepartmentPage().searchDepartment(DName);
			if ( r == false){
				homePage.gotoDepartmentPage().addDepartment(parentName, DName).delDepartment(DName);  //没有部门，先添加再删除
				//assertThat(actR1, equalTo(null));

			}else {
				homePage.gotoDepartmentPage().delDepartment(DName);  //有部门，直接删除
				//assertThat(actR2, equalTo(null));
			}
		}catch (Exception e){
			System.out.println("删除部门失败:" + e);
		}
	}

	//3---通讯录 >> 修改指定部门名称
	@Test
	@Category(Add.class)
	public void updateDeptName() throws InterruptedException {
		String newName="测试部";
		List<String> names=
		homePage.gotoDepartmentPage().updateDeptName("研发部",newName).getDepartmentName();
		System.out.println(names);
		assertThat(names, hasItem(newName));
	}

	@Test
	public void expandTree(){
		homePage.gotoDepartmentPage().expandDeptTree();
	}





}
