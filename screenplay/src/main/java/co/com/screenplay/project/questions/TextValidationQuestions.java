package co.com.screenplay.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.screenplay.project.ui.OrderSuccessfullyPage.ORDER_SUCCESS_MESSAGE;


public class TextValidationQuestions implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return ORDER_SUCCESS_MESSAGE.resolveFor(actor).getText().trim();
    }

    public static TextValidationQuestions text() {
        return new TextValidationQuestions();
    }
}