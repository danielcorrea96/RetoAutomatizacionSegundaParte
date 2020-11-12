package com.accenture.certificacion.tasks;

import com.accenture.certificacion.models.InformacionBasicaDeUnVuelo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.accenture.certificacion.userinterface.PaginaPrincipalLatam.*;

public class ReservarUnVuelo implements Task {
    private InformacionBasicaDeUnVuelo informacionBasicaDeUnVuelo;

    public ReservarUnVuelo(InformacionBasicaDeUnVuelo informacionBasicaDeUnVuelo) {
        this.informacionBasicaDeUnVuelo = informacionBasicaDeUnVuelo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(informacionBasicaDeUnVuelo.getOrigen()).into(ORIGEN).thenHit(Keys.DOWN).thenHit(Keys.DOWN).thenHit(Keys.ENTER),
                WaitUntil.the(DESTINO, WebElementStateMatchers.isEnabled()),
                Enter.theValue(informacionBasicaDeUnVuelo.getDestino()).into(DESTINO).thenHit(Keys.DOWN).thenHit(Keys.DOWN).thenHit(Keys.ENTER),
                JavaScriptClick.on(SOLO_IDA),
                JavaScriptClick.on(BUSCA_TU_VUELO)
        );


    }
    public static ReservarUnVuelo enLaPaginaDeLatam(InformacionBasicaDeUnVuelo informacion){
        return Tasks.instrumented(ReservarUnVuelo.class, informacion);
    }
}
