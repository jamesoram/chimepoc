package io.tromba.chimepoc.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jao on 01/06/15.
 */
public class WallPage extends AbstractPage {

    @FindBy(id = "main-search-box")
    private WebElement searchBox;

    public WallPage(WebDriver driver) {
        super(driver);
    }

    public SearchResultsPage search(String query) {
        searchBox.sendKeys(query + Keys.ENTER);
        return new SearchResultsPage(driver);
    }
}
