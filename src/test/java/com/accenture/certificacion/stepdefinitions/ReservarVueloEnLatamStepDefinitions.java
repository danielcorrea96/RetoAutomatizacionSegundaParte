package com.accenture.certificacion.stepdefinitions;

import com.accenture.certificacion.models.InformacionBasicaDeUnVuelo;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class ReservarVueloEnLatam {
    @Cuando("^Daniel intenta reservar un vuelo desde MDE hacia SMR$")
    public void danielIntentaReservarUnVueloDesdeMDEHaciaSMR(List<InformacionBasicaDeUnVuelo> informacionBasica) {
        OnStage.theActorInTheSpotlight().attemptsTo();

    }

    @Entonces("^deberia ver el medio de pago para terminar su reversa$")
    public void deberiaVerElMedioDePagoParaTerminarSuReversa() {

    }

}
