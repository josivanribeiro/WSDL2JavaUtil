/**
 * Cbr_Ifc_Ws_Out_Licenca_Sem_VenBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas.types;

public class Cbr_Ifc_Ws_Out_Licenca_Sem_VenBlock  implements java.io.Serializable {
    private com.meta4.schemas.types.Cbr_Ifc_Ws_Out_Licenca_Sem_VenRecord[] cbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet;

    private java.lang.String sql;

    public Cbr_Ifc_Ws_Out_Licenca_Sem_VenBlock() {
    }

    public Cbr_Ifc_Ws_Out_Licenca_Sem_VenBlock(
           com.meta4.schemas.types.Cbr_Ifc_Ws_Out_Licenca_Sem_VenRecord[] cbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet,
           java.lang.String sql) {
           this.cbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet = cbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet;
           this.sql = sql;
    }


    /**
     * Gets the cbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet value for this Cbr_Ifc_Ws_Out_Licenca_Sem_VenBlock.
     * 
     * @return cbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet
     */
    public com.meta4.schemas.types.Cbr_Ifc_Ws_Out_Licenca_Sem_VenRecord[] getCbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet() {
        return cbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet;
    }


    /**
     * Sets the cbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet value for this Cbr_Ifc_Ws_Out_Licenca_Sem_VenBlock.
     * 
     * @param cbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet
     */
    public void setCbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet(com.meta4.schemas.types.Cbr_Ifc_Ws_Out_Licenca_Sem_VenRecord[] cbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet) {
        this.cbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet = cbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet;
    }


    /**
     * Gets the sql value for this Cbr_Ifc_Ws_Out_Licenca_Sem_VenBlock.
     * 
     * @return sql
     */
    public java.lang.String getSql() {
        return sql;
    }


    /**
     * Sets the sql value for this Cbr_Ifc_Ws_Out_Licenca_Sem_VenBlock.
     * 
     * @param sql
     */
    public void setSql(java.lang.String sql) {
        this.sql = sql;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cbr_Ifc_Ws_Out_Licenca_Sem_VenBlock)) return false;
        Cbr_Ifc_Ws_Out_Licenca_Sem_VenBlock other = (Cbr_Ifc_Ws_Out_Licenca_Sem_VenBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet==null && other.getCbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet()==null) || 
             (this.cbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet!=null &&
              java.util.Arrays.equals(this.cbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet, other.getCbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet()))) &&
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
        if (getCbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet(), i);
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
        new org.apache.axis.description.TypeDesc(Cbr_Ifc_Ws_Out_Licenca_Sem_VenBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_Out_Licenca_Sem_VenBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cbr_Ifc_Ws_Out_Licenca_Sem_VenRecordSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_Out_Licenca_Sem_VenRecord"));
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
