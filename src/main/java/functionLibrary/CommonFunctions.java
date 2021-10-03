package functionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {
    public static WebDriver driver;
    private static String pathname;
    public static File propertyFilePath = new File("src/main/resources/testData/config.properties");

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void closeBrowser() {
        driver.quit();
    }

    public void waitForTime(int time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public void hoverOver(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }


    public String readPropertyFile(String key) throws Exception {
        FileInputStream inputStream = new FileInputStream("");
        Properties properties = new Properties();
        properties.load(inputStream);
        String val = properties.getProperty(key);
        return val;
    }


}
