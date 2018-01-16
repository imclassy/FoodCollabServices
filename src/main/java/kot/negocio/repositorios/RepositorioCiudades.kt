package kot.negocio.repositorios

import kot.negocio.entidades.Ciudad

interface RepositorioCiudades:RepositorioBasico<Ciudad> {
    fun listarTodos():List<Ciudad>
    fun listarPorDepartamento(idDepartamento: Long):List<Ciudad>
}