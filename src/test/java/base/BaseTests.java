package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class BaseTests {
    public WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\keler\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

    }

    public static void main(String[] args) {
        BaseTests tests = new BaseTests();
        tests.setUp();

    }
}
