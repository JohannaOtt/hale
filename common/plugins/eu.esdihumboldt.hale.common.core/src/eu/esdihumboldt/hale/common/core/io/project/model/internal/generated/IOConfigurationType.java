//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.07 at 11:30:13 AM CET 
//


package eu.esdihumboldt.hale.common.core.io.project.model.internal.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IOConfigurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IOConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}AbstractSetting" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cache" type="{}ValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="action-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="provider-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IOConfigurationType", propOrder = {
    "abstractSetting",
    "cache"
})
public class IOConfigurationType {

    @XmlElementRef(name = "AbstractSetting", type = JAXBElement.class)
    protected List<JAXBElement<?>> abstractSetting;
    protected ValueType cache;
    @XmlAttribute(name = "action-id", required = true)
    protected String actionId;
    @XmlAttribute(name = "provider-id", required = true)
    protected String providerId;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the abstractSetting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractSetting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractSetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ComplexPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link PropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAbstractSetting() {
        if (abstractSetting == null) {
            abstractSetting = new ArrayList<JAXBElement<?>>();
        }
        return this.abstractSetting;
    }

    /**
     * Gets the value of the cache property.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getCache() {
        return cache;
    }

    /**
     * Sets the value of the cache property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setCache(ValueType value) {
        this.cache = value;
    }

    /**
     * Gets the value of the actionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionId() {
        return actionId;
    }

    /**
     * Sets the value of the actionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionId(String value) {
        this.actionId = value;
    }

    /**
     * Gets the value of the providerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * Sets the value of the providerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderId(String value) {
        this.providerId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
