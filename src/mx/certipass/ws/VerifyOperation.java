
package mx.certipass.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verifyOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verifyOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="verifyOperationWrapper" type="{http://ws.certipass.mx/}verifyOperationWrapper"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyOperation", propOrder = {
    "verifyOperationWrapper"
})
public class VerifyOperation {

    @XmlElement(required = true)
    protected VerifyOperationWrapper verifyOperationWrapper;

    /**
     * Gets the value of the verifyOperationWrapper property.
     * 
     * @return
     *     possible object is
     *     {@link VerifyOperationWrapper }
     *     
     */
    public VerifyOperationWrapper getVerifyOperationWrapper() {
        return verifyOperationWrapper;
    }

    /**
     * Sets the value of the verifyOperationWrapper property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyOperationWrapper }
     *     
     */
    public void setVerifyOperationWrapper(VerifyOperationWrapper value) {
        this.verifyOperationWrapper = value;
    }

}
