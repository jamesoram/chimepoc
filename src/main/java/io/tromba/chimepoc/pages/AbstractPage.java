package io.tromba.chimepoc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by jao on 01/06/15.
 */
public abstract class AbstractPage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        this.wait = new WebDriverWait(driver, 30);
    }
}
