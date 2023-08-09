package com.ti.selenium;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class WindowAndTabExample extends BaseTestClass{
    String googleSiteUrl = "https://www.google.com";
    String WpSchoolUrl = "https://wpschoolpress.com/";
    
    @Test
    void manageWindowsAndTabs(){
        driver.navigate().to(demoSiteUrl);
        String originalTab = driver.getWindowHandle();
        wait(2);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(WpSchoolUrl);
        wait(2);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to(googleSiteUrl);
        wait(2);

        driver.switchTo().window(originalTab);
        driver.close();
        wait(2);
    }

}
