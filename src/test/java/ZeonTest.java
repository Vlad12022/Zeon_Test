import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class ZeonTest extends BaseSeleniumTest {


    @Test(dataProvider = "categoryProvider",dataProviderClass = CatalogDataProvider.class)
    public void zeonTest(CatalogNames category) {
        MainPage mainPage = new MainPage();
        mainPage.openCatalog();

        CatalogPage catalogPage = new CatalogPage();
        catalogPage.openCategory(category); // Передаем категорию в метод

        Set<String> texts = catalogPage.collectSubcategoryTexts();
        Assert.assertFalse(texts.isEmpty(), "No texts found in subcategories");

        // Выводим категорию и ее содержимое
        System.out.println("Category: " + category);
        System.out.println("Subcategories:");
        texts.forEach(subcategory -> System.out.println(" - " + subcategory));
    }
}

