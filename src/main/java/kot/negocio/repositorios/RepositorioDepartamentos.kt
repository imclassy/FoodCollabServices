package kot.negocio.repositorios

import kot.negocio.entidades.Departamento

interface RepositorioDepartamentos: RepositorioBasico<Departamento> {
    fun listarTodos():List<Departamento>
    fun listarPorPais(idPais: Long):List<Departamento>
}