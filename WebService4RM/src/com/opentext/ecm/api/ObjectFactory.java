
package com.opentext.ecm.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.opentext.ecm.api package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OTAuthentication_QNAME = new QName("urn:api.ecm.opentext.com", "OTAuthentication");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.opentext.ecm.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OTAuthentication }
     * 
     */
    public OTAuthentication createOTAuthentication() {
        return new OTAuthentication();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTAuthentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:api.ecm.opentext.com", name = "OTAuthentication")
    public JAXBElement<OTAuthentication> createOTAuthentication(OTAuthentication value) {
        return new JAXBElement<OTAuthentication>(_OTAuthentication_QNAME, OTAuthentication.class, null, value);
    }

}
