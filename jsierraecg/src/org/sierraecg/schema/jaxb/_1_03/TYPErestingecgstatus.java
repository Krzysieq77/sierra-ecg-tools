//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.15 at 08:44:37 PM EDT 
//


package org.sierraecg.schema.jaxb._1_03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TYPErestingecgstatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TYPErestingecgstatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Not yet determined"/>
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="Await review"/>
 *     &lt;enumeration value="Await confirm"/>
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="Unconfirmed"/>
 *     &lt;enumeration value="Archived"/>
 *     &lt;enumeration value="Deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TYPErestingecgstatus")
@XmlEnum
public enum TYPErestingecgstatus {

    @XmlEnumValue("Not yet determined")
    NOT_YET_DETERMINED("Not yet determined"),
    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Await review")
    AWAIT_REVIEW("Await review"),
    @XmlEnumValue("Await confirm")
    AWAIT_CONFIRM("Await confirm"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("Unconfirmed")
    UNCONFIRMED("Unconfirmed"),
    @XmlEnumValue("Archived")
    ARCHIVED("Archived"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    TYPErestingecgstatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TYPErestingecgstatus fromValue(String v) {
        for (TYPErestingecgstatus c: TYPErestingecgstatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}