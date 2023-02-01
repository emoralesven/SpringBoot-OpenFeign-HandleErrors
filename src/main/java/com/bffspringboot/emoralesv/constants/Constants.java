package com.bffspringboot.emoralesv.constants;

/**
 * CuentasInversionContants.
 *
 * @author Claudio Quinteros.
 * @version 1.0.0, 01-08-2022
 */
public final class Constants {

    // -------------------------------------------------------------------
    // -- API SWAGGER ----------------------------------------------------
    // -------------------------------------------------------------------
    /** API_RESPONSE_OK. */
    public static final String API_RESPONSE_OK = "Ejecución OK";
    /** API_RESPONSE_FORBIDDEN. */
    public static final String API_RESPONSE_FORBIDDEN = "No autorizado para realizar la operacion";
    /** API_RESPONSE_UNAUTHORIZED. */
    public static final String API_RESPONSE_UNAUTHORIZED = "No autenticado para realizar la operacion";
    /** API_RESPONSE_BAD_REQUEST. */
    public static final String API_RESPONSE_BAD_REQUEST = "Error al realizar la peticion";
    /** API_RESPONSE_ERROR. */
    public static final String API_RESPONSE_ERROR = "Error en ejecución";
    /** API_FECHA_HABIL_ERROR. */
    public static final String API_FECHA_HABIL_ERROR = "Error al consultar Fecha Habil";
    /** API_FECHA_HABIL_OK. */
    public static final String API_FECHA_HABIL_OK = "Exito al consultar Fecha habil";

    public static final String CRITERIO_BUSQUEDA_NULO= "El criterio de busqueda es nulo";

    public static final String DESCRIPCION_SALDO_CAJA = "Caja Banchile";

    private Constants() {
        throw new UnsupportedOperationException("Prohibido Instanciar esta clase");
    }
}