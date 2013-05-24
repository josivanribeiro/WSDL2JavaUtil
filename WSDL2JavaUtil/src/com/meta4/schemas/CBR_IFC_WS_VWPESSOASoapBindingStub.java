/**
 * CBR_IFC_WS_VWPESSOASoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas;

public class CBR_IFC_WS_VWPESSOASoapBindingStub extends org.apache.axis.client.Stub implements com.meta4.schemas.Cbr_Ifc_Ws_VwpessoaService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[19];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CBR_PESQUISAR_LOGRADOURO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CEP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_ID_PAIS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_UF"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_DESC_LOGRADOURO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_ID_LOGRADOURO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_ID_BAIRRO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_ID_CIDADE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesquisar_LogradouroOutput"));
        oper.setReturnClass(com.meta4.schemas.types.Cbr_Pesquisar_LogradouroOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "CBR_PESQUISAR_LOGRADOUROReturn"));
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
        oper.setName("M4LoadObject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CBR_ARRAY_ID_HR"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Array_Id_HrBlock"), com.meta4.schemas.types.Cbr_Array_Id_HrBlock.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CBR_ESTADO_CIVIL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Estado_CivilBlock"), com.meta4.schemas.types.Cbr_Estado_CivilBlock.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CBR_IFC_WS_VWPESSOA"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwpessoaBlock"), com.meta4.schemas.types.Cbr_Ifc_Ws_VwpessoaBlock.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CBR_IFC_WS_VWENDERECO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwenderecoBlock"), com.meta4.schemas.types.Cbr_Ifc_Ws_VwenderecoBlock.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CBR_IFC_WS_VWTELEFONE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwtelefoneBlock"), com.meta4.schemas.types.Cbr_Ifc_Ws_VwtelefoneBlock.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CBR_IFC_WS_VWDEPENDENTE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwdependenteBlock"), com.meta4.schemas.types.Cbr_Ifc_Ws_VwdependenteBlock.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CBR_PESQUISAR_LOGRADOURO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesquisar_LogradouroBlock"), com.meta4.schemas.types.Cbr_Pesquisar_LogradouroBlock.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CBR_IFC_WS_VWPESSOA_BANCO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_Vwpessoa_BancoBlock"), com.meta4.schemas.types.Cbr_Ifc_Ws_Vwpessoa_BancoBlock.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CBR_PESQ_ULT_STD_ID_PERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesq_Ult_Std_Id_PersonBlock"), com.meta4.schemas.types.Cbr_Pesq_Ult_Std_Id_PersonBlock.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CBR_PESQUISAR_AGENCIA_BANCARIA"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesquisar_Agencia_BancariaBlock"), com.meta4.schemas.types.Cbr_Pesquisar_Agencia_BancariaBlock.class, false, false);
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
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NOVO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_PERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_GB_NAME"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_DT_BIRTH"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_DT_MORTE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_N_MAE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_N_PAI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_CPF"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_NRO_SIC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_PIS_PASEP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_NRO_CART_IDENT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_ORG_EMIS_CIDENT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_DT_EMIS_CIDENT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_NRO_T_ELEITOR"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_ZONA_T_ELEIT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_SEC_T_ELEIT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_ID_SUB_GDIV_TE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_ID_GEO_DIV_TE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_ID_COUNTRY_TE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_ESTADO_CIVIL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "NovoOutput"));
        oper.setReturnClass(com.meta4.schemas.types.NovoOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "NOVOReturn"));
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
        oper.setName("ALTERAR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_PERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_GB_NAME"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_DT_BIRTH"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_DT_MORTE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_N_MAE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_N_PAI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_CPF"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_NRO_SIC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_PIS_PASEP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_NRO_CART_IDENT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_ORG_EMIS_CIDENT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_DT_EMIS_CIDENT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_NRO_T_ELEITOR"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_ZONA_T_ELEIT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_SEC_T_ELEIT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_ID_SUB_GDIV_TE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_ID_GEO_DIV_TE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_ID_COUNTRY_TE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_ESTADO_CIVIL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "AlterarOutput"));
        oper.setReturnClass(com.meta4.schemas.types.AlterarOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ALTERARReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PESQUISAR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_PERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_NOME"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "PesquisarOutput"));
        oper.setReturnClass(com.meta4.schemas.types.PesquisarOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "PESQUISARReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NOVO_BANCO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_ID_PERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_OR_ACCOUNT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"), java.lang.Double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_DT_START"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_DT_END"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_ID_BANK_BRANCH"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_ENTITLED"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_ACCOUNT_NUMBER"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_ID_BANKTYPE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_GB_BANK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Novo_BancoOutput"));
        oper.setReturnClass(com.meta4.schemas.types.Novo_BancoOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "NOVO_BANCOReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ALTERAR_BANCO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_ID_PERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_OR_ACCOUNT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"), java.lang.Double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_DT_START"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_DT_END"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_ID_BANK_BRANCH"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_ENTITLED"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_ACCOUNT_NUMBER"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_ID_BANKTYPE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_GB_BANK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Alterar_BancoOutput"));
        oper.setReturnClass(com.meta4.schemas.types.Alterar_BancoOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ALTERAR_BANCOReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NOVO_ENDERECO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_PERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_OR_ADDRESS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"), java.lang.Double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_DT_START"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_DT_END"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_OR_LOGRADOURO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"), java.lang.Double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ADDRESS_LINE_1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ADDRESS_LINE_2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ZIP_CODE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_GB_ADDRESS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_GEO_PLACE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_SUB_GEO_DIV"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_GEO_DIV"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_COUNTRY"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_LOCATION_TYPE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_MAILING_CHECK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Novo_EnderecoOutput"));
        oper.setReturnClass(com.meta4.schemas.types.Novo_EnderecoOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "NOVO_ENDERECOReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NOVO_TELEFONE");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_PERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_OR_PHONE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"), java.lang.Double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_PHONE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_DT_START"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_DT_END"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_LINE_TYPE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_INT_COUNTRY_CODE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_INT_REGION_CODE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_COMPLEMENTO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Novo_TelefoneOutput"));
        oper.setReturnClass(com.meta4.schemas.types.Novo_TelefoneOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "NOVO_TELEFONEReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NOVO_DEPENDENTE");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_HR"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_OR_DEP_NB"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"), java.lang.Double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_DT_START"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_DT_END"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_DEP_TYPE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_FAMILY_PERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_COMMENT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Novo_DependenteOutput"));
        oper.setReturnClass(com.meta4.schemas.types.Novo_DependenteOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "NOVO_DEPENDENTEReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PESQUISAR_BANCO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_PERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Pesquisar_BancoOutput"));
        oper.setReturnClass(com.meta4.schemas.types.Pesquisar_BancoOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "PESQUISAR_BANCOReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ALTERAR_ENDERECO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_PERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_OR_ADDRESS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"), java.lang.Double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_DT_START"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_DT_END"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_OR_LOGRADOURO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"), java.lang.Double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ADDRESS_LINE_1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ADDRESS_LINE_2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ZIP_CODE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_GB_ADDRESS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_GEO_PLACE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_SUB_GEO_DIV"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_GEO_DIV"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_COUNTRY"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_LOCATION_TYPE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_MAILING_CHECK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Alterar_EnderecoOutput"));
        oper.setReturnClass(com.meta4.schemas.types.Alterar_EnderecoOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ALTERAR_ENDERECOReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ALTERAR_TELEFONE");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_PERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_OR_PHONE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"), java.lang.Double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_PHONE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_DT_START"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_DT_END"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_LINE_TYPE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_INT_COUNTRY_CODE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_INT_REGION_CODE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_COMPLEMENTO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Alterar_TelefoneOutput"));
        oper.setReturnClass(com.meta4.schemas.types.Alterar_TelefoneOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ALTERAR_TELEFONEReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ALTERAR_DEPENDENTE");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_HR"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_OR_DEP_NB"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"), java.lang.Double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_DT_START"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_DT_END"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_DEP_TYPE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_FAMILY_PERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_COMMENT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Alterar_DependenteOutput"));
        oper.setReturnClass(com.meta4.schemas.types.Alterar_DependenteOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ALTERAR_DEPENDENTEReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PESQUISAR_ENDERECO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_PERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Pesquisar_EnderecoOutput"));
        oper.setReturnClass(com.meta4.schemas.types.Pesquisar_EnderecoOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "PESQUISAR_ENDERECOReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PESQUISAR_TELEFONE");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_PERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_SCO_GB_NAME"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Pesquisar_TelefoneOutput"));
        oper.setReturnClass(com.meta4.schemas.types.Pesquisar_TelefoneOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "PESQUISAR_TELEFONEReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PESQUISAR_DEPENDENTE");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_STD_ID_HR"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Pesquisar_DependenteOutput"));
        oper.setReturnClass(com.meta4.schemas.types.Pesquisar_DependenteOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "PESQUISAR_DEPENDENTEReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PESQUISAR_AGENCIA_BANCARIA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ARG_CBR_ID_BANCO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Pesquisar_Agencia_BancariaOutput"));
        oper.setReturnClass(com.meta4.schemas.types.Pesquisar_Agencia_BancariaOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "PESQUISAR_AGENCIA_BANCARIAReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.meta4.com/", "fault"),
                      "com.meta4.soapservices.exception.M4SoapException",
                      new javax.xml.namespace.QName("http://exception.soapservices.meta4.com", "M4SoapException"), 
                      true
                     ));
        _operations[17] = oper;

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
        _operations[18] = oper;

    }

    public CBR_IFC_WS_VWPESSOASoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CBR_IFC_WS_VWPESSOASoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CBR_IFC_WS_VWPESSOASoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Alterar_BancoOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Alterar_BancoOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Alterar_DependenteOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Alterar_DependenteOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Alterar_EnderecoOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Alterar_EnderecoOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Alterar_TelefoneOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Alterar_TelefoneOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "AlterarOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.AlterarOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Array_Id_HrBlock");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Array_Id_HrBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Array_Id_HrRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Array_Id_HrRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Estado_CivilBlock");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Estado_CivilBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Estado_CivilRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Estado_CivilRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwdependenteBlock");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Ifc_Ws_VwdependenteBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwdependenteRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Ifc_Ws_VwdependenteRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwenderecoBlock");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Ifc_Ws_VwenderecoBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwenderecoRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Ifc_Ws_VwenderecoRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_Vwpessoa_BancoBlock");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Ifc_Ws_Vwpessoa_BancoBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_Vwpessoa_BancoRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Ifc_Ws_Vwpessoa_BancoRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwpessoaBlock");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Ifc_Ws_VwpessoaBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwpessoaRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Ifc_Ws_VwpessoaRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwtelefoneBlock");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Ifc_Ws_VwtelefoneBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwtelefoneRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Ifc_Ws_VwtelefoneRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesq_Ult_Std_Id_PersonBlock");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Pesq_Ult_Std_Id_PersonBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesq_Ult_Std_Id_PersonRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Pesq_Ult_Std_Id_PersonRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesquisar_Agencia_BancariaBlock");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Pesquisar_Agencia_BancariaBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesquisar_Agencia_BancariaRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Pesquisar_Agencia_BancariaRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesquisar_LogradouroBlock");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Pesquisar_LogradouroBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesquisar_LogradouroOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Pesquisar_LogradouroOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesquisar_LogradouroRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Pesquisar_LogradouroRecord.class;
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

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Novo_BancoOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Novo_BancoOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Novo_DependenteOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Novo_DependenteOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Novo_EnderecoOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Novo_EnderecoOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Novo_TelefoneOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Novo_TelefoneOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "NovoOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.NovoOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Pesquisar_Agencia_BancariaOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Pesquisar_Agencia_BancariaOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Pesquisar_BancoOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Pesquisar_BancoOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Pesquisar_DependenteOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Pesquisar_DependenteOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Pesquisar_EnderecoOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Pesquisar_EnderecoOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Pesquisar_TelefoneOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Pesquisar_TelefoneOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "PesquisarOutput");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.PesquisarOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/", "ArrayOf_tns1_Cbr_Array_Id_HrRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Array_Id_HrRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Array_Id_HrRecord");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/", "ArrayOf_tns1_Cbr_Estado_CivilRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Estado_CivilRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Estado_CivilRecord");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/", "ArrayOf_tns1_Cbr_Ifc_Ws_VwdependenteRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Ifc_Ws_VwdependenteRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwdependenteRecord");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/", "ArrayOf_tns1_Cbr_Ifc_Ws_VwenderecoRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Ifc_Ws_VwenderecoRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwenderecoRecord");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/", "ArrayOf_tns1_Cbr_Ifc_Ws_Vwpessoa_BancoRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Ifc_Ws_Vwpessoa_BancoRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_Vwpessoa_BancoRecord");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/", "ArrayOf_tns1_Cbr_Ifc_Ws_VwpessoaRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Ifc_Ws_VwpessoaRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwpessoaRecord");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/", "ArrayOf_tns1_Cbr_Ifc_Ws_VwtelefoneRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Ifc_Ws_VwtelefoneRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwtelefoneRecord");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/", "ArrayOf_tns1_Cbr_Pesq_Ult_Std_Id_PersonRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Pesq_Ult_Std_Id_PersonRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesq_Ult_Std_Id_PersonRecord");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/", "ArrayOf_tns1_Cbr_Pesquisar_Agencia_BancariaRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Pesquisar_Agencia_BancariaRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesquisar_Agencia_BancariaRecord");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/", "ArrayOf_tns1_Cbr_Pesquisar_LogradouroRecord");
            cachedSerQNames.add(qName);
            cls = com.meta4.schemas.types.Cbr_Pesquisar_LogradouroRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesquisar_LogradouroRecord");
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

    public com.meta4.schemas.types.Cbr_Pesquisar_LogradouroOutput CBR_PESQUISAR_LOGRADOURO(java.lang.String ARG_CEP, java.lang.String ARG_ID_PAIS, java.lang.String ARG_UF, java.lang.String ARG_DESC_LOGRADOURO, java.lang.String ARG_ID_LOGRADOURO, java.lang.String ARG_ID_BAIRRO, java.lang.String ARG_ID_CIDADE) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "CBR_PESQUISAR_LOGRADOURO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_CEP, ARG_ID_PAIS, ARG_UF, ARG_DESC_LOGRADOURO, ARG_ID_LOGRADOURO, ARG_ID_BAIRRO, ARG_ID_CIDADE});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.Cbr_Pesquisar_LogradouroOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.Cbr_Pesquisar_LogradouroOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.Cbr_Pesquisar_LogradouroOutput.class);
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

    public com.meta4.schemas.types.M4LoadobjectOutput m4LoadObject(com.meta4.schemas.types.Cbr_Array_Id_HrBlock CBR_ARRAY_ID_HR, com.meta4.schemas.types.Cbr_Estado_CivilBlock CBR_ESTADO_CIVIL, com.meta4.schemas.types.Cbr_Ifc_Ws_VwpessoaBlock CBR_IFC_WS_VWPESSOA, com.meta4.schemas.types.Cbr_Ifc_Ws_VwenderecoBlock CBR_IFC_WS_VWENDERECO, com.meta4.schemas.types.Cbr_Ifc_Ws_VwtelefoneBlock CBR_IFC_WS_VWTELEFONE, com.meta4.schemas.types.Cbr_Ifc_Ws_VwdependenteBlock CBR_IFC_WS_VWDEPENDENTE, com.meta4.schemas.types.Cbr_Pesquisar_LogradouroBlock CBR_PESQUISAR_LOGRADOURO, com.meta4.schemas.types.Cbr_Ifc_Ws_Vwpessoa_BancoBlock CBR_IFC_WS_VWPESSOA_BANCO, com.meta4.schemas.types.Cbr_Pesq_Ult_Std_Id_PersonBlock CBR_PESQ_ULT_STD_ID_PERSON, com.meta4.schemas.types.Cbr_Pesquisar_Agencia_BancariaBlock CBR_PESQUISAR_AGENCIA_BANCARIA) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "M4LoadObject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CBR_ARRAY_ID_HR, CBR_ESTADO_CIVIL, CBR_IFC_WS_VWPESSOA, CBR_IFC_WS_VWENDERECO, CBR_IFC_WS_VWTELEFONE, CBR_IFC_WS_VWDEPENDENTE, CBR_PESQUISAR_LOGRADOURO, CBR_IFC_WS_VWPESSOA_BANCO, CBR_PESQ_ULT_STD_ID_PERSON, CBR_PESQUISAR_AGENCIA_BANCARIA});

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

    public com.meta4.schemas.types.NovoOutput NOVO(java.lang.String ARG_STD_ID_PERSON, java.lang.String ARG_SCO_GB_NAME, java.util.Calendar ARG_STD_DT_BIRTH, java.util.Calendar ARG_CBR_DT_MORTE, java.lang.String ARG_CBR_N_MAE, java.lang.String ARG_CBR_N_PAI, java.lang.String ARG_CBR_CPF, java.lang.String ARG_CBR_NRO_SIC, java.lang.String ARG_CBR_PIS_PASEP, java.lang.String ARG_CBR_NRO_CART_IDENT, java.lang.String ARG_CBR_ORG_EMIS_CIDENT, java.util.Calendar ARG_CBR_DT_EMIS_CIDENT, java.lang.String ARG_CBR_NRO_T_ELEITOR, java.lang.String ARG_CBR_ZONA_T_ELEIT, java.lang.String ARG_CBR_SEC_T_ELEIT, java.lang.String ARG_CBR_ID_SUB_GDIV_TE, java.lang.String ARG_CBR_ID_GEO_DIV_TE, java.lang.String ARG_CBR_ID_COUNTRY_TE, java.lang.String ARG_ESTADO_CIVIL) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "NOVO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_STD_ID_PERSON, ARG_SCO_GB_NAME, ARG_STD_DT_BIRTH, ARG_CBR_DT_MORTE, ARG_CBR_N_MAE, ARG_CBR_N_PAI, ARG_CBR_CPF, ARG_CBR_NRO_SIC, ARG_CBR_PIS_PASEP, ARG_CBR_NRO_CART_IDENT, ARG_CBR_ORG_EMIS_CIDENT, ARG_CBR_DT_EMIS_CIDENT, ARG_CBR_NRO_T_ELEITOR, ARG_CBR_ZONA_T_ELEIT, ARG_CBR_SEC_T_ELEIT, ARG_CBR_ID_SUB_GDIV_TE, ARG_CBR_ID_GEO_DIV_TE, ARG_CBR_ID_COUNTRY_TE, ARG_ESTADO_CIVIL});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.NovoOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.NovoOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.NovoOutput.class);
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

    public com.meta4.schemas.types.AlterarOutput ALTERAR(java.lang.String ARG_STD_ID_PERSON, java.lang.String ARG_SCO_GB_NAME, java.util.Calendar ARG_STD_DT_BIRTH, java.util.Calendar ARG_CBR_DT_MORTE, java.lang.String ARG_CBR_N_MAE, java.lang.String ARG_CBR_N_PAI, java.lang.String ARG_CBR_CPF, java.lang.String ARG_CBR_NRO_SIC, java.lang.String ARG_CBR_PIS_PASEP, java.lang.String ARG_CBR_NRO_CART_IDENT, java.lang.String ARG_CBR_ORG_EMIS_CIDENT, java.util.Calendar ARG_CBR_DT_EMIS_CIDENT, java.lang.String ARG_CBR_NRO_T_ELEITOR, java.lang.String ARG_CBR_ZONA_T_ELEIT, java.lang.String ARG_CBR_SEC_T_ELEIT, java.lang.String ARG_CBR_ID_SUB_GDIV_TE, java.lang.String ARG_CBR_ID_GEO_DIV_TE, java.lang.String ARG_CBR_ID_COUNTRY_TE, java.lang.String ARG_ESTADO_CIVIL) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "ALTERAR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_STD_ID_PERSON, ARG_SCO_GB_NAME, ARG_STD_DT_BIRTH, ARG_CBR_DT_MORTE, ARG_CBR_N_MAE, ARG_CBR_N_PAI, ARG_CBR_CPF, ARG_CBR_NRO_SIC, ARG_CBR_PIS_PASEP, ARG_CBR_NRO_CART_IDENT, ARG_CBR_ORG_EMIS_CIDENT, ARG_CBR_DT_EMIS_CIDENT, ARG_CBR_NRO_T_ELEITOR, ARG_CBR_ZONA_T_ELEIT, ARG_CBR_SEC_T_ELEIT, ARG_CBR_ID_SUB_GDIV_TE, ARG_CBR_ID_GEO_DIV_TE, ARG_CBR_ID_COUNTRY_TE, ARG_ESTADO_CIVIL});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.AlterarOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.AlterarOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.AlterarOutput.class);
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

    public com.meta4.schemas.types.PesquisarOutput PESQUISAR(java.lang.String ARG_STD_ID_PERSON, java.lang.String ARG_NOME) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "PESQUISAR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_STD_ID_PERSON, ARG_NOME});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.PesquisarOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.PesquisarOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.PesquisarOutput.class);
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

    public com.meta4.schemas.types.Novo_BancoOutput NOVO_BANCO(java.lang.String ARG_SCO_ID_PERSON, java.lang.Double ARG_SCO_OR_ACCOUNT, java.util.Calendar ARG_SCO_DT_START, java.util.Calendar ARG_SCO_DT_END, java.lang.String ARG_SCO_ID_BANK_BRANCH, java.lang.String ARG_SCO_ENTITLED, java.lang.String ARG_SCO_ACCOUNT_NUMBER, java.lang.String ARG_SCO_ID_BANKTYPE, java.lang.String ARG_SCO_GB_BANK) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "NOVO_BANCO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_SCO_ID_PERSON, ARG_SCO_OR_ACCOUNT, ARG_SCO_DT_START, ARG_SCO_DT_END, ARG_SCO_ID_BANK_BRANCH, ARG_SCO_ENTITLED, ARG_SCO_ACCOUNT_NUMBER, ARG_SCO_ID_BANKTYPE, ARG_SCO_GB_BANK});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.Novo_BancoOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.Novo_BancoOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.Novo_BancoOutput.class);
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

    public com.meta4.schemas.types.Alterar_BancoOutput ALTERAR_BANCO(java.lang.String ARG_SCO_ID_PERSON, java.lang.Double ARG_SCO_OR_ACCOUNT, java.util.Calendar ARG_SCO_DT_START, java.util.Calendar ARG_SCO_DT_END, java.lang.String ARG_SCO_ID_BANK_BRANCH, java.lang.String ARG_SCO_ENTITLED, java.lang.String ARG_SCO_ACCOUNT_NUMBER, java.lang.String ARG_SCO_ID_BANKTYPE, java.lang.String ARG_SCO_GB_BANK) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "ALTERAR_BANCO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_SCO_ID_PERSON, ARG_SCO_OR_ACCOUNT, ARG_SCO_DT_START, ARG_SCO_DT_END, ARG_SCO_ID_BANK_BRANCH, ARG_SCO_ENTITLED, ARG_SCO_ACCOUNT_NUMBER, ARG_SCO_ID_BANKTYPE, ARG_SCO_GB_BANK});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.Alterar_BancoOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.Alterar_BancoOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.Alterar_BancoOutput.class);
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

    public com.meta4.schemas.types.Novo_EnderecoOutput NOVO_ENDERECO(java.lang.String ARG_STD_ID_PERSON, java.lang.Double ARG_STD_OR_ADDRESS, java.util.Calendar ARG_STD_DT_START, java.util.Calendar ARG_STD_DT_END, java.lang.Double ARG_CBR_OR_LOGRADOURO, java.lang.String ARG_STD_ADDRESS_LINE_1, java.lang.String ARG_STD_ADDRESS_LINE_2, java.lang.String ARG_STD_ZIP_CODE, java.lang.String ARG_SCO_GB_ADDRESS, java.lang.String ARG_STD_ID_GEO_PLACE, java.lang.String ARG_STD_ID_SUB_GEO_DIV, java.lang.String ARG_STD_ID_GEO_DIV, java.lang.String ARG_STD_ID_COUNTRY, java.lang.String ARG_STD_ID_LOCATION_TYPE, java.lang.String ARG_STD_MAILING_CHECK) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "NOVO_ENDERECO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_STD_ID_PERSON, ARG_STD_OR_ADDRESS, ARG_STD_DT_START, ARG_STD_DT_END, ARG_CBR_OR_LOGRADOURO, ARG_STD_ADDRESS_LINE_1, ARG_STD_ADDRESS_LINE_2, ARG_STD_ZIP_CODE, ARG_SCO_GB_ADDRESS, ARG_STD_ID_GEO_PLACE, ARG_STD_ID_SUB_GEO_DIV, ARG_STD_ID_GEO_DIV, ARG_STD_ID_COUNTRY, ARG_STD_ID_LOCATION_TYPE, ARG_STD_MAILING_CHECK});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.Novo_EnderecoOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.Novo_EnderecoOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.Novo_EnderecoOutput.class);
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

    public com.meta4.schemas.types.Novo_TelefoneOutput NOVO_TELEFONE(java.lang.String ARG_STD_ID_PERSON, java.lang.Double ARG_STD_OR_PHONE, java.lang.String ARG_STD_PHONE, java.util.Calendar ARG_STD_DT_START, java.util.Calendar ARG_STD_DT_END, java.lang.String ARG_STD_ID_LINE_TYPE, java.lang.String ARG_STD_INT_COUNTRY_CODE, java.lang.String ARG_STD_INT_REGION_CODE, java.lang.String ARG_CBR_COMPLEMENTO) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "NOVO_TELEFONE"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_STD_ID_PERSON, ARG_STD_OR_PHONE, ARG_STD_PHONE, ARG_STD_DT_START, ARG_STD_DT_END, ARG_STD_ID_LINE_TYPE, ARG_STD_INT_COUNTRY_CODE, ARG_STD_INT_REGION_CODE, ARG_CBR_COMPLEMENTO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.Novo_TelefoneOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.Novo_TelefoneOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.Novo_TelefoneOutput.class);
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

    public com.meta4.schemas.types.Novo_DependenteOutput NOVO_DEPENDENTE(java.lang.String ARG_STD_ID_HR, java.lang.Double ARG_STD_OR_DEP_NB, java.util.Calendar ARG_STD_DT_START, java.util.Calendar ARG_STD_DT_END, java.lang.String ARG_STD_ID_DEP_TYPE, java.lang.String ARG_STD_ID_FAMILY_PERSON, java.lang.String ARG_STD_COMMENT) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "NOVO_DEPENDENTE"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_STD_ID_HR, ARG_STD_OR_DEP_NB, ARG_STD_DT_START, ARG_STD_DT_END, ARG_STD_ID_DEP_TYPE, ARG_STD_ID_FAMILY_PERSON, ARG_STD_COMMENT});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.Novo_DependenteOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.Novo_DependenteOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.Novo_DependenteOutput.class);
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

    public com.meta4.schemas.types.Pesquisar_BancoOutput PESQUISAR_BANCO(java.lang.String ARG_STD_ID_PERSON) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "PESQUISAR_BANCO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_STD_ID_PERSON});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.Pesquisar_BancoOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.Pesquisar_BancoOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.Pesquisar_BancoOutput.class);
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

    public com.meta4.schemas.types.Alterar_EnderecoOutput ALTERAR_ENDERECO(java.lang.String ARG_STD_ID_PERSON, java.lang.Double ARG_STD_OR_ADDRESS, java.util.Calendar ARG_STD_DT_START, java.util.Calendar ARG_STD_DT_END, java.lang.Double ARG_CBR_OR_LOGRADOURO, java.lang.String ARG_STD_ADDRESS_LINE_1, java.lang.String ARG_STD_ADDRESS_LINE_2, java.lang.String ARG_STD_ZIP_CODE, java.lang.String ARG_SCO_GB_ADDRESS, java.lang.String ARG_STD_ID_GEO_PLACE, java.lang.String ARG_STD_ID_SUB_GEO_DIV, java.lang.String ARG_STD_ID_GEO_DIV, java.lang.String ARG_STD_ID_COUNTRY, java.lang.String ARG_STD_ID_LOCATION_TYPE, java.lang.String ARG_STD_MAILING_CHECK) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "ALTERAR_ENDERECO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_STD_ID_PERSON, ARG_STD_OR_ADDRESS, ARG_STD_DT_START, ARG_STD_DT_END, ARG_CBR_OR_LOGRADOURO, ARG_STD_ADDRESS_LINE_1, ARG_STD_ADDRESS_LINE_2, ARG_STD_ZIP_CODE, ARG_SCO_GB_ADDRESS, ARG_STD_ID_GEO_PLACE, ARG_STD_ID_SUB_GEO_DIV, ARG_STD_ID_GEO_DIV, ARG_STD_ID_COUNTRY, ARG_STD_ID_LOCATION_TYPE, ARG_STD_MAILING_CHECK});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.Alterar_EnderecoOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.Alterar_EnderecoOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.Alterar_EnderecoOutput.class);
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

    public com.meta4.schemas.types.Alterar_TelefoneOutput ALTERAR_TELEFONE(java.lang.String ARG_STD_ID_PERSON, java.lang.Double ARG_STD_OR_PHONE, java.lang.String ARG_STD_PHONE, java.util.Calendar ARG_STD_DT_START, java.util.Calendar ARG_STD_DT_END, java.lang.String ARG_STD_ID_LINE_TYPE, java.lang.String ARG_STD_INT_COUNTRY_CODE, java.lang.String ARG_STD_INT_REGION_CODE, java.lang.String ARG_CBR_COMPLEMENTO) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "ALTERAR_TELEFONE"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_STD_ID_PERSON, ARG_STD_OR_PHONE, ARG_STD_PHONE, ARG_STD_DT_START, ARG_STD_DT_END, ARG_STD_ID_LINE_TYPE, ARG_STD_INT_COUNTRY_CODE, ARG_STD_INT_REGION_CODE, ARG_CBR_COMPLEMENTO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.Alterar_TelefoneOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.Alterar_TelefoneOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.Alterar_TelefoneOutput.class);
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

    public com.meta4.schemas.types.Alterar_DependenteOutput ALTERAR_DEPENDENTE(java.lang.String ARG_STD_ID_HR, java.lang.Double ARG_STD_OR_DEP_NB, java.util.Calendar ARG_STD_DT_START, java.util.Calendar ARG_STD_DT_END, java.lang.String ARG_STD_ID_DEP_TYPE, java.lang.String ARG_STD_ID_FAMILY_PERSON, java.lang.String ARG_STD_COMMENT) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "ALTERAR_DEPENDENTE"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_STD_ID_HR, ARG_STD_OR_DEP_NB, ARG_STD_DT_START, ARG_STD_DT_END, ARG_STD_ID_DEP_TYPE, ARG_STD_ID_FAMILY_PERSON, ARG_STD_COMMENT});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.Alterar_DependenteOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.Alterar_DependenteOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.Alterar_DependenteOutput.class);
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

    public com.meta4.schemas.types.Pesquisar_EnderecoOutput PESQUISAR_ENDERECO(java.lang.String ARG_STD_ID_PERSON) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "PESQUISAR_ENDERECO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_STD_ID_PERSON});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.Pesquisar_EnderecoOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.Pesquisar_EnderecoOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.Pesquisar_EnderecoOutput.class);
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

    public com.meta4.schemas.types.Pesquisar_TelefoneOutput PESQUISAR_TELEFONE(java.lang.String ARG_STD_ID_PERSON, java.lang.String ARG_SCO_GB_NAME) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "PESQUISAR_TELEFONE"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_STD_ID_PERSON, ARG_SCO_GB_NAME});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.Pesquisar_TelefoneOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.Pesquisar_TelefoneOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.Pesquisar_TelefoneOutput.class);
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

    public com.meta4.schemas.types.Pesquisar_DependenteOutput PESQUISAR_DEPENDENTE(java.lang.String ARG_STD_ID_HR) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "PESQUISAR_DEPENDENTE"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_STD_ID_HR});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.Pesquisar_DependenteOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.Pesquisar_DependenteOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.Pesquisar_DependenteOutput.class);
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

    public com.meta4.schemas.types.Pesquisar_Agencia_BancariaOutput PESQUISAR_AGENCIA_BANCARIA(java.lang.String ARG_CBR_ID_BANCO) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://schemas.meta4.com/", "PESQUISAR_AGENCIA_BANCARIA"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ARG_CBR_ID_BANCO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.meta4.schemas.types.Pesquisar_Agencia_BancariaOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.meta4.schemas.types.Pesquisar_Agencia_BancariaOutput) org.apache.axis.utils.JavaUtils.convert(_resp, com.meta4.schemas.types.Pesquisar_Agencia_BancariaOutput.class);
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
        _call.setOperation(_operations[18]);
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
