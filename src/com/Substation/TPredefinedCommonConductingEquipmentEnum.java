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
 * <p>Java class for tPredefinedCommonConductingEquipmentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tPredefinedCommonConductingEquipmentEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name">
 *     &lt;enumeration value="CBR"/>
 *     &lt;enumeration value="DIS"/>
 *     &lt;enumeration value="VTR"/>
 *     &lt;enumeration value="CTR"/>
 *     &lt;enumeration value="GEN"/>
 *     &lt;enumeration value="CAP"/>
 *     &lt;enumeration value="REA"/>
 *     &lt;enumeration value="CON"/>
 *     &lt;enumeration value="MOT"/>
 *     &lt;enumeration value="EFN"/>
 *     &lt;enumeration value="PSH"/>
 *     &lt;enumeration value="BAT"/>
 *     &lt;enumeration value="BSH"/>
 *     &lt;enumeration value="CAB"/>
 *     &lt;enumeration value="GIL"/>
 *     &lt;enumeration value="LIN"/>
 *     &lt;enumeration value="RRC"/>
 *     &lt;enumeration value="SAR"/>
 *     &lt;enumeration value="TCF"/>
 *     &lt;enumeration value="TCR"/>
 *     &lt;enumeration value="IFL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tPredefinedCommonConductingEquipmentEnum")
@XmlEnum
public enum TPredefinedCommonConductingEquipmentEnum {

    CBR,
    DIS,
    VTR,
    CTR,
    GEN,
    CAP,
    REA,
    CON,
    MOT,
    EFN,
    PSH,
    BAT,
    BSH,
    CAB,
    GIL,
    LIN,
    RRC,
    SAR,
    TCF,
    TCR,
    IFL;

    public String value() {
        return name();
    }

    public static TPredefinedCommonConductingEquipmentEnum fromValue(String v) {
        return valueOf(v);
    }

}
