package com.sergio.ws.cliente;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.List;

/**
 * El cliente, realiza las conexiones con el servidor.<BR/>
 * Utiliza Reflection para poder ser reutilizado <BR/>
 * por todos los servicios web 
 * @author Sergio Escudero
 */
public class ClienteWS {
	
	private static final String SUFIJO_SERVICIO = "_Service";

	public ClienteWS() {
		super();
	}

	/**
	 * Realiza la llamada al servicio web
	 * @param url URL de conexión del servicio web, la dirección del WSDL.
	 * @param qname Qualified Name, obtener de clase WebService generada por wsimport
	 * @param clase Nombre de la clase generada por wsimport (pkt incluido)
	 * @param parametros parámetros del servicio web.
	 * @param webService nombre del servicio web
	 * @param nombreClaseImpl nombre de la clase implementadora en Servidor. Ver método get que devuelve el servicio web.
	 * @param metodo método del servicio web a ejecutar
	 * @return resultado de la ejecución del servicio web.
	 */
	public boolean realizarLlamadaServidor(String url, String qname,
			String clase, List<Object> parametros, String webService, String nombreClaseImpl, String metodo) {
		boolean resultado = true;
		
		try {
			//obtención del cliente
			Class<?> clazz = Class.forName(clase + SUFIJO_SERVICIO);
			Constructor<?> constructor = clazz.getConstructor(
												java.net.URL.class, 
												javax.xml.namespace.QName.class);
			java.net.URL miURL = new java.net.URL(url);
			javax.xml.namespace.QName miQname = new javax.xml.namespace.QName(
					qname,
					webService);
			Object wss = constructor.newInstance(miURL, miQname);
			
			
			
			Class<?>[] tiposPort = new Class<?>[0];
			Object[] argumentosPort = new Object[0];
			String metodoPort = "get" + nombreClaseImpl + "Port";
			
			Object ws = wss.getClass().getMethod(metodoPort, tiposPort).invoke(wss, argumentosPort);
			
			Class<?>[] tipos = new Class<?>[parametros.size()];
			Object[] argumentos = new Object[parametros.size()];
			for (int i=0;i<parametros.size();i++){
				tipos[i] = parametros.get(i).getClass();
				argumentos[i] = parametros.get(i);
			}
			//llamada al servidor
			String response  = (String) ws.getClass().getMethod(metodo,tipos).invoke(ws, argumentos);
			System.out.println("[" + webService + "]->" + response);
			
		} catch (SecurityException e) {
			resultado = false;
			e.printStackTrace();
		} catch (MalformedURLException e) {
			resultado = false;
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			resultado = false;
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			resultado = false;
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			resultado = false;
			e.printStackTrace();
		} catch (InstantiationException e) {
			resultado = false;
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			resultado = false;
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			resultado = false;
			e.printStackTrace();
		}
		
		return resultado; 
	}
}
