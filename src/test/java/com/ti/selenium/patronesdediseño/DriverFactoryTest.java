package com.ti.selenium.patronesdediseño;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.ti.base.BrowserType;
import com.ti.base.DriverFactory;
import com.ti.selenium.patronesdediseño.pagespom.LoginPage;

public class DriverFactoryTest {
    String demoSiteUrl = "https://demosite.titaniuminstitute.com.mx/wp-admin/admin.php?page=sch-dashboard";
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeTest
    @Parameters("browser")
    void setUp(String browser) {
        DriverFactory.getInstance().setDriver(BrowserType.valueOf(browser));
        driver = DriverFactory.getInstance().getDriver();
        loginPage = new LoginPage(driver);
    }


    @AfterTest
    void tearDown() {
        DriverFactory.getInstance().removeDriver();
    }

    @Test
    void testLogin() {
        driver.get(demoSiteUrl);
        loginPage.login("admin", "G3-ySzY%");
    }
}
