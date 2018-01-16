package kot.negocio.entidades

enum class TipoColaboracion(val nombre: String) {
    JOINT_VENTURE("JOI"),
    FRANQUICIA("FRA"),
    AGENCIA_COMERCIAL("AGE"),
    DISTRIBUCION("DIS"),
    CONSORCIO("CON"),
    UNION_TEMPORAL("UNI"),
    CUENTAS_EN_PARTICIPACION("CUE"),
    LICENCIA_DE_USO_DE_DERECHOS_DE_AUTOR("LIC");

    companion object {
        private val map = TipoColaboracion.values().associateBy(TipoColaboracion::nombre)
        fun porNombre(nombre: String):TipoColaboracion? = map[nombre]
    }

}