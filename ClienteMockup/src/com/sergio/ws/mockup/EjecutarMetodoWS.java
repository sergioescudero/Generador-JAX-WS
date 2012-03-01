
package com.sergio.ws.mockup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ejecutarMetodoWS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ejecutarMetodoWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parametro01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parametro02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejecutarMetodoWS", propOrder = {
    "sessionGuid",
    "parametro01",
    "parametro02"
})
public class EjecutarMetodoWS {

    protected String sessionGuid;
    protected String parametro01;
    protected String parametro02;

    /**
     * Gets the value of the sessionGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGuid() {
        return sessionGuid;
    }

    /**
     * Sets the value of the sessionGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGuid(String value) {
        this.sessionGuid = value;
    }

    /**
     * Gets the value of the parametro01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametro01() {
        return parametro01;
    }

    /**
     * Sets the value of the parametro01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametro01(String value) {
        this.parametro01 = value;
    }

    /**
     * Gets the value of the parametro02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametro02() {
        return parametro02;
    }

    /**
     * Sets the value of the parametro02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametro02(String value) {
        this.parametro02 = value;
    }

}
