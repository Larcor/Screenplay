package co.com.screenplay.project.tasks;

import co.com.screenplay.project.ui.HeaderPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class NavigateTo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HeaderPage.SHOPPING_CART, isClickable()),
                Click.on(HeaderPage.SHOPPING_CART)
        );
    }

    public static NavigateTo open() {
        return instrumented(NavigateTo.class);
    }
}