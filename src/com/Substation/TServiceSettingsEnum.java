//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.14 at 02:34:33 PM MSK 
//


package com.Substation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tServiceSettingsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tServiceSettingsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name">
 *     &lt;enumeration value="Dyn"/>
 *     &lt;enumeration value="Conf"/>
 *     &lt;enumeration value="Fix"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tServiceSettingsEnum")
@XmlEnum
public enum TServiceSettingsEnum {

    @XmlEnumValue("Dyn")
    DYN("Dyn"),
    @XmlEnumValue("Conf")
    CONF("Conf"),
    @XmlEnumValue("Fix")
    FIX("Fix");
    private final String value;

    TServiceSettingsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TServiceSettingsEnum fromValue(String v) {
        for (TServiceSettingsEnum c: TServiceSettingsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
