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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for tAnyLN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tAnyLN">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iec.ch/61850/2006/SCL}tUnNaming">
 *       &lt;sequence>
 *         &lt;element name="DataSet" type="{http://www.iec.ch/61850/2006/SCL}tDataSet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReportControl" type="{http://www.iec.ch/61850/2006/SCL}tReportControl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LogControl" type="{http://www.iec.ch/61850/2006/SCL}tLogControl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DOI" type="{http://www.iec.ch/61850/2006/SCL}tDOI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Inputs" type="{http://www.iec.ch/61850/2006/SCL}tInputs" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lnType" use="required" type="{http://www.iec.ch/61850/2006/SCL}tName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAnyLN", propOrder = {
    "dataSet",
    "reportControl",
    "logControl",
    "doi",
    "inputs"
})
@XmlSeeAlso({
    TLN.class,
    TLN0 .class
})
public abstract class TAnyLN
    extends TUnNaming
{

    @XmlElement(name = "DataSet")
    protected List<TDataSet> dataSet;
    @XmlElement(name = "ReportControl")
    protected List<TReportControl> reportControl;
    @XmlElement(name = "LogControl")
    protected List<TLogControl> logControl;
    @XmlElement(name = "DOI")
    protected List<TDOI> doi;
    @XmlElement(name = "Inputs")
    protected TInputs inputs;
    @XmlAttribute(name = "lnType", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lnType;

    /**
     * Gets the value of the dataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDataSet }
     * 
     * 
     */
    public List<TDataSet> getDataSet() {
        if (dataSet == null) {
            dataSet = new ArrayList<TDataSet>();
        }
        return this.dataSet;
    }

    /**
     * Gets the value of the reportControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TReportControl }
     * 
     * 
     */
    public List<TReportControl> getReportControl() {
        if (reportControl == null) {
            reportControl = new ArrayList<TReportControl>();
        }
        return this.reportControl;
    }

    /**
     * Gets the value of the logControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLogControl }
     * 
     * 
     */
    public List<TLogControl> getLogControl() {
        if (logControl == null) {
            logControl = new ArrayList<TLogControl>();
        }
        return this.logControl;
    }

    /**
     * Gets the value of the doi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDOI }
     * 
     * 
     */
    public List<TDOI> getDOI() {
        if (doi == null) {
            doi = new ArrayList<TDOI>();
        }
        return this.doi;
    }

    /**
     * Gets the value of the inputs property.
     * 
     * @return
     *     possible object is
     *     {@link TInputs }
     *     
     */
    public TInputs getInputs() {
        return inputs;
    }

    /**
     * Sets the value of the inputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInputs }
     *     
     */
    public void setInputs(TInputs value) {
        this.inputs = value;
    }

    /**
     * Gets the value of the lnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnType() {
        return lnType;
    }

    /**
     * Sets the value of the lnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnType(String value) {
        this.lnType = value;
    }

}
