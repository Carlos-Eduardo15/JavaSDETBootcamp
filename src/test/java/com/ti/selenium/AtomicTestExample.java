package com.ti.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class AtomicTestExample extends BaseTestClass {

    @BeforeClass
    void login() {
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().deleteAllCookies();
        ((JavascriptExecutor) driver).executeScript("localStorage.clear();");
        wait(4);
        Cookie loginCookie = new Cookie("session-username", "standard_user");
        wait(4);
        driver.manage().addCookie(loginCookie);
        wait(4);
        ((JavascriptExecutor) driver).executeScript("localStorage.setItem('cart-contents','[4,1,0]')");
        driver.navigate().refresh();
    }

    @Test(enabled = true)
    void validateShippingCartItems() {
        driver.navigate().to("https://www.saucedemo.com/cart.html");
        WebElement spnShoppingCart = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(driver -> driver.findElement(By.className("shopping_cart_badge")));
        Assert.assertEquals(Integer.valueOf(spnShoppingCart.getText()), 3);
        wait(4);
    }

    @Test(enabled = true)
    void validateUserCanCheckOut() {
        driver.navigate().to("https://www.saucedemo.com/checkout-step-one.html");
        new WebDriverWait(driver, Duration.ofSeconds(8))
                .until(driver -> driver.findElement(By.id("first-name"))).sendKeys("Gilbert");
        wait(4);
        driver.findElement(By.id("last-name")).sendKeys("Sanchez");
        wait(4);
        driver.findElement(By.id("postal-code")).sendKeys("2022");
        wait(4);
        driver.findElement(By.id("continue")).click();
        wait(4);

        WebElement dvTotal = driver.findElement(By.xpath("(//div[contains(text(),'Total')])[2]"));
        wait(4);
        Assert.assertTrue(dvTotal.getText().contains("60.45"));
        wait(2);
    }

    @Test(enabled = false)
    void AddCartsQuantityFromSameItem() {
        driver.manage().deleteAllCookies();
        ((JavascriptExecutor) driver).executeScript("localStorage.clear();");
        driver.navigate().to("https://shop.demoqa.com/cart/");
        String hash = (String) ((JavascriptExecutor) driver).executeScript("localStorage.getItem(\"wc_cart_hash_2265a9f6fbc383987ee8d0afbe044d95\");");
        System.out.println(hash);
        Cookie itemCookie = new Cookie("woocommerce_items_in_cart", "3");
        Cookie hashCookie = new Cookie("woocommerce_cart_hash", hash);
        driver.manage().addCookie(itemCookie);
        driver.manage().addCookie(hashCookie);
        driver.navigate().refresh();
        wait(2);
    }
}
