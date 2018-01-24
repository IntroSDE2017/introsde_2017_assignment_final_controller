
package introsde.APP4.orchestrator.wsdl.app2shed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anno" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="comune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuccette" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="invernale" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="letti" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="localita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quota" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="regione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settore_alpino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tavolato" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="tipologia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="web" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shed", propOrder = {
    "anno",
    "comune",
    "cuccette",
    "id",
    "invernale",
    "letti",
    "localita",
    "nome",
    "quota",
    "regione",
    "settoreAlpino",
    "tavolato",
    "tipologia",
    "web"
})
public class Shed {

    protected Float anno;
    protected String comune;
    protected Float cuccette;
    protected Integer id;
    protected Float invernale;
    protected Float letti;
    protected String localita;
    protected String nome;
    protected Float quota;
    protected String regione;
    @XmlElement(name = "settore_alpino")
    protected String settoreAlpino;
    protected Float tavolato;
    protected String tipologia;
    protected String web;

    /**
     * Gets the value of the anno property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAnno() {
        return anno;
    }

    /**
     * Sets the value of the anno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAnno(Float value) {
        this.anno = value;
    }

    /**
     * Gets the value of the comune property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComune() {
        return comune;
    }

    /**
     * Sets the value of the comune property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComune(String value) {
        this.comune = value;
    }

    /**
     * Gets the value of the cuccette property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCuccette() {
        return cuccette;
    }

    /**
     * Sets the value of the cuccette property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCuccette(Float value) {
        this.cuccette = value;
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
     * Gets the value of the invernale property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInvernale() {
        return invernale;
    }

    /**
     * Sets the value of the invernale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInvernale(Float value) {
        this.invernale = value;
    }

    /**
     * Gets the value of the letti property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLetti() {
        return letti;
    }

    /**
     * Sets the value of the letti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLetti(Float value) {
        this.letti = value;
    }

    /**
     * Gets the value of the localita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalita() {
        return localita;
    }

    /**
     * Sets the value of the localita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalita(String value) {
        this.localita = value;
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
     * Gets the value of the quota property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQuota() {
        return quota;
    }

    /**
     * Sets the value of the quota property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQuota(Float value) {
        this.quota = value;
    }

    /**
     * Gets the value of the regione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegione() {
        return regione;
    }

    /**
     * Sets the value of the regione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegione(String value) {
        this.regione = value;
    }

    /**
     * Gets the value of the settoreAlpino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettoreAlpino() {
        return settoreAlpino;
    }

    /**
     * Sets the value of the settoreAlpino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettoreAlpino(String value) {
        this.settoreAlpino = value;
    }

    /**
     * Gets the value of the tavolato property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTavolato() {
        return tavolato;
    }

    /**
     * Sets the value of the tavolato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTavolato(Float value) {
        this.tavolato = value;
    }

    /**
     * Gets the value of the tipologia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipologia() {
        return tipologia;
    }

    /**
     * Sets the value of the tipologia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipologia(String value) {
        this.tipologia = value;
    }

    /**
     * Gets the value of the web property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeb() {
        return web;
    }

    /**
     * Sets the value of the web property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeb(String value) {
        this.web = value;
    }

}
