package com.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;
	public static String value;

	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Driver//geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (type.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//Driver//iedriver.exe");
			driver = new InternetExplorerDriver();
		}
		return driver;
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void close() {
		driver.close();
	}
				

	public static void quit() {
		driver.quit();
	}

	public static void navigateTo(String value) {
		driver.navigate().to(value);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navagateForward() {
		driver.navigate().forward();
	}

	public static void naviagateRefresh() {
		driver.navigate().refresh();
	}

	public static void actionClass(String actionName, WebElement element) {
		Actions a = new Actions(driver);
		if (actionName.equalsIgnoreCase("moveto")) {
			a.moveToElement(element).build().perform();
		} else if (actionName.equalsIgnoreCase("click")) {
			a.click(element).build().perform();
		} else if (actionName.equalsIgnoreCase("Right Click")) {
			a.contextClick(element).build().perform();
		} else if (actionName.equalsIgnoreCase("Double click")) {
			a.doubleClick(element).build().perform();
		} else if (actionName.equalsIgnoreCase("clickandhold")) {
			a.clickAndHold(element).build().perform();
		} else if (actionName.equalsIgnoreCase("release")) {
			a.release(element).build().perform();
		} else if (actionName.equalsIgnoreCase("movetoelement")) {
			a.moveToElement(element).build().perform();
		} else if (actionName.equalsIgnoreCase("draganddrop")) {
			a.dragAndDrop(element, element);
		}

	}

	public static void alert(String type) {
		if (type.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (type.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		} else if (type.equalsIgnoreCase("text")) {
			String text = driver.switchTo().alert().getText();
			System.out.println(text);
		}
	}

	public static void robotClass(String robotName) throws AWTException {
		Robot r = new Robot();
		if (robotName.equalsIgnoreCase("Down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (robotName.equalsIgnoreCase("Enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
	}

	public static void dropDown(String type, WebElement element, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int index1 = Integer.parseInt(value);
			s.selectByIndex(index1);
		} else if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("visible")) {
			s.selectByVisibleText(value);
		}
	}

	public static void multiDropDown(String type, WebElement element, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int index1 = Integer.parseInt(value);
			s.deselectByIndex(index1);
		} else if (type.equalsIgnoreCase("value")) {
			s.deselectByValue(value);
		} else if (type.equalsIgnoreCase("visible")) {
			s.deselectByVisibleText(value);
		} else if (type.equalsIgnoreCase("all")) {
			s.deselectAll();
		}
	}

	public static void checkBox(WebElement element) {
		element.click();
	}

	public static void wait1(int seconds, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(seconds, format);
	}

	public static void expilicitWait(int seconds, WebElement element, String type) {
		if (type.equalsIgnoreCase("visibility")) {
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.visibilityOf(element));
		} else if (type.equalsIgnoreCase("clickable")) {
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}

	}

	public static void screenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Screen Shots\\sec1.png");
		FileUtils.copyFile(screenshotAs, des);

	}

	public static void thread(long seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}

	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	public static void javaScriptClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void inputValue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
	}

	public static void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,0)");
	}

//	public static void fluentWait() {
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(30,TimeUnit.SECONDS)
//				.pollingEvery(6,TimeUnit.SECONDS)
//				.ignoring(NoSuchElementException.class);
//
//	}
	public static void javaNavigateTo(String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window:location=value");
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void frames(String type, WebElement element, String value) {
		if (type.equalsIgnoreCase("index")) {
			int index1 = Integer.parseInt(value);
			driver.switchTo().frame(index1);
		} else if (type.equalsIgnoreCase("element")) {
			driver.switchTo().frame(element);
		} else if (type.equalsIgnoreCase("name")) {
			driver.switchTo().frame(value);
		} else if (type.equalsIgnoreCase("def")) {
			driver.switchTo().defaultContent();
		}
	}

	public static void multipleOptions(WebElement element, String type) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("ismultiple")) {
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
		} else if (type.equalsIgnoreCase("getOptions")) {
			List<WebElement> options = s.getOptions();
			for (WebElement webElement : options) {
				String text = webElement.getText();
				System.out.println(text);
			}
		} else if (type.equalsIgnoreCase("allSelected")) {
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement webElement : allSelectedOptions) {
				String text1 = webElement.getText();
				System.out.println(text1);
			}
		} else if (type.equalsIgnoreCase("FirstSelected")) {
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			String text3 = firstSelectedOption.getText();
			System.out.println(text3);
		}

	}

	public static String particularData(String path, int Row_Index, int Col_Index) throws Throwable {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(Row_Index);
		Cell cell = row.getCell(Col_Index);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			value = cell.getStringCellValue();
		} else if (cellType.equals(CellType.NUMERIC)) {
			double cellValue = cell.getNumericCellValue();
			int number = (int) cellValue;
			value = String.valueOf(number);
		}
		wb.close();
		return value;
	}

}
