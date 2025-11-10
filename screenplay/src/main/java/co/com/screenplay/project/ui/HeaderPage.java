package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HeaderPage extends PageObject {

    public static final Target SHOPPING_CART = Target.the("shopping cart link")
            .locatedBy("//*[@id='top-links']/ul/li[4]/a");
}