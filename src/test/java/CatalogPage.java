import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.*;

public class CatalogPage extends BaseSeleniumPage {

    @FindBy(xpath = "(//button[@type='button'])[11]")
    private WebElement homeCategory;

    @FindBy(xpath = "//div[@class='category-details']")
    private List<WebElement> subcategoryHome;

    public CatalogPage() {
        PageFactory.initElements(driver, this);
    }

    public Map<String, List<String>> collectSubcategoryTexts(String categoryXpath) {

        Map<String, List<String>> categoriesText = new HashMap<>();
        WebElement category = driver.findElement(By.xpath(categoryXpath));
        String categoryText = category.getText();
        category.click();

        List<WebElement> subCategories = category.findElements(By.xpath("//div[@class='category-details']"));
        List<String> subCategoriesTexts = new ArrayList<>();

        for (WebElement subCategory : subCategories) {
            String subCategoryText = subCategory.getText();
            subCategoriesTexts.add(subCategoryText);
        }
        categoriesText.put(categoryText, subCategoriesTexts);

        return categoriesText;
    }

    public String getXpath(CatalogNames catalogNames) {
        return String.format(Constants.CATALOG_ALL_CATEGORIES_XPATH, catalogNames.getIndex());
    }

}















