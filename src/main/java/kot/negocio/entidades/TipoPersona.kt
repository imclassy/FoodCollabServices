package kot.negocio.entidades

enum class TipoPersona (val nombre: String) {
    NATURAL("NAT"),
    JURIDICA("JUR");

    companion object {
        private val map = TipoPersona.values().associateBy(TipoPersona::nombre)
        fun porNombre(nombre: String):TipoPersona? = map[nombre]
    }
}