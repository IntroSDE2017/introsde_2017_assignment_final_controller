
package introsde.APP4.orchestrator.wsdl.app3user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for preference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="preference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="preferenceParks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="preferenceSheds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preference", propOrder = {
    "preferenceParks",
    "preferenceSheds"
})
public class Preference {

    protected Boolean preferenceParks;
    protected Boolean preferenceSheds;

    /**
     * Gets the value of the preferenceParks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferenceParks() {
        return preferenceParks;
    }

    /**
     * Sets the value of the preferenceParks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferenceParks(Boolean value) {
        this.preferenceParks = value;
    }

    /**
     * Gets the value of the preferenceSheds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferenceSheds() {
        return preferenceSheds;
    }

    /**
     * Sets the value of the preferenceSheds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferenceSheds(Boolean value) {
        this.preferenceSheds = value;
    }

}
