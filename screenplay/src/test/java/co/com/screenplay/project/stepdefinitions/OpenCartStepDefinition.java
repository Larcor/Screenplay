package co.com.screenplay.project.stepdefinitions;

import co.com.screenplay.project.questions.TextValidationQuestions;
import co.com.screenplay.project.tasks.AddProductToCart;
import co.com.screenplay.project.tasks.NavigateTo;
import co.com.screenplay.project.tasks.ProceedToCheckout;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static co.com.screenplay.project.utils.Constants.IPHONE;
import static co.com.screenplay.project.utils.Constants.MAC_BOOK;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
public class OpenCartStepDefinition {


    @When("el actor agrega los productos al carrito")
    public void elActorAgregaLosProductosAlCarrito() {
        theActorInTheSpotlight().attemptsTo(
                AddProductToCart.withId(MAC_BOOK),
                AddProductToCart.withId(IPHONE)
        );
    }
    @When("el actor visualiza el carrito")
    public void elActorVisualizaElCarrito(){
        NavigateTo.open();
    }

    @When("el actor completa la información de la compra")
    public void elActorCompletaLaInformacionDeLaCompra(){
        theActorInTheSpotlight().attemptsTo(
                ProceedToCheckout.complete());
    }

    @Then("debería ver el mensaje de confirmación del pedido")
    public void deberiaVerElMensajeDeConfirmacionDelPedido() {
        theActorInTheSpotlight().should(
                seeThat(TextValidationQuestions.text(), containsString("Your order has been placed!"))
        );
    }
}