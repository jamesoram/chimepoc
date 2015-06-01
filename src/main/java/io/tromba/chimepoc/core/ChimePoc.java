package io.tromba.chimepoc.core;

import io.tromba.chimepoc.pages.LandingPage;
import io.tromba.chimepoc.pages.SearchResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by jao on 01/06/15.
 */
public class ChimePoc {

    public static void main(String[] args) {
        String username = args[0];
        String password = args[1];
        String buzzword = args[2];

        System.out.println("Chiming with " + username + " for " + buzzword);
        new ChimePoc().chime(username, password, buzzword);
    }

    private void chime(String user, String password, String buzzword) {
        SearchResultsPage page = new LandingPage(getDriver()).goToUrl()
                .enterEmail(user)
                .enterPassword(password)
                .search(buzzword);
        System.out.println("found " + page.getCandidateCount() + " leads");
    }

    private WebDriver getDriver() {
        return new ChromeDriver();
    }
}
