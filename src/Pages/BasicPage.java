package Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasicPage {

	protected WebDriver driver;
	protected JavascriptExecutor js;
	protected WebDriverWait wait;

	public BasicPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
		this.driver = driver;
		this.wait = wait;
		this.js = (JavascriptExecutor) driver;
	}

	public WebElement getLocation() {
		return null;
	}

	public List<WebElement> getMenuBar() {
		return null;
	}


}
