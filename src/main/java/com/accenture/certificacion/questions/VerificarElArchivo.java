package com.accenture.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class VerificarElArchivo implements Question<Boolean> {
    private String nombreDeArchivo;

    public VerificarElArchivo(String nombreDeArchivo) {
        this.nombreDeArchivo = nombreDeArchivo;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println(BrowseTheWeb.as(actor).getDriver().getCurrentUrl());
        return BrowseTheWeb.as(actor).getDriver().getCurrentUrl().contains(nombreDeArchivo);
    }

    public static VerificarElArchivo deLaPoliticaDeDatosPersonales(String nombreDeArchivo){
        return new VerificarElArchivo(nombreDeArchivo);
    }
}
