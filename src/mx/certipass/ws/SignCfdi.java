
package mx.certipass.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for signCfdi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="signCfdi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cfdiSignWrapper" type="{http://ws.certipass.mx/}cfdiSignWrapper"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signCfdi", propOrder = {
    "cfdiSignWrapper"
})
public class SignCfdi {

    @XmlElement(required = true)
    protected CfdiSignWrapper cfdiSignWrapper;

    /**
     * Gets the value of the cfdiSignWrapper property.
     * 
     * @return
     *     possible object is
     *     {@link CfdiSignWrapper }
     *     
     */
    public CfdiSignWrapper getCfdiSignWrapper() {
        return cfdiSignWrapper;
    }

    /**
     * Sets the value of the cfdiSignWrapper property.
     * 
     * @param value
     *     allowed object is
     *     {@link CfdiSignWrapper }
     *     
     */
    public void setCfdiSignWrapper(CfdiSignWrapper value) {
        this.cfdiSignWrapper = value;
    }

}
