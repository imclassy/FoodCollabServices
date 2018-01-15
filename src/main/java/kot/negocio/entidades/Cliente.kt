package kot.negocio.entidades

class Cliente(val id:Long, val idPersona: Long, val idEmpresa: Long?, val fechaRegistro: Long, override val version: Long):Versionable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Cliente

        if (id != other.id) return false
        if (idPersona != other.idPersona) return false
        if (fechaRegistro != other.fechaRegistro) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + idPersona.hashCode()
        result = 31 * result + fechaRegistro.hashCode()
        result = 31 * result + version.hashCode()
        return result
    }
}