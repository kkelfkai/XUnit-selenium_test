package Groups;


import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.ExcludeCategory(SlowGroup.class)
@Categories.IncludeCategory(FastGroup.class)   //代码优先执行InclueCategory, 然后再执行ExcludeCategory
@Suite.SuiteClasses({
		TestGroups.class
})

public class TestGroupsSuite {
}
