/**
 * Cbr_Ifc_Ws_VwenderecoBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas.types;

public class Cbr_Ifc_Ws_VwenderecoBlock  implements java.io.Serializable {
    private com.meta4.schemas.types.Cbr_Ifc_Ws_VwenderecoRecord[] cbr_Ifc_Ws_VwenderecoRecordSet;

    private java.lang.String sql_Logico;

    public Cbr_Ifc_Ws_VwenderecoBlock() {
    }

    public Cbr_Ifc_Ws_VwenderecoBlock(
           com.meta4.schemas.types.Cbr_Ifc_Ws_VwenderecoRecord[] cbr_Ifc_Ws_VwenderecoRecordSet,
           java.lang.String sql_Logico) {
           this.cbr_Ifc_Ws_VwenderecoRecordSet = cbr_Ifc_Ws_VwenderecoRecordSet;
           this.sql_Logico = sql_Logico;
    }


    /**
     * Gets the cbr_Ifc_Ws_VwenderecoRecordSet value for this Cbr_Ifc_Ws_VwenderecoBlock.
     * 
     * @return cbr_Ifc_Ws_VwenderecoRecordSet
     */
    public com.meta4.schemas.types.Cbr_Ifc_Ws_VwenderecoRecord[] getCbr_Ifc_Ws_VwenderecoRecordSet() {
        return cbr_Ifc_Ws_VwenderecoRecordSet;
    }


    /**
     * Sets the cbr_Ifc_Ws_VwenderecoRecordSet value for this Cbr_Ifc_Ws_VwenderecoBlock.
     * 
     * @param cbr_Ifc_Ws_VwenderecoRecordSet
     */
    public void setCbr_Ifc_Ws_VwenderecoRecordSet(com.meta4.schemas.types.Cbr_Ifc_Ws_VwenderecoRecord[] cbr_Ifc_Ws_VwenderecoRecordSet) {
        this.cbr_Ifc_Ws_VwenderecoRecordSet = cbr_Ifc_Ws_VwenderecoRecordSet;
    }


    /**
     * Gets the sql_Logico value for this Cbr_Ifc_Ws_VwenderecoBlock.
     * 
     * @return sql_Logico
     */
    public java.lang.String getSql_Logico() {
        return sql_Logico;
    }


    /**
     * Sets the sql_Logico value for this Cbr_Ifc_Ws_VwenderecoBlock.
     * 
     * @param sql_Logico
     */
    public void setSql_Logico(java.lang.String sql_Logico) {
        this.sql_Logico = sql_Logico;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cbr_Ifc_Ws_VwenderecoBlock)) return false;
        Cbr_Ifc_Ws_VwenderecoBlock other = (Cbr_Ifc_Ws_VwenderecoBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cbr_Ifc_Ws_VwenderecoRecordSet==null && other.getCbr_Ifc_Ws_VwenderecoRecordSet()==null) || 
             (this.cbr_Ifc_Ws_VwenderecoRecordSet!=null &&
              java.util.Arrays.equals(this.cbr_Ifc_Ws_VwenderecoRecordSet, other.getCbr_Ifc_Ws_VwenderecoRecordSet()))) &&
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
        if (getCbr_Ifc_Ws_VwenderecoRecordSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCbr_Ifc_Ws_VwenderecoRecordSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCbr_Ifc_Ws_VwenderecoRecordSet(), i);
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
        new org.apache.axis.description.TypeDesc(Cbr_Ifc_Ws_VwenderecoBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwenderecoBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbr_Ifc_Ws_VwenderecoRecordSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cbr_Ifc_Ws_VwenderecoRecordSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwenderecoRecord"));
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
