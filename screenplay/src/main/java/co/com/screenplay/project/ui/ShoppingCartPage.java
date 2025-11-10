package co.com.screenplay.project.ui;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage extends PageObject {

    public static final Target CHECKOUT_BUTTON = Target.the("checkout button")
            .locatedBy("a[href*='checkout/checkout']");
}