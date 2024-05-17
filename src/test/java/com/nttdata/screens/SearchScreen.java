package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SearchScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id=\"com.airbnb.android:id/search_bar\"]")
    private WebElement searchInput;

    @AndroidFindBy(id = "com.airbnb.android:id/n2_bottom_sheet_title_title")
    private WebElement resultText;

    public void clickSearchInput(){
       // waitForElemenent(searchInput);
        searchInput.click();
    }

    public String getResultText(){
        return resultText.getText();
    }
}
