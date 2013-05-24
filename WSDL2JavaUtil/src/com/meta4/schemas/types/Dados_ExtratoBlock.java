/**
 * Dados_ExtratoBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas.types;

public class Dados_ExtratoBlock  implements java.io.Serializable {
    private com.meta4.schemas.types.Dados_ExtratoRecord[] dados_ExtratoRecordSet;

    private java.lang.String sql;

    public Dados_ExtratoBlock() {
    }

    public Dados_ExtratoBlock(
           com.meta4.schemas.types.Dados_ExtratoRecord[] dados_ExtratoRecordSet,
           java.lang.String sql) {
           this.dados_ExtratoRecordSet = dados_ExtratoRecordSet;
           this.sql = sql;
    }


    /**
     * Gets the dados_ExtratoRecordSet value for this Dados_ExtratoBlock.
     * 
     * @return dados_ExtratoRecordSet
     */
    public com.meta4.schemas.types.Dados_ExtratoRecord[] getDados_ExtratoRecordSet() {
        return dados_ExtratoRecordSet;
    }


    /**
     * Sets the dados_ExtratoRecordSet value for this Dados_ExtratoBlock.
     * 
     * @param dados_ExtratoRecordSet
     */
    public void setDados_ExtratoRecordSet(com.meta4.schemas.types.Dados_ExtratoRecord[] dados_ExtratoRecordSet) {
        this.dados_ExtratoRecordSet = dados_ExtratoRecordSet;
    }


    /**
     * Gets the sql value for this Dados_ExtratoBlock.
     * 
     * @return sql
     */
    public java.lang.String getSql() {
        return sql;
    }


    /**
     * Sets the sql value for this Dados_ExtratoBlock.
     * 
     * @param sql
     */
    public void setSql(java.lang.String sql) {
        this.sql = sql;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dados_ExtratoBlock)) return false;
        Dados_ExtratoBlock other = (Dados_ExtratoBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dados_ExtratoRecordSet==null && other.getDados_ExtratoRecordSet()==null) || 
             (this.dados_ExtratoRecordSet!=null &&
              java.util.Arrays.equals(this.dados_ExtratoRecordSet, other.getDados_ExtratoRecordSet()))) &&
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
        if (getDados_ExtratoRecordSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDados_ExtratoRecordSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDados_ExtratoRecordSet(), i);
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
        new org.apache.axis.description.TypeDesc(Dados_ExtratoBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Dados_ExtratoBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dados_ExtratoRecordSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dados_ExtratoRecordSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Dados_ExtratoRecord"));
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
