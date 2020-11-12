package com.accenture.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/politica_de_proteccion_de_datos_personales.feature",
        glue = {"com.accenture.certificacion.stepdefinitions"},
        snippets = SnippetType.CAMELCASE)
public class PoliticaDeProteccionDeDatosPersonales {
}
