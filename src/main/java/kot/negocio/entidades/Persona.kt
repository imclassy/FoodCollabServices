package kot.negocio.entidades

class Persona (override val id: Long?,
               val nombreCompleto: String,
               val primerNombre: String,
               val segundoNombre: String,
               val tipoIdentificacion: TipoIdentificacion,
               val identificacion: Int,
               val digitoVerificacion: Int,
               val tipoPersona: TipoPersona,
               val idCiudad: Long,
               val direccion: String,
               val telefono: String,
               val email: String,
               val estaActiva: Boolean = true,
               override val version: Long? ): Versionable, Identificable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Persona

        if (id != other.id) return false
        if (nombreCompleto != other.nombreCompleto) return false
        if (primerNombre != other.primerNombre) return false
        if (segundoNombre != other.segundoNombre) return false
        if (tipoIdentificacion != other.tipoIdentificacion) return false
        if (identificacion != other.identificacion) return false
        if (digitoVerificacion != other.digitoVerificacion) return false
        if (tipoPersona != other.tipoPersona) return false
        if (idCiudad != other.idCiudad) return false
        if (direccion != other.direccion) return false
        if (telefono != other.telefono) return false
        if (email != other.email) return false
        if (version != other.version) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + nombreCompleto.hashCode()
        result = 31 * result + primerNombre.hashCode()
        result = 31 * result + segundoNombre.hashCode()
        result = 31 * result + tipoIdentificacion.hashCode()
        result = 31 * result + identificacion
        result = 31 * result + digitoVerificacion
        result = 31 * result + tipoPersona.hashCode()
        result = 31 * result + idCiudad.hashCode()
        result = 31 * result + direccion.hashCode()
        result = 31 * result + telefono.hashCode()
        result = 31 * result + email.hashCode()
        result = 31 * result + (version?.hashCode() ?: 0)
        return result
    }
}