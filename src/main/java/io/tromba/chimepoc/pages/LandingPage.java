package io.tromba.chimepoc.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by jao on 01/06/15.
 */
public class LandingPage extends AbstractPage {

    private static final String URL = "https://www.linkedin.com/";

    @FindBy(id = "session_key-login")
    private WebElement emailTextbox;

    @FindBy(id = "session_password-login")
    private WebElement passwordTextbox;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public LandingPage enterEmail(String email) {
        emailTextbox.sendKeys(email);
        return this;
    }

    public WallPage enterPassword(String password) {
        passwordTextbox.sendKeys(password + Keys.ENTER);
        return new WallPage(driver);
    }
}
