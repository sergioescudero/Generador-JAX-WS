import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import com.unisys.voice.palestra.ws.servidor.EjemploWS;
import com.unisys.voice.palestra.ws.servidor.EjemploWSService;


public class MainURL {
	/**
	    * @param args
	    * @throws MalformedURLException
	    */
	   public static void main(String[] args) throws MalformedURLException {
	      // Obtencion del cliente
		   EjemploWSService unWebServiceService = new EjemploWSService(
	            new URL("http://localhost:8080/EjemploWS?wsdl"),    // URL real del web service.
	            new QName("http://servidor.ws.palestra.voice.unisys.com/", "EjemploWSService"));
		   
		   EjemploWS unWebService = unWebServiceService.getEjemploWSPort();

	      // Ya podemos usarlo
	      System.out.println(unWebService.suma(11, 22));

	   }
}
