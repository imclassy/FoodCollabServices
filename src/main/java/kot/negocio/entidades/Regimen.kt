package kot.negocio.entidades

enum class Regimen(val nombre: String) {
    COMUN("COM"),
    SIMPLIFICADO("SIM");

    companion object {
        private val map = Regimen.values().associateBy(Regimen::nombre)
        fun porNombre(nombre: String):Regimen? = map[nombre]
    }
}