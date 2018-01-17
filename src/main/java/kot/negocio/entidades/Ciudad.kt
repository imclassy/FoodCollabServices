package kot.negocio.entidades

class Ciudad(override val id:Long?=null,
             val nombre: String,
             val departamento: Departamento,
             val codigoDian:String?,
             override val version: Long?=null): Versionable, Identificable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Ciudad

        if (id != other.id) return false
        if (nombre != other.nombre) return false
        if (departamento != other.departamento) return false
        if (codigoDian != other.codigoDian) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + nombre.hashCode()
        result = 31 * result + departamento.hashCode()
        result = 31 * result + (codigoDian?.hashCode() ?: 0)
        result = 31 * result + (version?.hashCode() ?: 0)
        return result
    }
}