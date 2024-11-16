package com.miempresa.tipoCambio;

import org.springframework.stereotype.Service;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;  // Para usar Service de SOAP

@Service
public class TipoCambioService {

    // URL del servicio WSDL
    private static final String WSDL_URL = "https://www.banquat.gob.gt/variables/ws/TypeChange.asmx?WSDL";
    // Nombre del servicio, debe coincidir con el QName del WSDL
    private static final QName SERVICE_NAME = new QName("http://www.banquat.gob.gt/", "TipoCambio");

    public String getTipoCambio() throws Exception {
        // Creamos la URL para el servicio SOAP
        URL url = new URL(WSDL_URL);
        
        // Creamos el servicio SOAP con la URL y el QName
        Service service = Service.create(url, SERVICE_NAME);
        
        // Usamos el puerto para acceder a los métodos del servicio
        TipoCambio tipoCambio = service.getPort(TipoCambio.class);
        
        
 
// Llamamos al método del servicio y obtenemos la respuesta
        return tipoCambio.tipoCambioDiaString();  // Suponiendo que este es el método que devuelve el tipo de cambio
    }
}
