/**
 * Cbr_Ifc_Ws_Out_Licenca_Sem_VenServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas;

public class Cbr_Ifc_Ws_Out_Licenca_Sem_VenServiceServiceLocator extends org.apache.axis.client.Service implements com.meta4.schemas.Cbr_Ifc_Ws_Out_Licenca_Sem_VenServiceService {

    public Cbr_Ifc_Ws_Out_Licenca_Sem_VenServiceServiceLocator() {
    }


    public Cbr_Ifc_Ws_Out_Licenca_Sem_VenServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Cbr_Ifc_Ws_Out_Licenca_Sem_VenServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CBR_IFC_WS_OUT_LICENCA_SEM_VEN
    private java.lang.String CBR_IFC_WS_OUT_LICENCA_SEM_VEN_address = "http://dbdev3/services/CBR_IFC_WS_OUT_LICENCA_SEM_VEN";

    public java.lang.String getCBR_IFC_WS_OUT_LICENCA_SEM_VENAddress() {
        return CBR_IFC_WS_OUT_LICENCA_SEM_VEN_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CBR_IFC_WS_OUT_LICENCA_SEM_VENWSDDServiceName = "CBR_IFC_WS_OUT_LICENCA_SEM_VEN";

    public java.lang.String getCBR_IFC_WS_OUT_LICENCA_SEM_VENWSDDServiceName() {
        return CBR_IFC_WS_OUT_LICENCA_SEM_VENWSDDServiceName;
    }

    public void setCBR_IFC_WS_OUT_LICENCA_SEM_VENWSDDServiceName(java.lang.String name) {
        CBR_IFC_WS_OUT_LICENCA_SEM_VENWSDDServiceName = name;
    }

    public com.meta4.schemas.Cbr_Ifc_Ws_Out_Licenca_Sem_VenService getCBR_IFC_WS_OUT_LICENCA_SEM_VEN() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CBR_IFC_WS_OUT_LICENCA_SEM_VEN_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCBR_IFC_WS_OUT_LICENCA_SEM_VEN(endpoint);
    }

    public com.meta4.schemas.Cbr_Ifc_Ws_Out_Licenca_Sem_VenService getCBR_IFC_WS_OUT_LICENCA_SEM_VEN(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.meta4.schemas.CBR_IFC_WS_OUT_LICENCA_SEM_VENSoapBindingStub _stub = new com.meta4.schemas.CBR_IFC_WS_OUT_LICENCA_SEM_VENSoapBindingStub(portAddress, this);
            _stub.setPortName(getCBR_IFC_WS_OUT_LICENCA_SEM_VENWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCBR_IFC_WS_OUT_LICENCA_SEM_VENEndpointAddress(java.lang.String address) {
        CBR_IFC_WS_OUT_LICENCA_SEM_VEN_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.meta4.schemas.Cbr_Ifc_Ws_Out_Licenca_Sem_VenService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.meta4.schemas.CBR_IFC_WS_OUT_LICENCA_SEM_VENSoapBindingStub _stub = new com.meta4.schemas.CBR_IFC_WS_OUT_LICENCA_SEM_VENSoapBindingStub(new java.net.URL(CBR_IFC_WS_OUT_LICENCA_SEM_VEN_address), this);
                _stub.setPortName(getCBR_IFC_WS_OUT_LICENCA_SEM_VENWSDDServiceName());
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
        if ("CBR_IFC_WS_OUT_LICENCA_SEM_VEN".equals(inputPortName)) {
            return getCBR_IFC_WS_OUT_LICENCA_SEM_VEN();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.meta4.com/", "Cbr_Ifc_Ws_Out_Licenca_Sem_VenServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.meta4.com/", "CBR_IFC_WS_OUT_LICENCA_SEM_VEN"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CBR_IFC_WS_OUT_LICENCA_SEM_VEN".equals(portName)) {
            setCBR_IFC_WS_OUT_LICENCA_SEM_VENEndpointAddress(address);
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
