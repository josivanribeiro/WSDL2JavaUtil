/**
 * Cbr_Ifc_Ws_Out_Licenca_Sem_VenService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas;

public interface Cbr_Ifc_Ws_Out_Licenca_Sem_VenService extends java.rmi.Remote {
    public com.meta4.schemas.types.M4LoadobjectOutput m4LoadObject(com.meta4.schemas.types.Cbr_Ifc_Ws_Out_Licenca_Sem_VenBlock CBR_IFC_WS_OUT_LICENCA_SEM_VEN) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException;
    public com.meta4.schemas.types.Get_Licenca_Sem_VencimentoOutput GET_LICENCA_SEM_VENCIMENTO(java.lang.String ARG_ENTIDADE, java.lang.String ARG_MATRICULA, java.lang.String ARG_TIPO_VIGENCIA) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException;
    public int retrieveM4Session(java.lang.String in0) throws java.rmi.RemoteException, com.meta4.soapservices.exception.M4SoapException;
}
