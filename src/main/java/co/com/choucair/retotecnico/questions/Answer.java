package co.com.choucair.retotecnico.questions;

import co.com.choucair.retotecnico.userinterface.RegisteredUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;
    
    private Answer(String question) { this.question = question; }
    
    public static Answer toThe(String question) { return new Answer(question); }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String msg = Text.of(RegisteredUserPage.MSG_REGISTERED).viewedBy(actor).asString();

        result = question.equals(msg);
        return result;
    }
}
