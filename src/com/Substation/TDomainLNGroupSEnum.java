//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.14 at 02:34:33 PM MSK 
//


package com.Substation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tDomainLNGroupSEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tDomainLNGroupSEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name">
 *     &lt;pattern value="S[A-Z]*"/>
 *     &lt;enumeration value="SARC"/>
 *     &lt;enumeration value="SIMG"/>
 *     &lt;enumeration value="SIML"/>
 *     &lt;enumeration value="SPDC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tDomainLNGroupSEnum")
@XmlEnum
public enum TDomainLNGroupSEnum {

    SARC,
    SIMG,
    SIML,
    SPDC;

    public String value() {
        return name();
    }

    public static TDomainLNGroupSEnum fromValue(String v) {
        return valueOf(v);
    }

}
