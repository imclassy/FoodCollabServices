package kot.negocio.entidades

class CuentasEnParticipacion(override val id: Long?,
                             val gestor: Empresa,
                             val colaboracion: Colaboracion,
                             override val version: Long?):Identificable, Versionable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CuentasEnParticipacion

        if (id != other.id) return false
        if (gestor != other.gestor) return false
        if (colaboracion != other.colaboracion) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + gestor.hashCode()
        result = 31 * result + colaboracion.hashCode()
        result = 31 * result + (version?.hashCode() ?: 0)
        return result
    }
}