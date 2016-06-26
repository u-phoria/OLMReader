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
 *         &lt;element name="OPFMessageCopyModDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OPFMessageCopySentTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OPFMessageGetCalendarAcceptStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OPFMessageGetHasRichText" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OPFMessageGetIsRead" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OPFMessageGetOverrideEncoding" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OPFMessageGetPriority" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="OPFMessageCopyGetFlagStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OPFMessageGetWasSent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OPFMessageIsCalendarMessage" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OPFMessageIsOutgoing" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OPFMessageIsOutgoingMeetingResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OPFMessageCopyMessageID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OPFMessageCopySenderAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OPFMessageGetHasHTML" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OPFMessageCopyBody" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OPFMessageCopyHTMLBody" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{}OPFMessageCopyCCAddresses"/&gt;
 *         &lt;element ref="{}OPFMessageCopyFromAddresses"/&gt;
 *         &lt;element ref="{}OPFMessageCopyAttachmentList"/&gt;
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
@XmlRootElement(name = "email")
public class Email {

    @XmlElement(name = "OPFMessageCopyModDate", required = true)
    protected String opfMessageCopyModDate;
    @XmlElement(name = "OPFMessageCopySentTime", required = true)
    protected String opfMessageCopySentTime;
    @XmlElement(name = "OPFMessageGetCalendarAcceptStatus", required = true)
    protected String opfMessageGetCalendarAcceptStatus;
    @XmlElement(name = "OPFMessageGetHasRichText")
    protected boolean opfMessageGetHasRichText;
    @XmlElement(name = "OPFMessageGetIsRead")
    protected boolean opfMessageGetIsRead;
    @XmlElement(name = "OPFMessageGetOverrideEncoding", required = true)
    protected String opfMessageGetOverrideEncoding;
    @XmlElement(name = "OPFMessageGetPriority", required = true)
    protected BigInteger opfMessageGetPriority;
    @XmlElement(name = "OPFMessageCopyGetFlagStatus", required = true)
    protected String opfMessageCopyGetFlagStatus;
    @XmlElement(name = "OPFMessageGetWasSent")
    protected boolean opfMessageGetWasSent;
    @XmlElement(name = "OPFMessageIsCalendarMessage")
    protected boolean opfMessageIsCalendarMessage;
    @XmlElement(name = "OPFMessageIsOutgoing")
    protected boolean opfMessageIsOutgoing;
    @XmlElement(name = "OPFMessageIsOutgoingMeetingResponse")
    protected boolean opfMessageIsOutgoingMeetingResponse;
    @XmlElement(name = "OPFMessageCopyMessageID", required = true)
    protected String opfMessageCopyMessageID;
    @XmlElement(name = "OPFMessageCopySenderAddress", required = true)
    protected String opfMessageCopySenderAddress;
    @XmlElement(name = "OPFMessageGetHasHTML")
    protected boolean opfMessageGetHasHTML;
    @XmlElement(name = "OPFMessageCopyBody", required = true)
    protected String opfMessageCopyBody;
    @XmlElement(name = "OPFMessageCopyHTMLBody", required = true)
    protected String opfMessageCopyHTMLBody;
    @XmlElement(name = "OPFMessageCopyCCAddresses", required = true)
    protected OPFMessageCopyCCAddresses opfMessageCopyCCAddresses;
    @XmlElement(name = "OPFMessageCopyFromAddresses", required = true)
    protected OPFMessageCopyFromAddresses opfMessageCopyFromAddresses;
    @XmlElement(name = "OPFMessageCopyAttachmentList", required = true)
    protected OPFMessageCopyAttachmentList opfMessageCopyAttachmentList;

    /**
     * Gets the value of the opfMessageCopyModDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPFMessageCopyModDate() {
        return opfMessageCopyModDate;
    }

    /**
     * Sets the value of the opfMessageCopyModDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPFMessageCopyModDate(String value) {
        this.opfMessageCopyModDate = value;
    }

    /**
     * Gets the value of the opfMessageCopySentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPFMessageCopySentTime() {
        return opfMessageCopySentTime;
    }

    /**
     * Sets the value of the opfMessageCopySentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPFMessageCopySentTime(String value) {
        this.opfMessageCopySentTime = value;
    }

    /**
     * Gets the value of the opfMessageGetCalendarAcceptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPFMessageGetCalendarAcceptStatus() {
        return opfMessageGetCalendarAcceptStatus;
    }

    /**
     * Sets the value of the opfMessageGetCalendarAcceptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPFMessageGetCalendarAcceptStatus(String value) {
        this.opfMessageGetCalendarAcceptStatus = value;
    }

    /**
     * Gets the value of the opfMessageGetHasRichText property.
     * 
     */
    public boolean isOPFMessageGetHasRichText() {
        return opfMessageGetHasRichText;
    }

    /**
     * Sets the value of the opfMessageGetHasRichText property.
     * 
     */
    public void setOPFMessageGetHasRichText(boolean value) {
        this.opfMessageGetHasRichText = value;
    }

    /**
     * Gets the value of the opfMessageGetIsRead property.
     * 
     */
    public boolean isOPFMessageGetIsRead() {
        return opfMessageGetIsRead;
    }

    /**
     * Sets the value of the opfMessageGetIsRead property.
     * 
     */
    public void setOPFMessageGetIsRead(boolean value) {
        this.opfMessageGetIsRead = value;
    }

    /**
     * Gets the value of the opfMessageGetOverrideEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPFMessageGetOverrideEncoding() {
        return opfMessageGetOverrideEncoding;
    }

    /**
     * Sets the value of the opfMessageGetOverrideEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPFMessageGetOverrideEncoding(String value) {
        this.opfMessageGetOverrideEncoding = value;
    }

    /**
     * Gets the value of the opfMessageGetPriority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOPFMessageGetPriority() {
        return opfMessageGetPriority;
    }

    /**
     * Sets the value of the opfMessageGetPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOPFMessageGetPriority(BigInteger value) {
        this.opfMessageGetPriority = value;
    }

    /**
     * Gets the value of the opfMessageCopyGetFlagStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPFMessageCopyGetFlagStatus() {
        return opfMessageCopyGetFlagStatus;
    }

    /**
     * Sets the value of the opfMessageCopyGetFlagStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPFMessageCopyGetFlagStatus(String value) {
        this.opfMessageCopyGetFlagStatus = value;
    }

    /**
     * Gets the value of the opfMessageGetWasSent property.
     * 
     */
    public boolean isOPFMessageGetWasSent() {
        return opfMessageGetWasSent;
    }

    /**
     * Sets the value of the opfMessageGetWasSent property.
     * 
     */
    public void setOPFMessageGetWasSent(boolean value) {
        this.opfMessageGetWasSent = value;
    }

    /**
     * Gets the value of the opfMessageIsCalendarMessage property.
     * 
     */
    public boolean isOPFMessageIsCalendarMessage() {
        return opfMessageIsCalendarMessage;
    }

    /**
     * Sets the value of the opfMessageIsCalendarMessage property.
     * 
     */
    public void setOPFMessageIsCalendarMessage(boolean value) {
        this.opfMessageIsCalendarMessage = value;
    }

    /**
     * Gets the value of the opfMessageIsOutgoing property.
     * 
     */
    public boolean isOPFMessageIsOutgoing() {
        return opfMessageIsOutgoing;
    }

    /**
     * Sets the value of the opfMessageIsOutgoing property.
     * 
     */
    public void setOPFMessageIsOutgoing(boolean value) {
        this.opfMessageIsOutgoing = value;
    }

    /**
     * Gets the value of the opfMessageIsOutgoingMeetingResponse property.
     * 
     */
    public boolean isOPFMessageIsOutgoingMeetingResponse() {
        return opfMessageIsOutgoingMeetingResponse;
    }

    /**
     * Sets the value of the opfMessageIsOutgoingMeetingResponse property.
     * 
     */
    public void setOPFMessageIsOutgoingMeetingResponse(boolean value) {
        this.opfMessageIsOutgoingMeetingResponse = value;
    }

    /**
     * Gets the value of the opfMessageCopyMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPFMessageCopyMessageID() {
        return opfMessageCopyMessageID;
    }

    /**
     * Sets the value of the opfMessageCopyMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPFMessageCopyMessageID(String value) {
        this.opfMessageCopyMessageID = value;
    }

    /**
     * Gets the value of the opfMessageCopySenderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPFMessageCopySenderAddress() {
        return opfMessageCopySenderAddress;
    }

    /**
     * Sets the value of the opfMessageCopySenderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPFMessageCopySenderAddress(String value) {
        this.opfMessageCopySenderAddress = value;
    }

    /**
     * Gets the value of the opfMessageGetHasHTML property.
     * 
     */
    public boolean isOPFMessageGetHasHTML() {
        return opfMessageGetHasHTML;
    }

    /**
     * Sets the value of the opfMessageGetHasHTML property.
     * 
     */
    public void setOPFMessageGetHasHTML(boolean value) {
        this.opfMessageGetHasHTML = value;
    }

    /**
     * Gets the value of the opfMessageCopyBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPFMessageCopyBody() {
        return opfMessageCopyBody;
    }

    /**
     * Sets the value of the opfMessageCopyBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPFMessageCopyBody(String value) {
        this.opfMessageCopyBody = value;
    }

    /**
     * Gets the value of the opfMessageCopyHTMLBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPFMessageCopyHTMLBody() {
        return opfMessageCopyHTMLBody;
    }

    /**
     * Sets the value of the opfMessageCopyHTMLBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPFMessageCopyHTMLBody(String value) {
        this.opfMessageCopyHTMLBody = value;
    }

    /**
     * Gets the value of the opfMessageCopyCCAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link OPFMessageCopyCCAddresses }
     *     
     */
    public OPFMessageCopyCCAddresses getOPFMessageCopyCCAddresses() {
        return opfMessageCopyCCAddresses;
    }

    /**
     * Sets the value of the opfMessageCopyCCAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPFMessageCopyCCAddresses }
     *     
     */
    public void setOPFMessageCopyCCAddresses(OPFMessageCopyCCAddresses value) {
        this.opfMessageCopyCCAddresses = value;
    }

    /**
     * Gets the value of the opfMessageCopyFromAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link OPFMessageCopyFromAddresses }
     *     
     */
    public OPFMessageCopyFromAddresses getOPFMessageCopyFromAddresses() {
        return opfMessageCopyFromAddresses;
    }

    /**
     * Sets the value of the opfMessageCopyFromAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPFMessageCopyFromAddresses }
     *     
     */
    public void setOPFMessageCopyFromAddresses(OPFMessageCopyFromAddresses value) {
        this.opfMessageCopyFromAddresses = value;
    }

    /**
     * Gets the value of the opfMessageCopyAttachmentList property.
     * 
     * @return
     *     possible object is
     *     {@link OPFMessageCopyAttachmentList }
     *     
     */
    public OPFMessageCopyAttachmentList getOPFMessageCopyAttachmentList() {
        return opfMessageCopyAttachmentList;
    }

    /**
     * Sets the value of the opfMessageCopyAttachmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPFMessageCopyAttachmentList }
     *     
     */
    public void setOPFMessageCopyAttachmentList(OPFMessageCopyAttachmentList value) {
        this.opfMessageCopyAttachmentList = value;
    }

}
