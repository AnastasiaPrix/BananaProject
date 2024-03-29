//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.14 at 02:34:33 PM MSK 
//


package com.Substation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tLNodeContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tLNodeContainer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iec.ch/61850/2006/SCL}tNaming">
 *       &lt;sequence>
 *         &lt;element name="LNode" type="{http://www.iec.ch/61850/2006/SCL}tLNode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLNodeContainer", propOrder = {
    "lNode"
})
@XmlSeeAlso({
    TConnectivityNode.class,
    TPowerSystemResource.class
})
public abstract class TLNodeContainer
    extends TNaming
{

    @XmlElement(name = "LNode")
    protected List<TLNode> lNode;

    /**
     * Gets the value of the lNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLNode }
     * 
     * 
     */
    public List<TLNode> getLNode() {
        if (lNode == null) {
            lNode = new ArrayList<TLNode>();
        }
        return this.lNode;
    }

}
