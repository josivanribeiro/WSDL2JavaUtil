/**
 * Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas;

public interface Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpService extends java.rmi.Remote {
    public com.meta4.schemas.types.M4LoadobjectOutput m4LoadObject(com.meta4.schemas.types.Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpBlock CBR_IFC_WS_OUT_CAD_PESSOA_SIMP) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException;
    public com.meta4.schemas.types.Get_Dados_Cad_Pessoa_ResumidoOutput GET_DADOS_CAD_PESSOA_RESUMIDO(java.lang.String ARG_ENTIDADE, java.lang.String ARG_MATRICULA, java.lang.String ARG_CPF, java.lang.String ARG_NOME, java.lang.String ARG_DT_NASCIMENTO, java.lang.String ARG_DT_NASCIMENTO_FINAL, java.lang.String ARG_TIPO, java.lang.String ARG_PERIODO, java.lang.String ARG_MAE, java.lang.String ARG_ID_HR_INICIAL) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException;
    public int retrieveM4Session(java.lang.String in0) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException;
}
