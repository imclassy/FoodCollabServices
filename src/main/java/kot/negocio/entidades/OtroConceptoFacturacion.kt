package kot.negocio.entidades

class OtroConceptoFacturacion(override val id: Long?,
                              val colaboracion: Colaboracion,
                              val codigo: String,
                              val nombre: String,
                              val valor: Long,
                              override val version: Long?):Identificable, Versionable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as OtroConceptoFacturacion

        if (id != other.id) return false
        if (colaboracion != other.colaboracion) return false
        if (codigo != other.codigo) return false
        if (nombre != other.nombre) return false
        if (valor != other.valor) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + colaboracion.hashCode()
        result = 31 * result + codigo.hashCode()
        result = 31 * result + nombre.hashCode()
        result = 31 * result + valor.hashCode()
        result = 31 * result + (version?.hashCode() ?: 0)
        return result
    }
}