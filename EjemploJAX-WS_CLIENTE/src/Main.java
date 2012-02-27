import com.unisys.voice.palestra.ws.servidor.EjemploWS;
import com.unisys.voice.palestra.ws.servidor.EjemploWSService;


public class Main {

   /**
    * @param args
    */
   public static void main(String[] args) {
      // Obtencion del cliente. Sólo funciona si en wsimport usamos la URL
      // real del fichero wsdl, estilo http://dominioreal/unwebservice?wsdl
	   EjemploWSService unWebServiceService = new EjemploWSService();
	   EjemploWS unWebService = unWebServiceService.getEjemploWSPort();

      // Ya podemos usarlo
      System.out.println(unWebService.suma(11, 22));

   }
}
