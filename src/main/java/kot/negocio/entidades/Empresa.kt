package kot.negocio.entidades

class Empresa(override val id: Long?=null,
              val rut: RUT,
              val representanteLegal: Persona?,
              val objeto: String?,
              val estaActiva: Boolean = true,
              override val version: Long?=null): Versionable, Identificable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Empresa

        if (id != other.id) return false
        if (rut != other.rut) return false
        if (representanteLegal != other.representanteLegal) return false
        if (objeto != other.objeto) return false
        if (estaActiva != other.estaActiva) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + rut.hashCode()
        result = 31 * result + (representanteLegal?.hashCode() ?: 0)
        result = 31 * result + (objeto?.hashCode() ?: 0)
        result = 31 * result + estaActiva.hashCode()
        result = 31 * result + (version?.hashCode() ?: 0)
        return result
    }
}