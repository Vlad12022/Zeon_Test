import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage {

    @FindBy(xpath = "(//button[@class='catalog-btn'])[1]")
    private WebElement catalog;

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public CatalogPage openCatalog() {
        catalog.click();
        return new CatalogPage();
    }
}
