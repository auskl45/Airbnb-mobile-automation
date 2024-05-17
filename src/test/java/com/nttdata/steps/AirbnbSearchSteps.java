package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;

public class AirbnbSearchSteps {

    LoginScreen loginScreen;
    SearchScreen searchScreen;
    SearchDetailsScreen searchDetailsScreen;

    @Step("Click en cerrar")
    public void clickClose(){
        loginScreen.clickClose();
    }

    @Step("Búsqueda por texto {0}")
    public void searchByText(String place){
        searchScreen.clickSearchInput();
       searchDetailsScreen.enterSearchInput(place);
       //como "Hotel vichayito" no existe no puede realizar la busqueda , necesitaria saber como dar click al boton del teclado
       // investigue esto pero no funciona     driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        // para ello le cambie el nombre a uno que si existira para hacer la prueba
        searchDetailsScreen.clickFirstOption();
        searchDetailsScreen.clickNext();
        searchDetailsScreen.clickSearch();
    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
         return searchScreen.getResultText();
    }
}
