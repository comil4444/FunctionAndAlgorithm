
package com.opentext.livelink.service.core;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Authentication", targetNamespace = "urn:Core.service.livelink.opentext.com")
@XmlSeeAlso({
    com.opentext.livelink.service.core.ObjectFactory.class,
    com.opentext.ecm.api.ObjectFactory.class
})
public interface Authentication {


    /**
     * 
     * @param applicationID
     * @param password
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "AuthenticateApplication", action = "urn:Core.service.livelink.opentext.com/AuthenticateApplication")
    @WebResult(name = "AuthenticateApplicationResult", targetNamespace = "urn:Core.service.livelink.opentext.com")
    @RequestWrapper(localName = "AuthenticateApplication", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.AuthenticateApplication")
    @ResponseWrapper(localName = "AuthenticateApplicationResponse", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.AuthenticateApplicationResponse")
    public String authenticateApplication(
        @WebParam(name = "applicationID", targetNamespace = "urn:Core.service.livelink.opentext.com")
        String applicationID,
        @WebParam(name = "password", targetNamespace = "urn:Core.service.livelink.opentext.com")
        String password);

    /**
     * 
     * @param userPassword
     * @param userName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "AuthenticateUser", action = "urn:Core.service.livelink.opentext.com/AuthenticateUser")
    @WebResult(name = "AuthenticateUserResult", targetNamespace = "urn:Core.service.livelink.opentext.com")
    @RequestWrapper(localName = "AuthenticateUser", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.AuthenticateUser")
    @ResponseWrapper(localName = "AuthenticateUserResponse", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.AuthenticateUserResponse")
    public String authenticateUser(
        @WebParam(name = "userName", targetNamespace = "urn:Core.service.livelink.opentext.com")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "urn:Core.service.livelink.opentext.com")
        String userPassword);

    /**
     * 
     * @param applicationToken
     * @param userPassword
     * @param userName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "AuthenticateUserWithApplicationToken", action = "urn:Core.service.livelink.opentext.com/AuthenticateUserWithApplicationToken")
    @WebResult(name = "AuthenticateUserWithApplicationTokenResult", targetNamespace = "urn:Core.service.livelink.opentext.com")
    @RequestWrapper(localName = "AuthenticateUserWithApplicationToken", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.AuthenticateUserWithApplicationToken")
    @ResponseWrapper(localName = "AuthenticateUserWithApplicationTokenResponse", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.AuthenticateUserWithApplicationTokenResponse")
    public String authenticateUserWithApplicationToken(
        @WebParam(name = "userName", targetNamespace = "urn:Core.service.livelink.opentext.com")
        String userName,
        @WebParam(name = "userPassword", targetNamespace = "urn:Core.service.livelink.opentext.com")
        String userPassword,
        @WebParam(name = "applicationToken", targetNamespace = "urn:Core.service.livelink.opentext.com")
        String applicationToken);

    /**
     * 
     * @param applicationToken
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CombineApplicationToken", action = "urn:Core.service.livelink.opentext.com/CombineApplicationToken")
    @WebResult(name = "CombineApplicationTokenResult", targetNamespace = "urn:Core.service.livelink.opentext.com")
    @RequestWrapper(localName = "CombineApplicationToken", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.CombineApplicationToken")
    @ResponseWrapper(localName = "CombineApplicationTokenResponse", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.CombineApplicationTokenResponse")
    public String combineApplicationToken(
        @WebParam(name = "applicationToken", targetNamespace = "urn:Core.service.livelink.opentext.com")
        String applicationToken);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetOTDSResourceID", action = "urn:Core.service.livelink.opentext.com/GetOTDSResourceID")
    @WebResult(name = "GetOTDSResourceIDResult", targetNamespace = "urn:Core.service.livelink.opentext.com")
    @RequestWrapper(localName = "GetOTDSResourceID", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.GetOTDSResourceID")
    @ResponseWrapper(localName = "GetOTDSResourceIDResponse", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.GetOTDSResourceIDResponse")
    public String getOTDSResourceID();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetOTDSServer", action = "urn:Core.service.livelink.opentext.com/GetOTDSServer")
    @WebResult(name = "GetOTDSServerResult", targetNamespace = "urn:Core.service.livelink.opentext.com")
    @RequestWrapper(localName = "GetOTDSServer", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.GetOTDSServer")
    @ResponseWrapper(localName = "GetOTDSServerResponse", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.GetOTDSServerResponse")
    public String getOTDSServer();

    /**
     * 
     * @return
     *     returns javax.xml.datatype.XMLGregorianCalendar
     */
    @WebMethod(operationName = "GetSessionExpirationDate", action = "urn:Core.service.livelink.opentext.com/GetSessionExpirationDate")
    @WebResult(name = "GetSessionExpirationDateResult", targetNamespace = "urn:Core.service.livelink.opentext.com")
    @RequestWrapper(localName = "GetSessionExpirationDate", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.GetSessionExpirationDate")
    @ResponseWrapper(localName = "GetSessionExpirationDateResponse", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.GetSessionExpirationDateResponse")
    public XMLGregorianCalendar getSessionExpirationDate();

    /**
     * 
     * @param applicationID
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ImpersonateApplication", action = "urn:Core.service.livelink.opentext.com/ImpersonateApplication")
    @WebResult(name = "ImpersonateApplicationResult", targetNamespace = "urn:Core.service.livelink.opentext.com")
    @RequestWrapper(localName = "ImpersonateApplication", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.ImpersonateApplication")
    @ResponseWrapper(localName = "ImpersonateApplicationResponse", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.ImpersonateApplicationResponse")
    public String impersonateApplication(
        @WebParam(name = "applicationID", targetNamespace = "urn:Core.service.livelink.opentext.com")
        String applicationID);

    /**
     * 
     * @param userName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ImpersonateUser", action = "urn:Core.service.livelink.opentext.com/ImpersonateUser")
    @WebResult(name = "ImpersonateUserResult", targetNamespace = "urn:Core.service.livelink.opentext.com")
    @RequestWrapper(localName = "ImpersonateUser", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.ImpersonateUser")
    @ResponseWrapper(localName = "ImpersonateUserResponse", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.ImpersonateUserResponse")
    public String impersonateUser(
        @WebParam(name = "userName", targetNamespace = "urn:Core.service.livelink.opentext.com")
        String userName);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RefreshToken", action = "urn:Core.service.livelink.opentext.com/RefreshToken")
    @WebResult(name = "RefreshTokenResult", targetNamespace = "urn:Core.service.livelink.opentext.com")
    @RequestWrapper(localName = "RefreshToken", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.RefreshToken")
    @ResponseWrapper(localName = "RefreshTokenResponse", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.RefreshTokenResponse")
    public String refreshToken();

    /**
     * 
     * @param capToken
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ValidateUser", action = "urn:Core.service.livelink.opentext.com/ValidateUser")
    @WebResult(name = "ValidateUserResult", targetNamespace = "urn:Core.service.livelink.opentext.com")
    @RequestWrapper(localName = "ValidateUser", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.ValidateUser")
    @ResponseWrapper(localName = "ValidateUserResponse", targetNamespace = "urn:Core.service.livelink.opentext.com", className = "com.opentext.livelink.service.core.ValidateUserResponse")
    public String validateUser(
        @WebParam(name = "capToken", targetNamespace = "urn:Core.service.livelink.opentext.com")
        String capToken);

}