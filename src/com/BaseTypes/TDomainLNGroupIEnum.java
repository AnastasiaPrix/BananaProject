//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.14 at 02:35:42 PM MSK 
//


package com.BaseTypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tDomainLNGroupIEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tDomainLNGroupIEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name">
 *     &lt;pattern value="I[A-Z]*"/>
 *     &lt;enumeration value="IHMI"/>
 *     &lt;enumeration value="IARC"/>
 *     &lt;enumeration value="ITCI"/>
 *     &lt;enumeration value="ITMI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tDomainLNGroupIEnum")
@XmlEnum
public enum TDomainLNGroupIEnum {

    IHMI,
    IARC,
    ITCI,
    ITMI;

    public String value() {
        return name();
    }

    public static TDomainLNGroupIEnum fromValue(String v) {
        return valueOf(v);
    }

}
