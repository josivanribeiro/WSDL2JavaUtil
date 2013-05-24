/**
 * Cbr_Ifc_Ws_Out_Emprestimo_ExtrService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas;

public interface Cbr_Ifc_Ws_Out_Emprestimo_ExtrService extends java.rmi.Remote {
    public com.meta4.schemas.types.M4LoadobjectOutput m4LoadObject(com.meta4.schemas.types.Dados_ExtratoBlock DADOS_EXTRATO) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException;
    public com.meta4.schemas.types.Get_Emprestimo_ExtratoOutput GET_EMPRESTIMO_EXTRATO(java.lang.String ARG_ENTIDADE, java.lang.String ARG_MATRICULA) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException;
    public com.meta4.schemas.types.Get_Extrato_Emprestimo_FinOutput GET_EXTRATO_EMPRESTIMO_FIN(java.lang.String ARG_ENTIDADE, java.lang.String ARG_MATRICULA) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException;
    public int retrieveM4Session(java.lang.String in0) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException;
}
