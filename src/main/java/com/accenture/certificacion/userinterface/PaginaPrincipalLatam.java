package com.accenture.certificacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.latam.com/es_co/")
public class PaginaPrincipalLatam extends PageObject {
    public static final Target CONTRATO_DE_TRANSAPORTE = Target.the("Contrato de transporte").locatedBy("//a[@title='Contrato de transporte']");
    public static final Target ORIGEN = Target.the("Origen").locatedBy("//input[@id='compra-select-origin']");
    public static final Target DESTINO = Target.the("Destino").locatedBy("//input[@id='compra-select-destination']");
    public static final Target SOLO_IDA = Target.the("Origen").locatedBy("(//input[@name='flightTypes']//following::label[@data-value=\"showDepartureOnly\"])[1]");
}
