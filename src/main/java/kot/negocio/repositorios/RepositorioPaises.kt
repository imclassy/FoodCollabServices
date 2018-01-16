package kot.negocio.repositorios

import kot.negocio.entidades.Pais

interface RepositorioPaises: RepositorioBasico<Pais> {
    fun listarTodos():List<Pais>
}