package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {

    @AndroidFindBy(accessibility = "Close")
    private List<WebElement> btnClose;
    public void clickClose() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfAllElements(btnClose));
        btnClose.get(0).click();
        //hacer esperar un poco hasta que aparezca el proximo close
        //en algunas pruebas si funcionaba cerrando los 2 de manera consecutiva
        if (!btnClose.isEmpty()) {
            btnClose.get(0).click();
        } else {
            System.out.println("Ningún botón de cierre presente.");
        }
    }

    }

