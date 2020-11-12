package com.accenture.certificacion.tasks;

import com.accenture.certificacion.interactions.CambiarVentana;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.accenture.certificacion.userinterface.ContratoDeTransporte.ANEXO_DE_TRANSPORTE;
import static com.accenture.certificacion.userinterface.ContratoDeTransporte.REVISAR_POLITICA;
import static com.accenture.certificacion.userinterface.PaginaPrincipalLatam.CONTRATO_DE_TRANSAPORTE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class RevisarLaPolitica implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CONTRATO_DE_TRANSAPORTE),
                Click.on(CONTRATO_DE_TRANSAPORTE),
                WaitUntil.the(ANEXO_DE_TRANSPORTE, isEnabled()),
                JavaScriptClick.on(ANEXO_DE_TRANSPORTE),
                WaitUntil.the(REVISAR_POLITICA, isEnabled()),
                JavaScriptClick.on(REVISAR_POLITICA),
                CambiarVentana.delNavegador()
        );
    }

    public static RevisarLaPolitica deTratamientoDeDatosPersonales(){
        return Tasks.instrumented(RevisarLaPolitica.class);
    }
}
