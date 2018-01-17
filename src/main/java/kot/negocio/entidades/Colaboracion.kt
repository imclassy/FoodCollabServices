package kot.negocio.entidades


/* Clase que representa un contrato de colaboracion entre empresas/restaurantes */
class Colaboracion(override val id:Long?=null,
                   val nombre: String,
                   val descripcion: String?,
                   val fechaInicio: Long,
                   val tipoColaboracion: TipoColaboracion,
                   val miembros: List<Empresa>,
                   override val version: Long?=null):Versionable, Identificable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Colaboracion

        if (id != other.id) return false
        if (nombre != other.nombre) return false
        if (descripcion != other.descripcion) return false
        if (fechaInicio != other.fechaInicio) return false
        if (tipoColaboracion != other.tipoColaboracion) return false
        if (miembros != other.miembros) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + nombre.hashCode()
        result = 31 * result + (descripcion?.hashCode() ?: 0)
        result = 31 * result + fechaInicio.hashCode()
        result = 31 * result + tipoColaboracion.hashCode()
        result = 31 * result + miembros.hashCode()
        result = 31 * result + (version?.hashCode() ?: 0)
        return result
    }
}