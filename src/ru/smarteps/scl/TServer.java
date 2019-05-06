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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tServer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iec.ch/61850/2006/SCL}tUnNaming">
 *       &lt;sequence>
 *         &lt;element name="Authentication">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.iec.ch/61850/2006/SCL}agAuthentication"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LDevice" type="{http://www.iec.ch/61850/2006/SCL}tLDevice" maxOccurs="unbounded"/>
 *         &lt;element name="Association" type="{http://www.iec.ch/61850/2006/SCL}tAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="timeout" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="30" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tServer", propOrder = {
    "authentication",
    "lDevice",
    "association"
})
public class TServer
    extends TUnNaming
{

    @XmlElement(name = "Authentication", required = true)
    protected TServer.Authentication authentication;
    @XmlElement(name = "LDevice", required = true)
    protected List<TLDevice> lDevice;
    @XmlElement(name = "Association")
    protected List<TAssociation> association;
    @XmlAttribute(name = "timeout")
    @XmlSchemaType(name = "unsignedInt")
    protected Long timeout;

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link TServer.Authentication }
     *     
     */
    public TServer.Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link TServer.Authentication }
     *     
     */
    public void setAuthentication(TServer.Authentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the lDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLDevice }
     * 
     * 
     */
    public List<TLDevice> getLDevice() {
        if (lDevice == null) {
            lDevice = new ArrayList<TLDevice>();
        }
        return this.lDevice;
    }

    /**
     * Gets the value of the association property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the association property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAssociation }
     * 
     * 
     */
    public List<TAssociation> getAssociation() {
        if (association == null) {
            association = new ArrayList<TAssociation>();
        }
        return this.association;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getTimeout() {
        if (timeout == null) {
            return  30L;
        } else {
            return timeout;
        }
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeout(Long value) {
        this.timeout = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.iec.ch/61850/2006/SCL}agAuthentication"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Authentication {

        @XmlAttribute(name = "none")
        protected Boolean none;
        @XmlAttribute(name = "password")
        protected Boolean password;
        @XmlAttribute(name = "weak")
        protected Boolean weak;
        @XmlAttribute(name = "strong")
        protected Boolean strong;
        @XmlAttribute(name = "certificate")
        protected Boolean certificate;

        /**
         * Gets the value of the none property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isNone() {
            if (none == null) {
                return true;
            } else {
                return none;
            }
        }

        /**
         * Sets the value of the none property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNone(Boolean value) {
            this.none = value;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isPassword() {
            if (password == null) {
                return false;
            } else {
                return password;
            }
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPassword(Boolean value) {
            this.password = value;
        }

        /**
         * Gets the value of the weak property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isWeak() {
            if (weak == null) {
                return false;
            } else {
                return weak;
            }
        }

        /**
         * Sets the value of the weak property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWeak(Boolean value) {
            this.weak = value;
        }

        /**
         * Gets the value of the strong property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isStrong() {
            if (strong == null) {
                return false;
            } else {
                return strong;
            }
        }

        /**
         * Sets the value of the strong property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setStrong(Boolean value) {
            this.strong = value;
        }

        /**
         * Gets the value of the certificate property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isCertificate() {
            if (certificate == null) {
                return false;
            } else {
                return certificate;
            }
        }

        /**
         * Sets the value of the certificate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCertificate(Boolean value) {
            this.certificate = value;
        }

    }

}
