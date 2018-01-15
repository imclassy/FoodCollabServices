package kot.negocio.entidades

class Empresa(val id:Long,
              val idPersona:Long,
              val regimen: Regimen,
              val esGranContribuyente:Boolean,
              val esAutoRetenedor:Boolean,
              override val version: Long): Versionable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Empresa

        if (id != other.id) return false
        if (idPersona != other.idPersona) return false
        if (regimen != other.regimen) return false
        if (esGranContribuyente != other.esGranContribuyente) return false
        if (esAutoRetenedor != other.esAutoRetenedor) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + idPersona.hashCode()
        result = 31 * result + regimen.hashCode()
        result = 31 * result + esGranContribuyente.hashCode()
        result = 31 * result + esAutoRetenedor.hashCode()
        result = 31 * result + version.hashCode()
        return result
    }
}