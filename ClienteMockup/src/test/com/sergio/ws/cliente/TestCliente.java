package test.com.sergio.ws.cliente;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.sergio.ws.cliente.ClienteWS;

/**
 * Implementa los test unitarios simulando <br/>
 * los clientes de los distintos servicios web.
 * @author Sergio Escudero
 *
 */
public class TestCliente extends TestCase{
	private static final String mensajeError = "Error en la llamada al WS ";
	
	private ClienteWS cliente = null;
	
	public TestCliente(){
		super();
		cliente = new ClienteWS();
	}
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestCliente.class);		
	}
	
	public void testMockupWS() throws InterruptedException {
		String url = "http://localhost:8080/gestorws/mockup?wsdl";
		String qname = "http://impl.ws.sergio.com/";
		String webService = "MockupWS";
		String clase = "com.sergio.ws.mockup.MockupWS";
		List<Object> parametros = new ArrayList<Object>();
		String sessionGUID = "1657894";
		String parametro01 = "uno";
		String parametro02 = "dos";
		parametros.add(sessionGUID);
		parametros.add(parametro01);
		parametros.add(parametro02);
		String nombreClaseImplementadoraWebService = "MockupWSImpl";
		String metodo = "ejecutarMetodoWS";
		
		assertTrue(mensajeError + webService, 
				cliente.realizarLlamadaServidor(url, qname, clase, parametros, webService, 
						nombreClaseImplementadoraWebService, metodo));
	}
}
