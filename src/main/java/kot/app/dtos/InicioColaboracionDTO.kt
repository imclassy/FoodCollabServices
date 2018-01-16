package kot.app.dtos

import kot.negocio.entidades.Colaboracion
import kot.negocio.entidades.Restaurante

class InicioColaboracionDTO(val colaboracion: Colaboracion,
                            val idsRestaurantes:List<Long>) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as InicioColaboracionDTO

        if (colaboracion != other.colaboracion) return false
        if (idsRestaurantes != other.idsRestaurantes) return false

        return true
    }

    override fun hashCode(): Int {
        var result = colaboracion.hashCode()
        result = 31 * result + idsRestaurantes.hashCode()
        return result
    }
}