//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.25 at 09:42:34 PM MDT 
//


package com.khubla.olmreader.olm.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="OPFContactEmailAddressAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OPFContactEmailAddressName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OPFContactEmailAddressType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "emailAddress")
public class EmailAddress {

    @XmlElement(name = "OPFContactEmailAddressAddress", required = true)
    protected String opfContactEmailAddressAddress;
    @XmlElement(name = "OPFContactEmailAddressName", required = true)
    protected String opfContactEmailAddressName;
    @XmlElement(name = "OPFContactEmailAddressType", required = true)
    protected BigInteger opfContactEmailAddressType;

    /**
     * Gets the value of the opfContactEmailAddressAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPFContactEmailAddressAddress() {
        return opfContactEmailAddressAddress;
    }

    /**
     * Sets the value of the opfContactEmailAddressAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPFContactEmailAddressAddress(String value) {
        this.opfContactEmailAddressAddress = value;
    }

    /**
     * Gets the value of the opfContactEmailAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPFContactEmailAddressName() {
        return opfContactEmailAddressName;
    }

    /**
     * Sets the value of the opfContactEmailAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPFContactEmailAddressName(String value) {
        this.opfContactEmailAddressName = value;
    }

    /**
     * Gets the value of the opfContactEmailAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOPFContactEmailAddressType() {
        return opfContactEmailAddressType;
    }

    /**
     * Sets the value of the opfContactEmailAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOPFContactEmailAddressType(BigInteger value) {
        this.opfContactEmailAddressType = value;
    }

}
