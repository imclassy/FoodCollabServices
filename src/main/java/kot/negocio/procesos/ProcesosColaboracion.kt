package kot.negocio.procesos

import kot.negocio.entidades.Colaboracion
import kot.negocio.entidades.RestauranteColaboracion
import kot.negocio.repositorios.RepositorioColaboraciones
import kot.negocio.repositorios.RepositorioRestaurantesColaboraciones

open class ProcesosColaboracion(val repositorioColaboraciones: RepositorioColaboraciones,
                                val repositorioRestaurantesColaboraciones: RepositorioRestaurantesColaboraciones) {

    fun iniciar(colaboracion: Colaboracion, idsRestaurantes:List<Long>){
        val idColaboracion = repositorioColaboraciones.insertar(colaboracion)

        idsRestaurantes.forEach { idRestaurante ->
            repositorioRestaurantesColaboraciones.insertar(RestauranteColaboracion(idRestaurante=idRestaurante, idColaboracion = idColaboracion))
        }
    }

}