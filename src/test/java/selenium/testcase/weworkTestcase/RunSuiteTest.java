package selenium.testcase.weworkTestcase;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
//@Categories.IncludeCategory({
//		Add.class,
//		Del.class
//})
@Suite.SuiteClasses({
//		TestAddDelMembers.class,
//		TestSendMessages.class,
//		TestUploadPictures.class,
		TestDepartmentFunc.class

})


public class RunSuiteTest {
}
