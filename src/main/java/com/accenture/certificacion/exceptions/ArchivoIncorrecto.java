package com.accenture.certificacion.exceptions;

public class ArchivoIncorrecto extends AssertionError {
    public static final String ARCHIVO_INCORRECTO = "Archivo incorrecto";
    public ArchivoIncorrecto(String message, Throwable cause) {
        super(message, cause);
    }
}
