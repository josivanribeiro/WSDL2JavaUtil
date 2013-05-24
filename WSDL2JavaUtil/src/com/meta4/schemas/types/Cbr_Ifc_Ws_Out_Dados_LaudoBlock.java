/**
 * Cbr_Ifc_Ws_Out_Dados_LaudoBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas.types;

public class Cbr_Ifc_Ws_Out_Dados_LaudoBlock  implements java.io.Serializable {
    private com.meta4.schemas.types.Cbr_Ifc_Ws_Out_Dados_LaudoRecord[] cbr_Ifc_Ws_Out_Dados_LaudoRecordSet;

    private java.lang.String sql;

    public Cbr_Ifc_Ws_Out_Dados_LaudoBlock() {
    }

    public Cbr_Ifc_Ws_Out_Dados_LaudoBlock(
           com.meta4.schemas.types.Cbr_Ifc_Ws_Out_Dados_LaudoRecord[] cbr_Ifc_Ws_Out_Dados_LaudoRecordSet,
           java.lang.String sql) {
           this.cbr_Ifc_Ws_Out_Dados_LaudoRecordSet = cbr_Ifc_Ws_Out_Dados_LaudoRecordSet;
           this.sql = sql;
    }


    /**
     * Gets the cbr_Ifc_Ws_Out_Dados_LaudoRecordSet value for this Cbr_Ifc_Ws_Out_Dados_LaudoBlock.
     * 
     * @return cbr_Ifc_Ws_Out_Dados_LaudoRecordSet
     */
    public com.meta4.schemas.types.Cbr_Ifc_Ws_Out_Dados_LaudoRecord[] getCbr_Ifc_Ws_Out_Dados_LaudoRecordSet() {
        return cbr_Ifc_Ws_Out_Dados_LaudoRecordSet;
    }


    /**
     * Sets the cbr_Ifc_Ws_Out_Dados_LaudoRecordSet value for this Cbr_Ifc_Ws_Out_Dados_LaudoBlock.
     * 
     * @param cbr_Ifc_Ws_Out_Dados_LaudoRecordSet
     */
    public void setCbr_Ifc_Ws_Out_Dados_LaudoRecordSet(com.meta4.schemas.types.Cbr_Ifc_Ws_Out_Dados_LaudoRecord[] cbr_Ifc_Ws_Out_Dados_LaudoRecordSet) {
        this.cbr_Ifc_Ws_Out_Dados_LaudoRecordSet = cbr_Ifc_Ws_Out_Dados_LaudoRecordSet;
    }


    /**
     * Gets the sql value for this Cbr_Ifc_Ws_Out_Dados_LaudoBlock.
     * 
     * @return sql
     */
    public java.lang.String getSql() {
        return sql;
    }


    /**
     * Sets the sql value for this Cbr_Ifc_Ws_Out_Dados_LaudoBlock.
     * 
     * @param sql
     */
    public void setSql(java.lang.String sql) {
        this.sql = sql;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cbr_Ifc_Ws_Out_Dados_LaudoBlock)) return false;
        Cbr_Ifc_Ws_Out_Dados_LaudoBlock other = (Cbr_Ifc_Ws_Out_Dados_LaudoBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cbr_Ifc_Ws_Out_Dados_LaudoRecordSet==null && other.getCbr_Ifc_Ws_Out_Dados_LaudoRecordSet()==null) || 
             (this.cbr_Ifc_Ws_Out_Dados_LaudoRecordSet!=null &&
              java.util.Arrays.equals(this.cbr_Ifc_Ws_Out_Dados_LaudoRecordSet, other.getCbr_Ifc_Ws_Out_Dados_LaudoRecordSet()))) &&
            ((this.sql==null && other.getSql()==null) || 
             (this.sql!=null &&
              this.sql.equals(other.getSql())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCbr_Ifc_Ws_Out_Dados_LaudoRecordSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCbr_Ifc_Ws_Out_Dados_LaudoRecordSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCbr_Ifc_Ws_Out_Dados_LaudoRecordSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSql() != null) {
            _hashCode += getSql().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cbr_Ifc_Ws_Out_Dados_LaudoBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_Out_Dados_LaudoBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbr_Ifc_Ws_Out_Dados_LaudoRecordSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cbr_Ifc_Ws_Out_Dados_LaudoRecordSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_Out_Dados_LaudoRecord"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sql");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sql"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
