package kot.negocio.entidades

class Ciudad(val id:Long, val nombre: String, val idDepartamento: Long, override val version: Long): Versionable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Ciudad

        if (id != other.id) return false
        if (nombre != other.nombre) return false
        if (idDepartamento != other.idDepartamento) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + nombre.hashCode()
        result = 31 * result + idDepartamento.hashCode()
        result = 31 * result + version.hashCode()
        return result
    }
}