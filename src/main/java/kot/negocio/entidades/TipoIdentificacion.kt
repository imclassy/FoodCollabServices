package kot.negocio.entidades

enum class TipoIdentificacion(val nombre: String) {
    CEDULA("CC"),
    NIT("NIT");

    companion object {
        private val map = TipoIdentificacion.values().associateBy(TipoIdentificacion::nombre)
        fun porNombre(nombre: String):TipoIdentificacion? = map[nombre]
    }
}