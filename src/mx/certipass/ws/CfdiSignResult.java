
package mx.certipass.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CfdiSignResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CfdiSignResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.certipass.mx/}GenericResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="signedXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CfdiSignResult", propOrder = {
    "signedXml",
    "uuid"
})
public class CfdiSignResult
    extends GenericResult
{

    protected String signedXml;
    protected String uuid;

    /**
     * Gets the value of the signedXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedXml() {
        return signedXml;
    }

    /**
     * Sets the value of the signedXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedXml(String value) {
        this.signedXml = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
