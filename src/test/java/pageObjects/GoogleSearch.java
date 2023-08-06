package pageObjects;

//   driver.findElement(By.name("q")).clear();
//           driver.findElement(By.name("q")).sendKeys(string);
//           driver.findElement(By.name("btnK")).submit();

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearch {
    @FindBy(name = "q")
    public static WebElement searchBar;

    @FindBy(name = "btnK")
    public static WebElement searchClick;

    public static void searchFor(String keyword){
        searchBar.clear();
        searchBar.sendKeys(keyword);
        searchClick.submit();
    }

}

