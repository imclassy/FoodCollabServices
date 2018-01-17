package kot.negocio.entidades

class Consorcio(override val id: Long?,
                val empresaConsorcio: Empresa,
                val colaboracion: Colaboracion,
                override val version: Long?):Identificable, Versionable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Consorcio

        if (id != other.id) return false
        if (empresaConsorcio != other.empresaConsorcio) return false
        if (colaboracion != other.colaboracion) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + empresaConsorcio.hashCode()
        result = 31 * result + colaboracion.hashCode()
        result = 31 * result + (version?.hashCode() ?: 0)
        return result
    }
}