package io.tromba.chimepoc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by jao on 01/06/15.
 */
public class SearchResultsPage extends WallPage {

    private static final String CANDIDATE_BY_INDEX = "id('results')/li/div/div/a[contains(., 'Connect')][%i]";
    private static final String ALL_CANDIDATES = "id('results')/li/div/div/a[contains(., 'Connect')]";

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public int getCandidateCount() {
        return driver.findElements(By.xpath(ALL_CANDIDATES)).size();
    }

    public void findConnectByIndex(int i) {
        findByXpathAndIndex(CANDIDATE_BY_INDEX, i);
        // end of poc
    }
}
