package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class HomePage extends PageObject {

    public static final Target ADD_TO_CART_BUTTON = Target
            .the("botón de agregar al carrito")
                .locatedBy("//button[contains(@onclick,\"cart.add('{0}')\")]");

}