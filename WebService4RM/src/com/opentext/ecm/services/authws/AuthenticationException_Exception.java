
package com.opentext.ecm.services.authws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "AuthenticationException", targetNamespace = "urn:api.ecm.opentext.com")
public class AuthenticationException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private AuthenticationException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public AuthenticationException_Exception(String message, AuthenticationException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public AuthenticationException_Exception(String message, AuthenticationException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.opentext.ecm.services.authws.AuthenticationException
     */
    public AuthenticationException getFaultInfo() {
        return faultInfo;
    }

}
