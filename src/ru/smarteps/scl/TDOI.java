//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.15 at 12:03:20 PM MSK 
//


package ru.smarteps.scl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for tDOI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tDOI">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iec.ch/61850/2006/SCL}tUnNaming">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="SDI" type="{http://www.iec.ch/61850/2006/SCL}tSDI"/>
 *         &lt;element name="DAI" type="{http://www.iec.ch/61850/2006/SCL}tDAI"/>
 *       &lt;/choice>
 *       &lt;attribute name="name" use="required" type="{http://www.iec.ch/61850/2006/SCL}tRestrName1stU" />
 *       &lt;attribute name="ix" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="accessControl" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tDOI", propOrder = {
    "sdiOrDAI"
})
public class TDOI
    extends TUnNaming
{

    @XmlElements({
        @XmlElement(name = "SDI", type = TSDI.class),
        @XmlElement(name = "DAI", type = TDAI.class)
    })
    protected List<TUnNaming> sdiOrDAI;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "ix")
    @XmlSchemaType(name = "unsignedInt")
    protected Long ix;
    @XmlAttribute(name = "accessControl")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String accessControl;

    /**
     * Gets the value of the sdiOrDAI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdiOrDAI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSDIOrDAI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSDI }
     * {@link TDAI }
     * 
     * 
     */
    public List<TUnNaming> getSDIOrDAI() {
        if (sdiOrDAI == null) {
            sdiOrDAI = new ArrayList<TUnNaming>();
        }
        return this.sdiOrDAI;
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

    /**
     * Gets the value of the ix property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIx() {
        return ix;
    }

    /**
     * Sets the value of the ix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIx(Long value) {
        this.ix = value;
    }

    /**
     * Gets the value of the accessControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessControl() {
        return accessControl;
    }

    /**
     * Sets the value of the accessControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessControl(String value) {
        this.accessControl = value;
    }

}
