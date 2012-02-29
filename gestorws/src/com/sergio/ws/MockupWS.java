package com.sergio.ws;

//PARA FICHEROS
//import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.WebService;

//PARA FICHEROS
//@javax.xml.ws.soap.MTOM
@WebService(serviceName = "MockupWS", endpointInterface ="com.sergio.ws.MockupWS")
public class MockupWS {

	@WebMethod(operationName = "ejecutarMetodoWS")
	@WebResult(name = "resultadoOperacion")
	public String ejecutarMetodoWS(
			@WebParam(name = "sessionGuid", mode = Mode.IN) String sessionGuid,
			@WebParam(name = "parametro01", mode = Mode.IN) String parametro01,
			@WebParam(name = "parametro02", mode = Mode.IN) String parametro02) {
		
		String resultado = "OK";
		
		
		
		return resultado;
	}
	
	/*
	 * PARA FICHEROS
	public void fileDownload(String nombre,
			@XmlMimeType("application/octet-stream") DataHandler data, String codRutaRelativa)
			throws IOException {
		String message = MessageFormat.format((String) lp
				.getValor(ConstantesUtils.MESSAGE_FICHERO_COPIA_INICIO),
				nombre);
		helper.showMessageInfo(message);
		
		Fichero fichero = new Fichero();
		fichero.setRutaAbsoluta(codRutaRelativa, nombre);
		String rutaAbsoluta = fichero.getRutaAbsoluta();
		StreamingDataHandler dh = (StreamingDataHandler) data;
		File file = new File(rutaAbsoluta);
		dh.moveTo(file);
		dh.close();
		
		message = MessageFormat.format((String) lp
				.getValor(ConstantesUtils.MESSAGE_FICHERO_COPIA_FIN),
				nombre);
		helper.showMessageInfo(message);
	}*/
	
	
}