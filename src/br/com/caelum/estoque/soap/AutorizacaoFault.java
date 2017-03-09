
package br.com.caelum.estoque.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutorizacaoFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutorizacaoFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faultImpo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutorizacaoFault", propOrder = {
    "faultImpo",
    "message"
})
public class AutorizacaoFault {

    protected String faultImpo;
    protected String message;

    /**
     * Gets the value of the faultImpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultImpo() {
        return faultImpo;
    }

    /**
     * Sets the value of the faultImpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultImpo(String value) {
        this.faultImpo = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
