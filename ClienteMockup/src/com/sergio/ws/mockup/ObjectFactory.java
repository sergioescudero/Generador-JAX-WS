
package com.sergio.ws.mockup;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sergio.ws.mockup package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EjecutarMetodoWS_QNAME = new QName("http://ws.sergio.com/", "ejecutarMetodoWS");
    private final static QName _EjecutarMetodoWSResponse_QNAME = new QName("http://ws.sergio.com/", "ejecutarMetodoWSResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sergio.ws.mockup
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EjecutarMetodoWSResponse }
     * 
     */
    public EjecutarMetodoWSResponse createEjecutarMetodoWSResponse() {
        return new EjecutarMetodoWSResponse();
    }

    /**
     * Create an instance of {@link EjecutarMetodoWS }
     * 
     */
    public EjecutarMetodoWS createEjecutarMetodoWS() {
        return new EjecutarMetodoWS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutarMetodoWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sergio.com/", name = "ejecutarMetodoWS")
    public JAXBElement<EjecutarMetodoWS> createEjecutarMetodoWS(EjecutarMetodoWS value) {
        return new JAXBElement<EjecutarMetodoWS>(_EjecutarMetodoWS_QNAME, EjecutarMetodoWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutarMetodoWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sergio.com/", name = "ejecutarMetodoWSResponse")
    public JAXBElement<EjecutarMetodoWSResponse> createEjecutarMetodoWSResponse(EjecutarMetodoWSResponse value) {
        return new JAXBElement<EjecutarMetodoWSResponse>(_EjecutarMetodoWSResponse_QNAME, EjecutarMetodoWSResponse.class, null, value);
    }

}
