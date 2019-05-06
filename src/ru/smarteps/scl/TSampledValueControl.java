//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.15 at 12:03:20 PM MSK 
//


package ru.smarteps.scl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for tSampledValueControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSampledValueControl">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iec.ch/61850/2006/SCL}tControlWithIEDName">
 *       &lt;sequence>
 *         &lt;element name="SmvOpts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.iec.ch/61850/2006/SCL}agSmvOpts"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="smvID" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="multicast" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="smpRate" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="nofASDU" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSampledValueControl", propOrder = {
    "smvOpts"
})
public class TSampledValueControl
    extends TControlWithIEDName
{

    @XmlElement(name = "SmvOpts", required = true)
    protected TSampledValueControl.SmvOpts smvOpts;
    @XmlAttribute(name = "smvID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String smvID;
    @XmlAttribute(name = "multicast")
    protected Boolean multicast;
    @XmlAttribute(name = "smpRate", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long smpRate;
    @XmlAttribute(name = "nofASDU", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long nofASDU;

    /**
     * Gets the value of the smvOpts property.
     * 
     * @return
     *     possible object is
     *     {@link TSampledValueControl.SmvOpts }
     *     
     */
    public TSampledValueControl.SmvOpts getSmvOpts() {
        return smvOpts;
    }

    /**
     * Sets the value of the smvOpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSampledValueControl.SmvOpts }
     *     
     */
    public void setSmvOpts(TSampledValueControl.SmvOpts value) {
        this.smvOpts = value;
    }

    /**
     * Gets the value of the smvID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmvID() {
        return smvID;
    }

    /**
     * Sets the value of the smvID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmvID(String value) {
        this.smvID = value;
    }

    /**
     * Gets the value of the multicast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMulticast() {
        if (multicast == null) {
            return true;
        } else {
            return multicast;
        }
    }

    /**
     * Sets the value of the multicast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMulticast(Boolean value) {
        this.multicast = value;
    }

    /**
     * Gets the value of the smpRate property.
     * 
     */
    public long getSmpRate() {
        return smpRate;
    }

    /**
     * Sets the value of the smpRate property.
     * 
     */
    public void setSmpRate(long value) {
        this.smpRate = value;
    }

    /**
     * Gets the value of the nofASDU property.
     * 
     */
    public long getNofASDU() {
        return nofASDU;
    }

    /**
     * Sets the value of the nofASDU property.
     * 
     */
    public void setNofASDU(long value) {
        this.nofASDU = value;
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
     *       &lt;attGroup ref="{http://www.iec.ch/61850/2006/SCL}agSmvOpts"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SmvOpts {

        @XmlAttribute(name = "refreshTime")
        protected Boolean refreshTime;
        @XmlAttribute(name = "sampleSynchronized")
        protected Boolean sampleSynchronized;
        @XmlAttribute(name = "sampleRate")
        protected Boolean sampleRate;
        @XmlAttribute(name = "dataSet")
        protected Boolean dataSet;
        @XmlAttribute(name = "security")
        protected Boolean security;

        /**
         * Gets the value of the refreshTime property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isRefreshTime() {
            if (refreshTime == null) {
                return false;
            } else {
                return refreshTime;
            }
        }

        /**
         * Sets the value of the refreshTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRefreshTime(Boolean value) {
            this.refreshTime = value;
        }

        /**
         * Gets the value of the sampleSynchronized property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isSampleSynchronized() {
            if (sampleSynchronized == null) {
                return true;
            } else {
                return sampleSynchronized;
            }
        }

        /**
         * Sets the value of the sampleSynchronized property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSampleSynchronized(Boolean value) {
            this.sampleSynchronized = value;
        }

        /**
         * Gets the value of the sampleRate property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isSampleRate() {
            if (sampleRate == null) {
                return false;
            } else {
                return sampleRate;
            }
        }

        /**
         * Sets the value of the sampleRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSampleRate(Boolean value) {
            this.sampleRate = value;
        }

        /**
         * Gets the value of the dataSet property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isDataSet() {
            if (dataSet == null) {
                return false;
            } else {
                return dataSet;
            }
        }

        /**
         * Sets the value of the dataSet property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDataSet(Boolean value) {
            this.dataSet = value;
        }

        /**
         * Gets the value of the security property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isSecurity() {
            if (security == null) {
                return false;
            } else {
                return security;
            }
        }

        /**
         * Sets the value of the security property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSecurity(Boolean value) {
            this.security = value;
        }

    }

}
