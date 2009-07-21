//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.10.22 at 06:02:18 PM BRST 
//

package br.com.caelum.stella.nfe.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import net.vidageek.fluid.annotations.FluidName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TProtNFe", propOrder = { "infProt", "signature" })
@FluidName("ProtocoloDoResultadoDeProcessamento")
public class TProtNFe {

    @XmlElement(required = true)
    @FluidName("dadosDoProtocolo")
    protected InfProt infProt;

    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    @FluidName("signature")
    protected SignatureType signature;

    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @FluidName("versao")
    protected String versao;

    public InfProt getInfProt() {
        return infProt;
    }

    public void setInfProt(final InfProt value) {
        infProt = value;
    }

    public SignatureType getSignature() {
        return signature;
    }

    public void setSignature(final SignatureType value) {
        signature = value;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(final String value) {
        versao = value;
    }

}
