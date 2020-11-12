package com.accenture.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ContratoDeTransporte {

    public static final Target ANEXO_DE_TRANSPORTE = Target.the("Anexo de transporte").locatedBy("//a[@title='Anexo contrato transporte Colombia']");
    public static final Target REVISAR_POLITICA = Target.the("Revisar politica").locatedBy("//a[contains(text(),'Revisa la política de protección de datos personales')]");

}
