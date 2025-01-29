import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CatalogPage extends BaseSeleniumPage {

   @FindBy(xpath = "(//button[@type='button'])[11]")
    private WebElement homeCategory;

     @FindBy(xpath = "(//div[@class='subcategory-details'])[3]")
    private List<WebElement> subcategoryHome;

    public CatalogPage() {
        PageFactory.initElements(driver, this);
    }

//    //public Set<String> collectSubcategoryTexts() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Set<String> texts = new HashSet<>();
//        // Ожидание видимости подкатегорий
//        wait.until(ExpectedConditions.visibilityOfAllElements(subcategoryHome));
//        for (WebElement subcategory : subcategoryHome) {
//            String subcategoryText = subcategory.getText();
//            texts.add(subcategoryText);
//        }
//        return texts;
//    }

    public void openCategory(CatalogNames catalogNames) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='catalog']")));

        // Получаем XPath для нужной категории
        String categoryXpath = getXpath(catalogNames);
        WebElement categoryElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(categoryXpath)));

        // Кликаем по категории
        categoryElement.click();
    }
    public Set<String> collectSubcategoryTexts() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Set<String> texts = new HashSet<>();
        // Ожидание видимости подкатегорий
        wait.until(ExpectedConditions.visibilityOfAllElements(subcategoryHome));
        for (WebElement subcategory : subcategoryHome) {
            String subcategoryText = subcategory.getText();
            texts.add(subcategoryText);
        }
        return texts;
    }


    public String getXpath(CatalogNames catalogNames){
        return String.format(Constants.CATALOG_ALL_CATEGORIES_XPATH,catalogNames.getIndex());
  }

}















