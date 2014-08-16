//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.15 at 08:44:39 PM EDT 
//


package org.sierraecg.schema.jaxb._1_04;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataencoding" use="required" type="{http://www3.medical.philips.com}TYPEdataencoding" />
 *       &lt;attribute name="compression" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numberofleads" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="leadlabels" use="required" type="{http://www3.medical.philips.com}TYPElistofleadname" />
 *       &lt;attribute name="durationperchannel" use="required" type="{http://www3.medical.philips.com}TYPEduration" />
 *       &lt;attribute name="samplespersecond" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="resolution" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="signaloffset" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="signalsigned" use="required" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="bitspersample" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="hipass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="lowpass" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="notchfiltered" use="required" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="notchfilterfreqs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="artfiltered" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="waveformmodified" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="modifiedby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="upsampled" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="upsamplemethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="downsampled" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="downsamplemethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "unparsedwaveforms")
public class Unparsedwaveforms {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "href", required = true)
    protected String href;
    @XmlAttribute(name = "dataencoding", required = true)
    protected TYPEdataencoding dataencoding;
    @XmlAttribute(name = "compression")
    protected String compression;
    @XmlAttribute(name = "numberofleads", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberofleads;
    @XmlAttribute(name = "leadlabels", required = true)
    protected List<String> leadlabels;
    @XmlAttribute(name = "durationperchannel", required = true)
    protected String durationperchannel;
    @XmlAttribute(name = "samplespersecond", required = true)
    protected float samplespersecond;
    @XmlAttribute(name = "resolution", required = true)
    protected float resolution;
    @XmlAttribute(name = "signaloffset")
    protected BigInteger signaloffset;
    @XmlAttribute(name = "signalsigned", required = true)
    protected TYPEflag signalsigned;
    @XmlAttribute(name = "bitspersample", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger bitspersample;
    @XmlAttribute(name = "hipass", required = true)
    protected float hipass;
    @XmlAttribute(name = "lowpass", required = true)
    protected BigInteger lowpass;
    @XmlAttribute(name = "notchfiltered", required = true)
    protected TYPEflag notchfiltered;
    @XmlAttribute(name = "notchfilterfreqs")
    protected String notchfilterfreqs;
    @XmlAttribute(name = "artfiltered")
    protected TYPEflag artfiltered;
    @XmlAttribute(name = "waveformmodified")
    protected TYPEflag waveformmodified;
    @XmlAttribute(name = "modifiedby")
    protected String modifiedby;
    @XmlAttribute(name = "upsampled")
    protected TYPEflag upsampled;
    @XmlAttribute(name = "upsamplemethod")
    protected String upsamplemethod;
    @XmlAttribute(name = "downsampled")
    protected TYPEflag downsampled;
    @XmlAttribute(name = "downsamplemethod")
    protected String downsamplemethod;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the dataencoding property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEdataencoding }
     *     
     */
    public TYPEdataencoding getDataencoding() {
        return dataencoding;
    }

    /**
     * Sets the value of the dataencoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEdataencoding }
     *     
     */
    public void setDataencoding(TYPEdataencoding value) {
        this.dataencoding = value;
    }

    /**
     * Gets the value of the compression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompression() {
        return compression;
    }

    /**
     * Sets the value of the compression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompression(String value) {
        this.compression = value;
    }

    /**
     * Gets the value of the numberofleads property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberofleads() {
        return numberofleads;
    }

    /**
     * Sets the value of the numberofleads property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberofleads(BigInteger value) {
        this.numberofleads = value;
    }

    /**
     * Gets the value of the leadlabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leadlabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeadlabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLeadlabels() {
        if (leadlabels == null) {
            leadlabels = new ArrayList<String>();
        }
        return this.leadlabels;
    }

    /**
     * Gets the value of the durationperchannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationperchannel() {
        return durationperchannel;
    }

    /**
     * Sets the value of the durationperchannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationperchannel(String value) {
        this.durationperchannel = value;
    }

    /**
     * Gets the value of the samplespersecond property.
     * 
     */
    public float getSamplespersecond() {
        return samplespersecond;
    }

    /**
     * Sets the value of the samplespersecond property.
     * 
     */
    public void setSamplespersecond(float value) {
        this.samplespersecond = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     */
    public float getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     */
    public void setResolution(float value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the signaloffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSignaloffset() {
        return signaloffset;
    }

    /**
     * Sets the value of the signaloffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSignaloffset(BigInteger value) {
        this.signaloffset = value;
    }

    /**
     * Gets the value of the signalsigned property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getSignalsigned() {
        return signalsigned;
    }

    /**
     * Sets the value of the signalsigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setSignalsigned(TYPEflag value) {
        this.signalsigned = value;
    }

    /**
     * Gets the value of the bitspersample property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBitspersample() {
        return bitspersample;
    }

    /**
     * Sets the value of the bitspersample property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBitspersample(BigInteger value) {
        this.bitspersample = value;
    }

    /**
     * Gets the value of the hipass property.
     * 
     */
    public float getHipass() {
        return hipass;
    }

    /**
     * Sets the value of the hipass property.
     * 
     */
    public void setHipass(float value) {
        this.hipass = value;
    }

    /**
     * Gets the value of the lowpass property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLowpass() {
        return lowpass;
    }

    /**
     * Sets the value of the lowpass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLowpass(BigInteger value) {
        this.lowpass = value;
    }

    /**
     * Gets the value of the notchfiltered property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getNotchfiltered() {
        return notchfiltered;
    }

    /**
     * Sets the value of the notchfiltered property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setNotchfiltered(TYPEflag value) {
        this.notchfiltered = value;
    }

    /**
     * Gets the value of the notchfilterfreqs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotchfilterfreqs() {
        return notchfilterfreqs;
    }

    /**
     * Sets the value of the notchfilterfreqs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotchfilterfreqs(String value) {
        this.notchfilterfreqs = value;
    }

    /**
     * Gets the value of the artfiltered property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getArtfiltered() {
        return artfiltered;
    }

    /**
     * Sets the value of the artfiltered property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setArtfiltered(TYPEflag value) {
        this.artfiltered = value;
    }

    /**
     * Gets the value of the waveformmodified property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getWaveformmodified() {
        return waveformmodified;
    }

    /**
     * Sets the value of the waveformmodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setWaveformmodified(TYPEflag value) {
        this.waveformmodified = value;
    }

    /**
     * Gets the value of the modifiedby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedby() {
        return modifiedby;
    }

    /**
     * Sets the value of the modifiedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedby(String value) {
        this.modifiedby = value;
    }

    /**
     * Gets the value of the upsampled property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getUpsampled() {
        return upsampled;
    }

    /**
     * Sets the value of the upsampled property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setUpsampled(TYPEflag value) {
        this.upsampled = value;
    }

    /**
     * Gets the value of the upsamplemethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpsamplemethod() {
        return upsamplemethod;
    }

    /**
     * Sets the value of the upsamplemethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpsamplemethod(String value) {
        this.upsamplemethod = value;
    }

    /**
     * Gets the value of the downsampled property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getDownsampled() {
        return downsampled;
    }

    /**
     * Sets the value of the downsampled property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setDownsampled(TYPEflag value) {
        this.downsampled = value;
    }

    /**
     * Gets the value of the downsamplemethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownsamplemethod() {
        return downsamplemethod;
    }

    /**
     * Sets the value of the downsamplemethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownsamplemethod(String value) {
        this.downsamplemethod = value;
    }

}