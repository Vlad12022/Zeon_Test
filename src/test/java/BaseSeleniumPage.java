import org.openqa.selenium.WebDriver;

abstract public class BaseSeleniumPage {

    static protected WebDriver driver;

    protected static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }
}
