package kot.negocio.entidades

class Restaurante(override val id: Long?=null,
                  val idRUT: Long,
                  override val version: Long?=null): Versionable, Identificable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Restaurante

        if (id != other.id) return false
        if (idRUT != other.idRUT) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + idRUT.hashCode()
        result = 31 * result + (version?.hashCode() ?: 0)
        return result
    }
}