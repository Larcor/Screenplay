package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.CheckoutFormPage;
import co.com.screenplay.project.ui.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProceedToCheckout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(ShoppingCartPage.CHECKOUT_BUTTON, isClickable()),
                Click.on(ShoppingCartPage.CHECKOUT_BUTTON),

                WaitUntil.the(CheckoutFormPage.GUEST_CHECKOUT_RADIO, isVisible()),
                Click.on(CheckoutFormPage.GUEST_CHECKOUT_RADIO),

                WaitUntil.the(CheckoutFormPage.CONTINUE_BUTTON, isVisible()),
                Click.on(CheckoutFormPage.CONTINUE_BUTTON),

                EnterValueIntoInput.with(CheckoutFormPage.FIRSTNAME_INPUT, "Vicente"),
                EnterValueIntoInput.with(CheckoutFormPage.LASTNAME_INPUT, "Fernandez"),
                EnterValueIntoInput.with(CheckoutFormPage.EMAIL_INPUT, "vicente@fernandez.com"),
                EnterValueIntoInput.with(CheckoutFormPage.PHONE_INPUT, "1234567890"),
                EnterValueIntoInput.with(CheckoutFormPage.ADDRESS_INPUT, "Calle falsa # 123"),
                EnterValueIntoInput.with(CheckoutFormPage.CITY_INPUT, "Bogota"),
                EnterValueIntoInput.with(CheckoutFormPage.POSTCODE_INPUT, "110110"),

                WaitUntil.the(CheckoutFormPage.PAYMENT_COUNTRY_DROPBOX, isClickable()),
                SelectFromOptions.byVisibleText("Colombia").from(CheckoutFormPage.PAYMENT_COUNTRY_DROPBOX),
                SelectFromOptions.byVisibleText("Bogota D.C.").from(CheckoutFormPage.PAYMENT_ZONE_DROPBOX),

                WaitUntil.the(CheckoutFormPage.BILLING_CONTINUE_BUTTON, isClickable()),
                Click.on(CheckoutFormPage.BILLING_CONTINUE_BUTTON),

                EnterValueIntoInput.with(CheckoutFormPage.COMMENT_TEXTAREA, "Test 123"),
                Click.on(CheckoutFormPage.DELIVERY_CONTINUE_BUTTON),

                Click.on(CheckoutFormPage.AGREE_CHECKBOX),
                Click.on(CheckoutFormPage.PAYMENT_CONTINUE_BUTTON),
                Click.on(CheckoutFormPage.CONFIRM_ORDER_BUTTON)
        );
    }

    public static ProceedToCheckout complete() {
        return instrumented(ProceedToCheckout.class);
    }
}