package com.accenture.certificacion.stepdefinitions;

import com.accenture.certificacion.models.InformacionBasicaDeUnVuelo;
import com.accenture.certificacion.tasks.ReservarUnVuelo;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ReservarVueloEnLatamStepDefinitions {
    @Cuando("^Daniel intenta reservar un vuelo desde MDE hacia SMR$")
    public void danielIntentaReservarUnVueloDesdeMDEHaciaSMR(List<InformacionBasicaDeUnVuelo> informacionBasica) {
        theActorInTheSpotlight().attemptsTo(ReservarUnVuelo.enLaPaginaDeLatam(informacionBasica.get(0)));

    }

    @Entonces("^deberia ver el medio de pago para terminar su reversa$")
    public void deberiaVerElMedioDePagoParaTerminarSuReversa() {
        //TODO por implementar
    }

}
