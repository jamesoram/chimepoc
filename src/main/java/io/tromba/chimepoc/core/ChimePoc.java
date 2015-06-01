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
        String username = args[1];
        String password = args[2];
        String buzzword = args[3];

        new ChimePoc().chime(username, password, buzzword);
    }
    
    private void chime(String user, String password, String buzzword) {
        SearchResultsPage page = new LandingPage(getDriver()).enterEmail(user).enterPassword(password).search(buzzword);
        System.out.println("found " + page.getCandidateCount() + " leads");
    }

    private WebDriver getDriver() {
        return new ChromeDriver();
    }
}
