package kot.negocio.entidades

class RUT(override val id:Long?=null,
          val persona: Persona,
          val regimen: Regimen,
          val esGranContribuyente:Boolean,
          val esAutoRetenedor:Boolean,
          override val version: Long?=null): Versionable, Identificable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RUT

        if (id != other.id) return false
        if (persona != other.persona) return false
        if (regimen != other.regimen) return false
        if (esGranContribuyente != other.esGranContribuyente) return false
        if (esAutoRetenedor != other.esAutoRetenedor) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + persona.hashCode()
        result = 31 * result + regimen.hashCode()
        result = 31 * result + esGranContribuyente.hashCode()
        result = 31 * result + esAutoRetenedor.hashCode()
        result = 31 * result + (version?.hashCode() ?: 0)
        return result
    }
}