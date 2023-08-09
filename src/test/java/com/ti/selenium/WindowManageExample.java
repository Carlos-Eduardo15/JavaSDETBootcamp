package com.ti.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

public class WindowManageExample extends BaseTestClass{
    @Test
    void manage(){
        driver.navigate().to(demoSiteUrl);
        getSizeAndPosition();
        setSizeAndPosition();
        getSizeAndPosition();
        wait(2);
        driver.manage().window().maximize();
        wait(2);
        driver.manage().window().minimize();
        wait(2);
        driver.manage().window().fullscreen();
        wait(2);
    }

    private void getSizeAndPosition(){
        Dimension size = driver.manage().window().getSize();
        System.out.println(String.format("La altura de la ventana es de: %d pixeles",size.height));
        System.out.println(String.format("La ancho de la ventana es de: %d pixeles",size.width));

        Point position = driver.manage().window().getPosition();
        System.out.println(String.format("La posicion en x de la ventana es: %d pixeles",position.getX()));
        System.out.println(String.format("La posicion en y de la ventana es: %d pixeles",position.getY()));
    }

    private void setSizeAndPosition(){
        driver.manage().window().setSize(new Dimension(1024,768));
        driver.manage().window().setPosition(new Point(0, 0));
    }
}
