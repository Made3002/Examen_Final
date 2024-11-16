package com.made.demo;

import javax.xml.ws.Service;
import java.net.URL;
import javax.xml.namespace.QName;

@Service
public class TipoCambioService {

    private static final String WSDL_URL = "https://www.banquat.gob.gt/variables/ws/TypeChange.asmx?WSDL";
    private static final QName SERVICE_NAME = new QName("http://www.banquat.gob.gt/", "TipoCambio");

    public String getTipoCambio() throws Exception {
        URL url = new URL(WSDL_URL);
        Service service = Service.create(url, SERVICE_NAME);
        TipoCambio tipoCambio = service.getPort(TipoCambio.class);
        return tipoCambio.tipoCambioDiaString();
    }
}
