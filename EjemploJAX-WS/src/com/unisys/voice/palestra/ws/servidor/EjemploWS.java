package com.unisys.voice.palestra.ws.servidor;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class EjemploWS {
	
    @WebMethod
    public float suma(float a, float b) {
        return (a + b);
    }
    
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/EjemploWS", new EjemploWS());
    }
}