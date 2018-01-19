package kot.negocio.entidades

enum class TipoDescuento(val nombre: String) {
    ARTICULO("ARTICULO"),
    CLIENTE("CLIENTE"),
    FACTURA("FACTURA"),
    GENERAL("GENERAL");

    companion object {
        private val map = TipoDescuento.values().associateBy(TipoDescuento::nombre)
        fun porNombre(nombre: String):TipoDescuento? = map[nombre]
    }
}