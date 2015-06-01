package io.tromba.chimepoc.pages;

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

    @FindBy(id = "signin")
    private WebElement signInButton;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public LandingPage goToUrl() {
        driver.get(URL);
        return this;
    }

    public LandingPage enterEmail(String email) {
        emailTextbox.sendKeys(email);
        return this;
    }

    public LandingPage enterPassword(String password) {
        passwordTextbox.sendKeys(password);
        return this;
    }

    public WallPage clickSignIn() {
        signInButton.click();
        return new WallPage(driver);
    }
}
