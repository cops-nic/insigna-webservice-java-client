
package mx.certipass.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validateCfdi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validateCfdi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validateCfdiWrapper" type="{http://ws.certipass.mx/}validateCfdiWrapper"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateCfdi", propOrder = {
    "validateCfdiWrapper"
})
public class ValidateCfdi {

    @XmlElement(required = true)
    protected ValidateCfdiWrapper validateCfdiWrapper;

    /**
     * Gets the value of the validateCfdiWrapper property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateCfdiWrapper }
     *     
     */
    public ValidateCfdiWrapper getValidateCfdiWrapper() {
        return validateCfdiWrapper;
    }

    /**
     * Sets the value of the validateCfdiWrapper property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateCfdiWrapper }
     *     
     */
    public void setValidateCfdiWrapper(ValidateCfdiWrapper value) {
        this.validateCfdiWrapper = value;
    }

}
