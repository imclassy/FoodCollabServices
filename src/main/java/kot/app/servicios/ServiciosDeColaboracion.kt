package kot.app.servicios

import kot.app.dtos.InicioColaboracionDTO
import kot.negocio.procesos.ProcesosColaboracion
import org.springframework.stereotype.Service

@Service
open class ServiciosDeColaboracion(val procesosColaboracion: ProcesosColaboracion) {
    fun iniciar(inicioColaboracionDTO: InicioColaboracionDTO){
        procesosColaboracion.iniciar(inicioColaboracionDTO.colaboracion, inicioColaboracionDTO.idsRestaurantes)
    }
}