
package com.opentext.ecm.services.authws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.opentext.ecm.services.authws package. 
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

    private final static QName _AuthenticateWithTokenAndCodeToken_QNAME = new QName("", "token");
    private final static QName _GetTicketForUserResponse_QNAME = new QName("urn:authws.services.ecm.opentext.com", "GetTicketForUserResponse");
    private final static QName _GetResourceId_QNAME = new QName("urn:authws.services.ecm.opentext.com", "GetResourceId");
    private final static QName _GetResourceIdResponse_QNAME = new QName("urn:authws.services.ecm.opentext.com", "GetResourceIdResponse");
    private final static QName _GetTicketForUser_QNAME = new QName("urn:authws.services.ecm.opentext.com", "GetTicketForUser");
    private final static QName _AuthenticateWithToken_QNAME = new QName("urn:authws.services.ecm.opentext.com", "AuthenticateWithToken");
    private final static QName _AuthenticateWithTokenResponse_QNAME = new QName("urn:authws.services.ecm.opentext.com", "AuthenticateWithTokenResponse");
    private final static QName _Authenticate_QNAME = new QName("urn:authws.services.ecm.opentext.com", "Authenticate");
    private final static QName _AuthenticateWithPasswordAndCodeResponse_QNAME = new QName("urn:authws.services.ecm.opentext.com", "AuthenticateWithPasswordAndCodeResponse");
    private final static QName _AuthenticateCurrentUser_QNAME = new QName("urn:authws.services.ecm.opentext.com", "AuthenticateCurrentUser");
    private final static QName _AuthenticateCurrentUserWithCodeResponse_QNAME = new QName("urn:authws.services.ecm.opentext.com", "AuthenticateCurrentUserWithCodeResponse");
    private final static QName _AuthenticateWithPasswordAndCode_QNAME = new QName("urn:authws.services.ecm.opentext.com", "AuthenticateWithPasswordAndCode");
    private final static QName _AuthenticateCurrentUserWithCode_QNAME = new QName("urn:authws.services.ecm.opentext.com", "AuthenticateCurrentUserWithCode");
    private final static QName _AuthenticateResponse_QNAME = new QName("urn:authws.services.ecm.opentext.com", "AuthenticateResponse");
    private final static QName _AuthenticateWithTokenAndCodeResponse_QNAME = new QName("urn:authws.services.ecm.opentext.com", "AuthenticateWithTokenAndCodeResponse");
    private final static QName _AuthenticateCurrentUserResponse_QNAME = new QName("urn:authws.services.ecm.opentext.com", "AuthenticateCurrentUserResponse");
    private final static QName _AuthenticateWithTokenAndCode_QNAME = new QName("urn:authws.services.ecm.opentext.com", "AuthenticateWithTokenAndCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.opentext.ecm.services.authws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthenticationException.Parameters.Entry }
     * 
     */
    public AuthenticationException.Parameters.Entry createAuthenticationExceptionParametersEntry() {
        return new AuthenticationException.Parameters.Entry();
    }

    /**
     * Create an instance of {@link AuthenticateWithTokenResponse }
     * 
     */
    public AuthenticateWithTokenResponse createAuthenticateWithTokenResponse() {
        return new AuthenticateWithTokenResponse();
    }

    /**
     * Create an instance of {@link AuthenticateWithPasswordAndCode }
     * 
     */
    public AuthenticateWithPasswordAndCode createAuthenticateWithPasswordAndCode() {
        return new AuthenticateWithPasswordAndCode();
    }

    /**
     * Create an instance of {@link GetResourceIdResponse }
     * 
     */
    public GetResourceIdResponse createGetResourceIdResponse() {
        return new GetResourceIdResponse();
    }

    /**
     * Create an instance of {@link AuthenticateCurrentUserWithCode }
     * 
     */
    public AuthenticateCurrentUserWithCode createAuthenticateCurrentUserWithCode() {
        return new AuthenticateCurrentUserWithCode();
    }

    /**
     * Create an instance of {@link AuthenticateWithTokenAndCodeResponse }
     * 
     */
    public AuthenticateWithTokenAndCodeResponse createAuthenticateWithTokenAndCodeResponse() {
        return new AuthenticateWithTokenAndCodeResponse();
    }

    /**
     * Create an instance of {@link GetResourceId }
     * 
     */
    public GetResourceId createGetResourceId() {
        return new GetResourceId();
    }

    /**
     * Create an instance of {@link GetTicketForUserResponse }
     * 
     */
    public GetTicketForUserResponse createGetTicketForUserResponse() {
        return new GetTicketForUserResponse();
    }

    /**
     * Create an instance of {@link GetTicketForUser }
     * 
     */
    public GetTicketForUser createGetTicketForUser() {
        return new GetTicketForUser();
    }

    /**
     * Create an instance of {@link AuthenticateWithTokenAndCode }
     * 
     */
    public AuthenticateWithTokenAndCode createAuthenticateWithTokenAndCode() {
        return new AuthenticateWithTokenAndCode();
    }

    /**
     * Create an instance of {@link AuthenticationException.Parameters }
     * 
     */
    public AuthenticationException.Parameters createAuthenticationExceptionParameters() {
        return new AuthenticationException.Parameters();
    }

    /**
     * Create an instance of {@link AuthenticateWithToken }
     * 
     */
    public AuthenticateWithToken createAuthenticateWithToken() {
        return new AuthenticateWithToken();
    }

    /**
     * Create an instance of {@link AuthenticationException }
     * 
     */
    public AuthenticationException createAuthenticationException() {
        return new AuthenticationException();
    }

    /**
     * Create an instance of {@link Authenticate }
     * 
     */
    public Authenticate createAuthenticate() {
        return new Authenticate();
    }

    /**
     * Create an instance of {@link AuthenticateCurrentUserWithCodeResponse }
     * 
     */
    public AuthenticateCurrentUserWithCodeResponse createAuthenticateCurrentUserWithCodeResponse() {
        return new AuthenticateCurrentUserWithCodeResponse();
    }

    /**
     * Create an instance of {@link AuthenticateResponse }
     * 
     */
    public AuthenticateResponse createAuthenticateResponse() {
        return new AuthenticateResponse();
    }

    /**
     * Create an instance of {@link AuthenticateCurrentUserResponse }
     * 
     */
    public AuthenticateCurrentUserResponse createAuthenticateCurrentUserResponse() {
        return new AuthenticateCurrentUserResponse();
    }

    /**
     * Create an instance of {@link AuthenticateCurrentUser }
     * 
     */
    public AuthenticateCurrentUser createAuthenticateCurrentUser() {
        return new AuthenticateCurrentUser();
    }

    /**
     * Create an instance of {@link AuthenticateWithPasswordAndCodeResponse }
     * 
     */
    public AuthenticateWithPasswordAndCodeResponse createAuthenticateWithPasswordAndCodeResponse() {
        return new AuthenticateWithPasswordAndCodeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "token", scope = AuthenticateWithTokenAndCode.class)
    public JAXBElement<byte[]> createAuthenticateWithTokenAndCodeToken(byte[] value) {
        return new JAXBElement<byte[]>(_AuthenticateWithTokenAndCodeToken_QNAME, byte[].class, AuthenticateWithTokenAndCode.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketForUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:authws.services.ecm.opentext.com", name = "GetTicketForUserResponse")
    public JAXBElement<GetTicketForUserResponse> createGetTicketForUserResponse(GetTicketForUserResponse value) {
        return new JAXBElement<GetTicketForUserResponse>(_GetTicketForUserResponse_QNAME, GetTicketForUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResourceId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:authws.services.ecm.opentext.com", name = "GetResourceId")
    public JAXBElement<GetResourceId> createGetResourceId(GetResourceId value) {
        return new JAXBElement<GetResourceId>(_GetResourceId_QNAME, GetResourceId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResourceIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:authws.services.ecm.opentext.com", name = "GetResourceIdResponse")
    public JAXBElement<GetResourceIdResponse> createGetResourceIdResponse(GetResourceIdResponse value) {
        return new JAXBElement<GetResourceIdResponse>(_GetResourceIdResponse_QNAME, GetResourceIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketForUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:authws.services.ecm.opentext.com", name = "GetTicketForUser")
    public JAXBElement<GetTicketForUser> createGetTicketForUser(GetTicketForUser value) {
        return new JAXBElement<GetTicketForUser>(_GetTicketForUser_QNAME, GetTicketForUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateWithToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:authws.services.ecm.opentext.com", name = "AuthenticateWithToken")
    public JAXBElement<AuthenticateWithToken> createAuthenticateWithToken(AuthenticateWithToken value) {
        return new JAXBElement<AuthenticateWithToken>(_AuthenticateWithToken_QNAME, AuthenticateWithToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateWithTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:authws.services.ecm.opentext.com", name = "AuthenticateWithTokenResponse")
    public JAXBElement<AuthenticateWithTokenResponse> createAuthenticateWithTokenResponse(AuthenticateWithTokenResponse value) {
        return new JAXBElement<AuthenticateWithTokenResponse>(_AuthenticateWithTokenResponse_QNAME, AuthenticateWithTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authenticate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:authws.services.ecm.opentext.com", name = "Authenticate")
    public JAXBElement<Authenticate> createAuthenticate(Authenticate value) {
        return new JAXBElement<Authenticate>(_Authenticate_QNAME, Authenticate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateWithPasswordAndCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:authws.services.ecm.opentext.com", name = "AuthenticateWithPasswordAndCodeResponse")
    public JAXBElement<AuthenticateWithPasswordAndCodeResponse> createAuthenticateWithPasswordAndCodeResponse(AuthenticateWithPasswordAndCodeResponse value) {
        return new JAXBElement<AuthenticateWithPasswordAndCodeResponse>(_AuthenticateWithPasswordAndCodeResponse_QNAME, AuthenticateWithPasswordAndCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateCurrentUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:authws.services.ecm.opentext.com", name = "AuthenticateCurrentUser")
    public JAXBElement<AuthenticateCurrentUser> createAuthenticateCurrentUser(AuthenticateCurrentUser value) {
        return new JAXBElement<AuthenticateCurrentUser>(_AuthenticateCurrentUser_QNAME, AuthenticateCurrentUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateCurrentUserWithCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:authws.services.ecm.opentext.com", name = "AuthenticateCurrentUserWithCodeResponse")
    public JAXBElement<AuthenticateCurrentUserWithCodeResponse> createAuthenticateCurrentUserWithCodeResponse(AuthenticateCurrentUserWithCodeResponse value) {
        return new JAXBElement<AuthenticateCurrentUserWithCodeResponse>(_AuthenticateCurrentUserWithCodeResponse_QNAME, AuthenticateCurrentUserWithCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateWithPasswordAndCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:authws.services.ecm.opentext.com", name = "AuthenticateWithPasswordAndCode")
    public JAXBElement<AuthenticateWithPasswordAndCode> createAuthenticateWithPasswordAndCode(AuthenticateWithPasswordAndCode value) {
        return new JAXBElement<AuthenticateWithPasswordAndCode>(_AuthenticateWithPasswordAndCode_QNAME, AuthenticateWithPasswordAndCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateCurrentUserWithCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:authws.services.ecm.opentext.com", name = "AuthenticateCurrentUserWithCode")
    public JAXBElement<AuthenticateCurrentUserWithCode> createAuthenticateCurrentUserWithCode(AuthenticateCurrentUserWithCode value) {
        return new JAXBElement<AuthenticateCurrentUserWithCode>(_AuthenticateCurrentUserWithCode_QNAME, AuthenticateCurrentUserWithCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:authws.services.ecm.opentext.com", name = "AuthenticateResponse")
    public JAXBElement<AuthenticateResponse> createAuthenticateResponse(AuthenticateResponse value) {
        return new JAXBElement<AuthenticateResponse>(_AuthenticateResponse_QNAME, AuthenticateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateWithTokenAndCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:authws.services.ecm.opentext.com", name = "AuthenticateWithTokenAndCodeResponse")
    public JAXBElement<AuthenticateWithTokenAndCodeResponse> createAuthenticateWithTokenAndCodeResponse(AuthenticateWithTokenAndCodeResponse value) {
        return new JAXBElement<AuthenticateWithTokenAndCodeResponse>(_AuthenticateWithTokenAndCodeResponse_QNAME, AuthenticateWithTokenAndCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateCurrentUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:authws.services.ecm.opentext.com", name = "AuthenticateCurrentUserResponse")
    public JAXBElement<AuthenticateCurrentUserResponse> createAuthenticateCurrentUserResponse(AuthenticateCurrentUserResponse value) {
        return new JAXBElement<AuthenticateCurrentUserResponse>(_AuthenticateCurrentUserResponse_QNAME, AuthenticateCurrentUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateWithTokenAndCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:authws.services.ecm.opentext.com", name = "AuthenticateWithTokenAndCode")
    public JAXBElement<AuthenticateWithTokenAndCode> createAuthenticateWithTokenAndCode(AuthenticateWithTokenAndCode value) {
        return new JAXBElement<AuthenticateWithTokenAndCode>(_AuthenticateWithTokenAndCode_QNAME, AuthenticateWithTokenAndCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "token", scope = AuthenticateWithToken.class)
    public JAXBElement<byte[]> createAuthenticateWithTokenToken(byte[] value) {
        return new JAXBElement<byte[]>(_AuthenticateWithTokenAndCodeToken_QNAME, byte[].class, AuthenticateWithToken.class, ((byte[]) value));
    }

}
