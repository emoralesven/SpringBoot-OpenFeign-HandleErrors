package com.bffspringboot.emoralesv.exceptions;

public class CustomException extends RuntimeException {
    private static final long serialVersionUID = 7062543009878718349L;
    private final String codigo;
    private final String mensaje;

    public CustomException(String codigo, String mensaje) {
        super(mensaje);
        this.mensaje = mensaje;
        this.codigo = codigo;
    }

    public CustomException(String codigo, String mensaje, Throwable t) {
        super(mensaje, t);
        this.mensaje = mensaje;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMensaje() {
        return mensaje;
    }
}

