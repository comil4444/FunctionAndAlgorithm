package com.opentext.livelink.service.util;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SOAPHeaderCWSHandler implements SOAPHandler<SOAPMessageContext> {

    private final String authenticatedToken;

    public SOAPHeaderCWSHandler(String authenticatedToken) {
        this.authenticatedToken = authenticatedToken;
    }

    public boolean handleMessage(SOAPMessageContext context) {
        Boolean outboundProperty =
                (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outboundProperty.booleanValue()) {
            try {
            	//context.setMessage(MessageFactory.newInstance().createMessage());
                SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
                SOAPFactory factory = SOAPFactory.newInstance();
                String prefix = "urn";
                String uri = "urn:api.ecm.opentext.com";
                SOAPElement securityElem =
                        factory.createElement("OTAuthentication", prefix, uri);
                SOAPElement tokenElem =
                        factory.createElement("AuthenticationToken", prefix, uri);
                tokenElem.addTextNode(authenticatedToken);
                securityElem.addChildElement(tokenElem);
                //SOAPHeader header = envelope.addHeader();
                SOAPHeader header = envelope.getHeader();
                header.addChildElement(securityElem);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            // inbound
        }
        return true;
    }

    public Set<QName> getHeaders() {
        return new TreeSet();
    }

    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    public void close(MessageContext context) {
        //
    }
}