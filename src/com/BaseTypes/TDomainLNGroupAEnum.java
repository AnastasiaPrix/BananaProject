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
 * <p>Java class for tDomainLNGroupAEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tDomainLNGroupAEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name">
 *     &lt;pattern value="A[A-Z]*"/>
 *     &lt;enumeration value="ANCR"/>
 *     &lt;enumeration value="ARCO"/>
 *     &lt;enumeration value="ATCC"/>
 *     &lt;enumeration value="AVCO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tDomainLNGroupAEnum")
@XmlEnum
public enum TDomainLNGroupAEnum {

    ANCR,
    ARCO,
    ATCC,
    AVCO;

    public String value() {
        return name();
    }

    public static TDomainLNGroupAEnum fromValue(String v) {
        return valueOf(v);
    }

}
