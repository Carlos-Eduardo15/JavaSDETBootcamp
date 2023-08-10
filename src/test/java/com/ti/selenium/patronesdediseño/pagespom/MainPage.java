package com.ti.selenium.patronesdediseño.pagespom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MainPage {
    protected WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By spnSchoolTitle = By.className("wpsp-schoolname");

    public String getSchoolName() {
        return driver.findElement(spnSchoolTitle).getText();
    }

    public void verifySchoolName() {
        Assert.assertEquals(getSchoolName(), "Titanium School");
    }
}
