import org.testng.annotations.DataProvider;

public class CatalogDataProvider {
 @DataProvider(name = "categoryProvider")
    public static Object[][] categoryProvider(){
     return new Object[][]{
             {CatalogNames.BEAUTY_AND_SPORTS}

     };
 }








}
