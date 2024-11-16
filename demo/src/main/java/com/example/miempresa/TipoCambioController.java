package com.miempresa.tipoCambio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Esta anotación hace que la clase sea un controlador REST
public class TipoCambioController {

    private final TipoCambioService tipoCambioService;

    // Inyectamos el servicio que consume el SOAP
    public TipoCambioController(TipoCambioService tipoCambioService) {
        this.tipoCambioService = tipoCambioService;
    }

    // Endpoint para obtener el tipo de cambio
    @GetMapping("/api/tipo-cambio")
    public String obtenerTipoCambio() {
        try {
            // Llamamos al servicio que consume el SOAP y obtenemos el tipo de cambio
            return tipoCambioService.getTipoCambio();
        } catch (Exception e) {
            // Si hay algún error, devolvemos un mensaje de error
            return "Error al obtener el tipo de cambio: " + e.getMessage();
        }
    }
}