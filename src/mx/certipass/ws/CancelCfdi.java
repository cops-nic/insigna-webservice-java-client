
package mx.certipass.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cancelCfdi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancelCfdi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cfdiCancelWrapper" type="{http://ws.certipass.mx/}cfdiCancelWrapper"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelCfdi", propOrder = {
    "cfdiCancelWrapper"
})
public class CancelCfdi {

    @XmlElement(required = true)
    protected CfdiCancelWrapper cfdiCancelWrapper;

    /**
     * Gets the value of the cfdiCancelWrapper property.
     * 
     * @return
     *     possible object is
     *     {@link CfdiCancelWrapper }
     *     
     */
    public CfdiCancelWrapper getCfdiCancelWrapper() {
        return cfdiCancelWrapper;
    }

    /**
     * Sets the value of the cfdiCancelWrapper property.
     * 
     * @param value
     *     allowed object is
     *     {@link CfdiCancelWrapper }
     *     
     */
    public void setCfdiCancelWrapper(CfdiCancelWrapper value) {
        this.cfdiCancelWrapper = value;
    }

}
