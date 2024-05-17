package com.nttdata.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SearchDetailsScreen extends PageObject {

    @AndroidFindBy(xpath="//android.view.ViewGroup[@resource-id=\"com.airbnb.android:id/stays_where_panel_compose\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]")
    private WebElement searchDetailInput;

    @AndroidFindBy(id="com.airbnb.android:id/input_bar_input")
    private WebElement searchDetailInputText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView")
    private WebElement firstOption;

    @AndroidFindBy(id = "//android.widget.Button[@resource-id=\"com.airbnb.android:id/n2_simple_search_footer_link\"]")
    private WebElement nextButton;

    @AndroidFindBy(id = "//android.widget.Button[@resource-id=\"com.airbnb.android:id/n2_dls_action_footer_gradient_button\"]")
    private WebElement searchButton;
    private AndroidDriver<MobileElement> driver;

    public void waitForElemenent(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    public void enterSearchInput(String place){
        waitForElemenent(searchDetailInput);
        searchDetailInput.click();
       searchDetailInputText.sendKeys(place);
        // driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void clickNext(){
        nextButton.click();
    }

    public void clickSearch(){
        searchButton.click();
    }

    public void clickFirstOption() {
        firstOption.click();
    }
}
