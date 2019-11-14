package selenium.page.manageTools;

import org.openqa.selenium.By;
import selenium.page.BasePage;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class MaterialPage extends BasePage {


	public MaterialPage addPicture(String path) throws InterruptedException {

		findElement(By.linkText("图片"),2).click();

		driver.navigate().refresh();

		findElement(By.linkText("添加图片"),2).click();

		findElement(By.name("uploadImageFile"),2).sendKeys(path);
		sleep(10000);
		findElement(By.linkText("完成"),2).click();

		return this;

	}

	public List<String> getPictureName(){

		List<String> name= new ArrayList<>();
		driver.findElements(By.cssSelector(".material_picCard_text")).forEach(element->
				name.add(element.getText()));

		return name;
	}
}
