/**
 * Cbr_Ifc_Ws_VwpessoaServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas;

public class Cbr_Ifc_Ws_VwpessoaServiceServiceLocator extends org.apache.axis.client.Service implements com.meta4.schemas.Cbr_Ifc_Ws_VwpessoaServiceService {

    public Cbr_Ifc_Ws_VwpessoaServiceServiceLocator() {
    }


    public Cbr_Ifc_Ws_VwpessoaServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Cbr_Ifc_Ws_VwpessoaServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CBR_IFC_WS_VWPESSOA
    private java.lang.String CBR_IFC_WS_VWPESSOA_address = "http://dbdev3/services/CBR_IFC_WS_VWPESSOA";

    public java.lang.String getCBR_IFC_WS_VWPESSOAAddress() {
        return CBR_IFC_WS_VWPESSOA_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CBR_IFC_WS_VWPESSOAWSDDServiceName = "CBR_IFC_WS_VWPESSOA";

    public java.lang.String getCBR_IFC_WS_VWPESSOAWSDDServiceName() {
        return CBR_IFC_WS_VWPESSOAWSDDServiceName;
    }

    public void setCBR_IFC_WS_VWPESSOAWSDDServiceName(java.lang.String name) {
        CBR_IFC_WS_VWPESSOAWSDDServiceName = name;
    }

    public com.meta4.schemas.Cbr_Ifc_Ws_VwpessoaService getCBR_IFC_WS_VWPESSOA() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CBR_IFC_WS_VWPESSOA_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCBR_IFC_WS_VWPESSOA(endpoint);
    }

    public com.meta4.schemas.Cbr_Ifc_Ws_VwpessoaService getCBR_IFC_WS_VWPESSOA(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.meta4.schemas.CBR_IFC_WS_VWPESSOASoapBindingStub _stub = new com.meta4.schemas.CBR_IFC_WS_VWPESSOASoapBindingStub(portAddress, this);
            _stub.setPortName(getCBR_IFC_WS_VWPESSOAWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCBR_IFC_WS_VWPESSOAEndpointAddress(java.lang.String address) {
        CBR_IFC_WS_VWPESSOA_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.meta4.schemas.Cbr_Ifc_Ws_VwpessoaService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.meta4.schemas.CBR_IFC_WS_VWPESSOASoapBindingStub _stub = new com.meta4.schemas.CBR_IFC_WS_VWPESSOASoapBindingStub(new java.net.URL(CBR_IFC_WS_VWPESSOA_address), this);
                _stub.setPortName(getCBR_IFC_WS_VWPESSOAWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CBR_IFC_WS_VWPESSOA".equals(inputPortName)) {
            return getCBR_IFC_WS_VWPESSOA();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.meta4.com/", "Cbr_Ifc_Ws_VwpessoaServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.meta4.com/", "CBR_IFC_WS_VWPESSOA"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CBR_IFC_WS_VWPESSOA".equals(portName)) {
            setCBR_IFC_WS_VWPESSOAEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
