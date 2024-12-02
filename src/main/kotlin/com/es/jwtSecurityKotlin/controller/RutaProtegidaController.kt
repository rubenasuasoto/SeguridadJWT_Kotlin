package com.es.jwtSecurityKotlin.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rutas_protegidas")
class RutaProtegidaController {


    @GetMapping("/recurso1")
    fun getRecursoProtegidoUno () : String {
        return "Este recurso sólo puede ser accedido por usuarios registrados en la BDD \uD83E\uDD75"
    }
    @GetMapping("/recurso2")
    fun getRecursoProtegidopublica(): String{
        return "Este recurso  puede ser accedido  por cualquiera en la BDD \uD83E\uDD75"
    }
    @GetMapping("/recurso/{id}")
    fun getRecursoProtegido(): String{
        return "Obtener recurso por el id  \uD83E\uDD75"
    }
    @DeleteMapping("/recurso/{id}")
    fun deleteRecursoProtegido(): String{
        return "Eliminar recurso por el id  \uD83E\uDD75"
    }
}