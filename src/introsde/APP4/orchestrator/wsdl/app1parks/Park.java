
package introsde.APP4.orchestrator.wsdl.app1parks;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for park complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="park">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="altreInformazioni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comuni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elencoUfficiale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gestore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="indirizzo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provincie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provvedimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="superficie" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "park", propOrder = {
    "altreInformazioni",
    "comuni",
    "elencoUfficiale",
    "email",
    "gestore",
    "id",
    "indirizzo",
    "nome",
    "parco",
    "provincie",
    "provvedimento",
    "superficie"
})
public class Park {

    protected String altreInformazioni;
    protected String comuni;
    protected String elencoUfficiale;
    protected String email;
    protected String gestore;
    protected Integer id;
    protected String indirizzo;
    protected String nome;
    protected String parco;
    protected String provincie;
    protected String provvedimento;
    protected Float superficie;

    /**
     * Gets the value of the altreInformazioni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltreInformazioni() {
        return altreInformazioni;
    }

    /**
     * Sets the value of the altreInformazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltreInformazioni(String value) {
        this.altreInformazioni = value;
    }

    /**
     * Gets the value of the comuni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComuni() {
        return comuni;
    }

    /**
     * Sets the value of the comuni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComuni(String value) {
        this.comuni = value;
    }

    /**
     * Gets the value of the elencoUfficiale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElencoUfficiale() {
        return elencoUfficiale;
    }

    /**
     * Sets the value of the elencoUfficiale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElencoUfficiale(String value) {
        this.elencoUfficiale = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the gestore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGestore() {
        return gestore;
    }

    /**
     * Sets the value of the gestore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGestore(String value) {
        this.gestore = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the indirizzo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * Sets the value of the indirizzo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirizzo(String value) {
        this.indirizzo = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the parco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParco() {
        return parco;
    }

    /**
     * Sets the value of the parco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParco(String value) {
        this.parco = value;
    }

    /**
     * Gets the value of the provincie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincie() {
        return provincie;
    }

    /**
     * Sets the value of the provincie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincie(String value) {
        this.provincie = value;
    }

    /**
     * Gets the value of the provvedimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvvedimento() {
        return provvedimento;
    }

    /**
     * Sets the value of the provvedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvvedimento(String value) {
        this.provvedimento = value;
    }

    /**
     * Gets the value of the superficie property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSuperficie() {
        return superficie;
    }

    /**
     * Sets the value of the superficie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSuperficie(Float value) {
        this.superficie = value;
    }

}
