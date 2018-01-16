package kot.negocio.repositorios

import kot.negocio.entidades.Identificable

interface RepositorioBasico<E:Identificable> {
    fun insertar(entidad: E):Long
    fun actualizar(entidad: E)
    fun borrar(id: Long)
    fun buscarPorId(id: Long): E?
}