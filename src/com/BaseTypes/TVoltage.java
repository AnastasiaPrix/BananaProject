//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.14 at 02:35:42 PM MSK 
//


package com.BaseTypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tVoltage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tVoltage">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://www.iec.ch/61850/2006/SCL>tValueWithUnit">
 *       &lt;attribute name="unit" use="required" type="{http://www.iec.ch/61850/2006/SCL}tSIUnitEnum" fixed="V" />
 *       &lt;attribute name="multiplier" type="{http://www.iec.ch/61850/2006/SCL}tUnitMultiplierEnum" default="" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tVoltage")
public class TVoltage
    extends TValueWithUnit
{


}
