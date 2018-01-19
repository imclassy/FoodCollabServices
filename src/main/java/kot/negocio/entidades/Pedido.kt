package kot.negocio.entidades

class Pedido (override val id: Long?,
              val colaboracion: Colaboracion,
              val cliente: Cliente,
              override val version: Long?): Identificable, Versionable{
}