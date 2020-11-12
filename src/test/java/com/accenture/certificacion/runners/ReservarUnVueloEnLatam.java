package com.accenture.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/reservar_vuelo_en_latam.feature",
        glue = {"com.accenture.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class ReservarUnVueloEnLatam {
}
