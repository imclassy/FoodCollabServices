package kot.negocio.entidades

class Articulo(override val id: Long?=null,
               val colaboracion: Colaboracion,
               val codigo: String,
               val nombre: String,
               val padre: Articulo?,
               val claseArticulo: ClaseArticulo,
               val unidad: Unidad,
               val impuestos: Set<Impuesto>,
               val estaActivo: Boolean = true,
               override val version: Long?=null): Identificable, Versionable {
}