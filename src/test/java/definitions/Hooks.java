package definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    static WebDriver driver;
    @Before
    public void config(){
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }
    /*@After
    public void terminar(){

        driver.quit();
    }*/

    public static WebDriver getDriver(){

        return driver;
    }
}
