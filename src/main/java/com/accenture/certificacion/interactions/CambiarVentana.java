package com.accenture.certificacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;

import java.util.Set;

public class CambiarVentana implements Interaction {
    private String ventanaActual;
    private Set<String> ventanasSiguientes;

    @Override
    public <T extends Actor> void performAs(T actor) {
        ventanaActual = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        ventanasSiguientes = BrowseTheWeb.as(actor).getDriver().getWindowHandles();

        ventanasSiguientes.forEach(
                ventana -> {
                    if(!ventana.equals(ventanaActual)){
                        actor.attemptsTo(Switch.toWindow(ventana));
                    }
                }
        );
    }

    public static CambiarVentana delNavegador(){
        return new CambiarVentana();
    }
}
