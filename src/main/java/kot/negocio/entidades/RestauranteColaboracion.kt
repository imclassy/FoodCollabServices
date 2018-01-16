package kot.negocio.entidades

class RestauranteColaboracion(override val id: Long?=null,
                              val idRestaurante: Long,
                              val idColaboracion: Long,
                              override val version: Long?=null): Versionable, Identificable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RestauranteColaboracion

        if (id != other.id) return false
        if (idRestaurante != other.idRestaurante) return false
        if (idColaboracion != other.idColaboracion) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + idRestaurante.hashCode()
        result = 31 * result + idColaboracion.hashCode()
        result = 31 * result + (version?.hashCode() ?: 0)
        return result
    }
}