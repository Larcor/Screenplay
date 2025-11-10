package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.screenplay.project.ui.HomePage.ADD_TO_CART_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductToCart implements Task {

    private final String productId;

    public AddProductToCart(String productId) {
        this.productId = productId;
    }

    public static AddProductToCart withId(String productId) {
        return instrumented(AddProductToCart.class, productId);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target button = ADD_TO_CART_BUTTON.of(productId);
        actor.attemptsTo(
                Click.on(button)
        );
    }
}