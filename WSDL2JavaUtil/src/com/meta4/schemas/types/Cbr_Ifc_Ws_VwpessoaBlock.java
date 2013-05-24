/**
 * Cbr_Ifc_Ws_VwpessoaBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas.types;

public class Cbr_Ifc_Ws_VwpessoaBlock  implements java.io.Serializable {
    private com.meta4.schemas.types.Cbr_Ifc_Ws_VwpessoaRecord[] cbr_Ifc_Ws_VwpessoaRecordSet;

    private java.lang.String sql_Logico;

    public Cbr_Ifc_Ws_VwpessoaBlock() {
    }

    public Cbr_Ifc_Ws_VwpessoaBlock(
           com.meta4.schemas.types.Cbr_Ifc_Ws_VwpessoaRecord[] cbr_Ifc_Ws_VwpessoaRecordSet,
           java.lang.String sql_Logico) {
           this.cbr_Ifc_Ws_VwpessoaRecordSet = cbr_Ifc_Ws_VwpessoaRecordSet;
           this.sql_Logico = sql_Logico;
    }


    /**
     * Gets the cbr_Ifc_Ws_VwpessoaRecordSet value for this Cbr_Ifc_Ws_VwpessoaBlock.
     * 
     * @return cbr_Ifc_Ws_VwpessoaRecordSet
     */
    public com.meta4.schemas.types.Cbr_Ifc_Ws_VwpessoaRecord[] getCbr_Ifc_Ws_VwpessoaRecordSet() {
        return cbr_Ifc_Ws_VwpessoaRecordSet;
    }


    /**
     * Sets the cbr_Ifc_Ws_VwpessoaRecordSet value for this Cbr_Ifc_Ws_VwpessoaBlock.
     * 
     * @param cbr_Ifc_Ws_VwpessoaRecordSet
     */
    public void setCbr_Ifc_Ws_VwpessoaRecordSet(com.meta4.schemas.types.Cbr_Ifc_Ws_VwpessoaRecord[] cbr_Ifc_Ws_VwpessoaRecordSet) {
        this.cbr_Ifc_Ws_VwpessoaRecordSet = cbr_Ifc_Ws_VwpessoaRecordSet;
    }


    /**
     * Gets the sql_Logico value for this Cbr_Ifc_Ws_VwpessoaBlock.
     * 
     * @return sql_Logico
     */
    public java.lang.String getSql_Logico() {
        return sql_Logico;
    }


    /**
     * Sets the sql_Logico value for this Cbr_Ifc_Ws_VwpessoaBlock.
     * 
     * @param sql_Logico
     */
    public void setSql_Logico(java.lang.String sql_Logico) {
        this.sql_Logico = sql_Logico;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cbr_Ifc_Ws_VwpessoaBlock)) return false;
        Cbr_Ifc_Ws_VwpessoaBlock other = (Cbr_Ifc_Ws_VwpessoaBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cbr_Ifc_Ws_VwpessoaRecordSet==null && other.getCbr_Ifc_Ws_VwpessoaRecordSet()==null) || 
             (this.cbr_Ifc_Ws_VwpessoaRecordSet!=null &&
              java.util.Arrays.equals(this.cbr_Ifc_Ws_VwpessoaRecordSet, other.getCbr_Ifc_Ws_VwpessoaRecordSet()))) &&
            ((this.sql_Logico==null && other.getSql_Logico()==null) || 
             (this.sql_Logico!=null &&
              this.sql_Logico.equals(other.getSql_Logico())));
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
        if (getCbr_Ifc_Ws_VwpessoaRecordSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCbr_Ifc_Ws_VwpessoaRecordSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCbr_Ifc_Ws_VwpessoaRecordSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSql_Logico() != null) {
            _hashCode += getSql_Logico().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cbr_Ifc_Ws_VwpessoaBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwpessoaBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbr_Ifc_Ws_VwpessoaRecordSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cbr_Ifc_Ws_VwpessoaRecordSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwpessoaRecord"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sql_Logico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sql_Logico"));
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
