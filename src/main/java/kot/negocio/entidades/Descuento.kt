package kot.negocio.entidades

class Descuento (override val id: Long?,
                 val colaboracion: Colaboracion,
                 val nombre: String,
                 val porcentaje: Long,
                 val tipoDescuento: TipoDescuento,
                 val fechaCreacion: Long,
                 val fechaVencimiento: Long?,
                 val estaActivo: Boolean = true,
                 override val version: Long?):Identificable, Versionable{
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Descuento

        if (id != other.id) return false
        if (colaboracion != other.colaboracion) return false
        if (nombre != other.nombre) return false
        if (porcentaje != other.porcentaje) return false
        if (tipoDescuento != other.tipoDescuento) return false
        if (fechaCreacion != other.fechaCreacion) return false
        if (fechaVencimiento != other.fechaVencimiento) return false
        if (estaActivo != other.estaActivo) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + colaboracion.hashCode()
        result = 31 * result + nombre.hashCode()
        result = 31 * result + porcentaje.hashCode()
        result = 31 * result + tipoDescuento.hashCode()
        result = 31 * result + fechaCreacion.hashCode()
        result = 31 * result + (fechaVencimiento?.hashCode() ?: 0)
        result = 31 * result + estaActivo.hashCode()
        result = 31 * result + (version?.hashCode() ?: 0)
        return result
    }
}