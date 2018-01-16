package kot.negocio.repositorios

import kot.negocio.entidades.Persona
import kot.negocio.entidades.TipoIdentificacion

interface RepositorioPersonas:RepositorioBasico<Persona> {
    fun buscarPorIdentificacion(identificacion:Int):Persona?
    fun buscarPorIdentificacionYTipo(identificacion: Int, tipoIdentificacion: TipoIdentificacion):Persona?
}