package kot.negocio.entidades

class Cliente(override val id:Long?=null,
              val colaboracion: Colaboracion,
              val idPersona: Long,
              val fechaRegistro: Long,
              val estaActivo: Boolean = true,
              override val version: Long?=null):Versionable, Identificable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Cliente

        if (id != other.id) return false
        if (colaboracion != other.colaboracion) return false
        if (idPersona != other.idPersona) return false
        if (fechaRegistro != other.fechaRegistro) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + colaboracion.hashCode()
        result = 31 * result + idPersona.hashCode()
        result = 31 * result + fechaRegistro.hashCode()
        result = 31 * result + (version?.hashCode() ?: 0)
        return result
    }
}