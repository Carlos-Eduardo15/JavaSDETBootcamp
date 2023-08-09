package com.ti.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebElementExample {
    WebDriver driver;
    String demoSiteUrl = "https://demosite.titaniuminstitute.com.mx/wp-admin/admin.php?page=sch-dashboard";
    String actResult = "";
    String expResult = "Titanium School";
    String username = "admin";
    String password = "G3-ySzY%";

    @BeforeTest
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    void firstTest() {
        driver.navigate().to(demoSiteUrl);
        //primero marcamos que tipo de anotacion manipularemos, en este caso el txt, se deben eliminar vocales
        WebElement txtUsername = driver.findElement(By.id("user_login"));
        txtUsername.clear();
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.name("pwd"));
        txtPassword.clear();
        txtPassword.sendKeys(password);

        WebElement chkRememberme = driver.findElement(By.cssSelector("#rememberme"));
        chkRememberme.click();

        WebElement btnLogin = driver.findElement(By.xpath("//input[contains(@value,'Log')]"));
        btnLogin.click();

        WebElement lblTitaniumTitle = driver.findElement(By.className("wpsp-schoolname"));
        actResult = lblTitaniumTitle.getText();

        Assert.assertEquals(actResult, expResult, "El texto no es igual");


    }

    @AfterTest
    void turnDown() {
        driver.quit();
    }
}
