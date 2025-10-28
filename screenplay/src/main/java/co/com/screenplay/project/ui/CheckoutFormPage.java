package co.com.screenplay.project.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutFormPage extends PageObject {


    public static final Target GUEST_CHECKOUT_RADIO = Target.the("guest checkout radio option")
            .locatedBy(("//label[contains(., 'Guest Checkout')]/input"));

    public static final Target CONTINUE_BUTTON = Target.the("continue button")
            .located(By.id("button-account"));


    public static final Target FIRSTNAME_INPUT = Target.the("first name input")
            .located(By.id("input-payment-firstname"));
    public static final Target LASTNAME_INPUT = Target.the("last name input")
            .located(By.id("input-payment-lastname"));
    public static final Target EMAIL_INPUT = Target.the("email input")
            .located(By.id("input-payment-email"));
    public static final Target PHONE_INPUT = Target.the("phone input")
            .located(By.id("input-payment-telephone"));
    public static final Target ADDRESS_INPUT = Target.the("address input")
            .located(By.id("input-payment-address-1"));
    public static final Target CITY_INPUT = Target.the("city input")
            .located(By.id("input-payment-city"));
    public static final Target POSTCODE_INPUT = Target.the("post code input")
            .located(By.id("input-payment-postcode"));

    public static final Target PAYMENT_COUNTRY_DROPBOX = Target.the("payment country dropbox")
            .located(By.id("input-payment-country"));

    public static final Target PAYMENT_ZONE_DROPBOX = Target.the("payment zone dropbox")
            .located(By.id("input-payment-zone"));

    public static final Target BILLING_CONTINUE_BUTTON = Target.the("billing continue button")
            .located(By.id("button-guest"));

    public static final Target COMMENT_TEXTAREA = Target.the("comment textarea")
            .located(By.cssSelector("textarea[name='comment'].form-control"));

    public static final Target DELIVERY_CONTINUE_BUTTON = Target.the("billing continue button")
            .located(By.id("button-shipping-method"));

    public static final Target AGREE_CHECKBOX = Target.the("agree terms and conditions checkbox")
            .located(By.cssSelector("input[name='agree'][type='checkbox']"));

    public static final Target PAYMENT_CONTINUE_BUTTON = Target.the("payment continue button")
            .located(By.id("button-payment-method"));

    public static final Target CONFIRM_ORDER_BUTTON = Target.the("Confirm order button")
            .located(By.id("button-confirm"));

}
