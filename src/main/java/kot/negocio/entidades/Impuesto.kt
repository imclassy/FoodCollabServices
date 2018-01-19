package kot.negocio.entidades

class Impuesto(override val id: Long?=1L,
               val colaboracion: Colaboracion,
               val codigo: String,
               val nombre: String,
               val porcentaje: Long,
               override val version: Long?=1L):Identificable, Versionable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Impuesto

        if (id != other.id) return false
        if (colaboracion != other.colaboracion) return false
        if (codigo != other.codigo) return false
        if (nombre != other.nombre) return false
        if (porcentaje != other.porcentaje) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + colaboracion.hashCode()
        result = 31 * result + codigo.hashCode()
        result = 31 * result + nombre.hashCode()
        result = 31 * result + porcentaje.hashCode()
        result = 31 * result + (version?.hashCode() ?: 0)
        return result
    }
}