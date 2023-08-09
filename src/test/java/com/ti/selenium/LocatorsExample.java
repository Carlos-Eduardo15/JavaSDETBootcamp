package com.ti.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocatorsExample {
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
        //limpiamos con el clear en caso de haber cache o asi
        driver.findElement(By.id("user_login")).clear();
        //find element buscara el elemento en cuestion
        //sendkeys remplazara o llenara lo que hay
        driver.findElement(By.id("user_login")).sendKeys(username);
        driver.findElement(By.name("pwd")).clear();
        driver.findElement(By.name("pwd")).sendKeys(password);
        //como nos topamos un checkbox, usamos el click
        driver.findElement(By.cssSelector("#rememberme")).click();
        driver.findElement(By.xpath("//input[contains(@value,'Log')]")).click();

        actResult = driver.findElement(By.className("wpsp-schoolname")).getText();
        Assert.assertEquals(actResult, expResult, "El texto no es igual");

    }

    @AfterTest
    void turnDown() {
        driver.quit();
    }
}
