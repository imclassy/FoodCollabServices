package kot.negocio.entidades

class DescuentoArticulo(override val id: Long?,
                        val colaboracion: Colaboracion,
                        val descuento: Descuento,
                        val articulo: Articulo,
                        override val version: Long?):Identificable, Versionable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescuentoArticulo

        if (id != other.id) return false
        if (colaboracion != other.colaboracion) return false
        if (descuento != other.descuento) return false
        if (articulo != other.articulo) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + colaboracion.hashCode()
        result = 31 * result + descuento.hashCode()
        result = 31 * result + articulo.hashCode()
        result = 31 * result + (version?.hashCode() ?: 0)
        return result
    }
}