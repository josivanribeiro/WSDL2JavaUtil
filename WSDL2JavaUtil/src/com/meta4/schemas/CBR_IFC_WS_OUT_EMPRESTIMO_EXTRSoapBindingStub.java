/**
 * CBR_IFC_WS_OUT_EMPRESTIMO_EXTRSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas;

public class CBR_IFC_WS_OUT_EMPRESTIMO_EXTRSoapBindingStub extends org.apache.axis.client.Stub implements com.meta4.schemas.Cbr_Ifc_Ws_Out_Emprestimo_ExtrService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("M4LoadObject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DADOS_EXTRATO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Dados_ExtratoBlock"), com.meta4.schemas.types.Dados_ExtratoBlock.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "M4LoadobjectOutput"));
        oper.setReturnClass(com.meta4.schemas.types.M4LoadobjectOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "M4LoadObjectReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GET_EMPRESTIMO_EXTRATO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_ENTIDADE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_MATRICULA"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Get_Emprestimo_ExtratoOutput"));
        oper.setReturnClass(com.meta4.schemas.types.Get_Emprestimo_ExtratoOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GET_EMPRESTIMO_EXTRATOReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GET_EXTRATO_EMPRESTIMO_FIN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_ENTIDADE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_MATRICULA"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Get_Extrato_Emprestimo_FinOutput"));
        oper.setReturnClass(com.meta4.schemas.types.Get_Extrato_Emprestimo_FinOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GET_EXTRATO_EMPRESTIMO_FINReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveM4Session");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "retrieveM4SessionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[3] = oper;

    }

    public CBR_IFC_WS_OUT_EMPRESTIMO_EXTRSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CBR_IFC_WS_OUT_EMPRESTIMO_EXTRSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CBR_IFC_WS_OUT_EMPRESTIMO_EXTRSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException");
            cachedSerQNames.add(qName);
            cls = com.meta4.soapservices.exception.M4SoapException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Dados_ExtratoBlock");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Dados_ExtratoBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Dados_ExtratoRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Dados_ExtratoRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Get_Emprestimo_ExtratoOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Get_Emprestimo_ExtratoOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Get_Extrato_Emprestimo_FinOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Get_Extrato_Emprestimo_FinOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "LogMessage");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.LogMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "M4LoadobjectOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.M4LoadobjectOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/", "ArrayOf_tns1_Dados_ExtratoRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Dados_ExtratoRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Dados_ExtratoRecord");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/", "ArrayOf_tns1_LogMessage");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.LogMessage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "LogMessage");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.meta4.schemas.types.M4LoadobjectOutput m4LoadObject(com.meta4.schemas.types.Dados_ExtratoBlock DADOS_EXTRATO) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "M4LoadObject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {DADOS_EXTRATO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.M4LoadobjectOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.M4LoadobjectOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.M4LoadobjectOutput.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.meta4.soapservices.exception.M4SoapException) {
              throw (com.meta4.soapservices.exception.M4SoapException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.meta4.schemas.types.Get_Emprestimo_ExtratoOutput GET_EMPRESTIMO_EXTRATO(java.lang.String ARG_ENTIDADE, java.lang.String ARG_MATRICULA) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "GET_EMPRESTIMO_EXTRATO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_ENTIDADE, ARG_MATRICULA});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.Get_Emprestimo_ExtratoOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.Get_Emprestimo_ExtratoOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.Get_Emprestimo_ExtratoOutput.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.meta4.soapservices.exception.M4SoapException) {
              throw (com.meta4.soapservices.exception.M4SoapException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.meta4.schemas.types.Get_Extrato_Emprestimo_FinOutput GET_EXTRATO_EMPRESTIMO_FIN(java.lang.String ARG_ENTIDADE, java.lang.String ARG_MATRICULA) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "GET_EXTRATO_EMPRESTIMO_FIN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_ENTIDADE, ARG_MATRICULA});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.Get_Extrato_Emprestimo_FinOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.Get_Extrato_Emprestimo_FinOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.Get_Extrato_Emprestimo_FinOutput.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.meta4.soapservices.exception.M4SoapException) {
              throw (com.meta4.soapservices.exception.M4SoapException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int retrieveM4Session(java.lang.String in0) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "retrieveM4Session"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.meta4.soapservices.exception.M4SoapException) {
              throw (com.meta4.soapservices.exception.M4SoapException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
