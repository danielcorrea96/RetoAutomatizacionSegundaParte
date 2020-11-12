package com.accenture.certificacion.tasks;

import com.accenture.certificacion.models.InformacionBasicaDeUnVuelo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ReservarUnVuelo implements Task {
    private InformacionBasicaDeUnVuelo informacionBasicaDeUnVuelo;

    public ReservarUnVuelo(InformacionBasicaDeUnVuelo informacionBasicaDeUnVuelo) {
        this.informacionBasicaDeUnVuelo = informacionBasicaDeUnVuelo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


    }
    public static ReservarUnVuelo enLaPaginaDeLatam(InformacionBasicaDeUnVuelo informacion){
        return Tasks.instrumented(ReservarUnVuelo.class, informacion);
    }
}
