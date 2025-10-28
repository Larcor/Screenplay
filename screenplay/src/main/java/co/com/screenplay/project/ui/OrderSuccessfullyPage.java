package co.com.screenplay.project.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OrderSuccessfullyPage extends PageObject {

   public static Target ORDER_SUCCESS_MESSAGE = Target.the("order success confirmation message")
            .located(By.xpath("//div[@id='content']//h1[contains(., 'Your order has been placed!')]"));

}