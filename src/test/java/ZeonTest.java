import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ZeonTest extends BaseSeleniumTest {


    @Test(dataProvider = "categoryProvider",dataProviderClass = CatalogDataProvider.class)
    public void zeonTest(CatalogNames catalogNames) {
        MainPage mainPage = new MainPage();
        mainPage.openCatalog();

        CatalogPage catalogPage = new CatalogPage();

        String categoryXPath = catalogPage.getXpath(CatalogNames.BEAUTY_AND_SPORTS);
        Map<String, List<String>> texts = catalogPage.collectSubcategoryTexts(categoryXPath);

        texts.forEach((category, subCategories) -> {
            System.out.println("Category: " + category);
            subCategories.forEach(subCategory -> System.out.println(" - " + subCategory));
        });
    }
}