package PackageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class classOne {

@Test
public void functionOne() {

System.setProperty("webdriver.gecko.driver","E:\\Automation\\Selenium\\Drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
//WebDriver driver = new InternetExplorerDriver();
System.out.print("Inside marionette driver");
String baseUrl = "www.google.com";
driver.navigate().to(baseUrl);
driver.quit();

//.navigate("www.google.com");
}
}