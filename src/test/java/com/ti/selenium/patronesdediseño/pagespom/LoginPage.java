package com.ti.selenium.patronesdediseño.pagespom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends MainPage {

    private By txtUsername = By.id("user_login");
    private By txtPassword = By.name("pwd");
    private By chkRememberMe = By.cssSelector("#rememberme");
    private By btnLogin = By.xpath("//input[contains(@value,'Log')]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void typeUsername(String username) {
        driver.findElement(txtUsername).clear();
        driver.findElement(txtUsername).sendKeys(username);
    }

    public void typePassword(String password) {
        driver.findElement(txtPassword).clear();
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void checkRememberMe() {
        driver.findElement(chkRememberMe).click();
    }

    public void clickLogin() {
        driver.findElement(btnLogin).click();
    }

    public void login(String username, String password) {
        typeUsername(username);
        typePassword(password);
        checkRememberMe();
        clickLogin();
    }
}
