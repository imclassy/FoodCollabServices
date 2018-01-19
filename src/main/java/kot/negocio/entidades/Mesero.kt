package kot.negocio.entidades

class Mesero(override val id: Long?,
             val colaboracion: Colaboracion,
             val persona: Persona,
             val estaActivo: Boolean = true,
             override val version: Long?): Identificable, Versionable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Mesero

        if (id != other.id) return false
        if (colaboracion != other.colaboracion) return false
        if (persona != other.persona) return false
        if (estaActivo != other.estaActivo) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + colaboracion.hashCode()
        result = 31 * result + persona.hashCode()
        result = 31 * result + estaActivo.hashCode()
        result = 31 * result + (version?.hashCode() ?: 0)
        return result
    }
}