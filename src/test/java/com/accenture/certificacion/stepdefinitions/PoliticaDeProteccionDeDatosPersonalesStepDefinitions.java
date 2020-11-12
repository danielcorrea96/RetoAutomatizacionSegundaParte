package com.accenture.certificacion.stepdefinitions;

import com.accenture.certificacion.questions.VerificarElArchivo;
import com.accenture.certificacion.tasks.RevisarLaPolitica;
import com.accenture.certificacion.userinterface.PaginaPrincipalLatam;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PoliticaDeProteccionDeDatosPersonalesStepDefinitions {
    private PaginaPrincipalLatam latam;
    @Before
    public void configuracionesIniciales(){
        setTheStage(new OnlineCast());
    }

    @Dado("^que Daniel ingresa a la pagina de LATAM$")
    public void queDanielIngresaALaPaginaDeLATAM() {
        theActorCalled("Daniel").wasAbleTo(Open.browserOn(latam));
    }


    @Cuando("^Daniel realiza la descarga del archivo de la revision de la politica de proteccion de datos personales$")
    public void danielRealizaLaDescargaDelArchivoDeLaRevisionDeLaPoliticaDeProteccionDeDatosPersonales() {
        theActorInTheSpotlight().attemptsTo(RevisarLaPolitica.deTratamientoDeDatosPersonales());
    }

    @Entonces("^deberia visualizar el archivo PDF con nombre (.*) de LATAM$")
    public void deberiaVisualizarElArchivoPDFDeLaPoliticaDeProteccionDeDatosPersonalesDeLATAM(String nombreDeArchivo) {
        theActorInTheSpotlight().should(seeThat(VerificarElArchivo.deLaPoliticaDeDatosPersonales(nombreDeArchivo)));
    }
}
