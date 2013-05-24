/**
 * Cbr_Pesquisar_LogradouroBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas.types;

public class Cbr_Pesquisar_LogradouroBlock  implements java.io.Serializable {
    private com.meta4.schemas.types.Cbr_Pesquisar_LogradouroRecord[] cbr_Pesquisar_LogradouroRecordSet;

    private java.lang.String executerealsql;

    public Cbr_Pesquisar_LogradouroBlock() {
    }

    public Cbr_Pesquisar_LogradouroBlock(
           com.meta4.schemas.types.Cbr_Pesquisar_LogradouroRecord[] cbr_Pesquisar_LogradouroRecordSet,
           java.lang.String executerealsql) {
           this.cbr_Pesquisar_LogradouroRecordSet = cbr_Pesquisar_LogradouroRecordSet;
           this.executerealsql = executerealsql;
    }


    /**
     * Gets the cbr_Pesquisar_LogradouroRecordSet value for this Cbr_Pesquisar_LogradouroBlock.
     * 
     * @return cbr_Pesquisar_LogradouroRecordSet
     */
    public com.meta4.schemas.types.Cbr_Pesquisar_LogradouroRecord[] getCbr_Pesquisar_LogradouroRecordSet() {
        return cbr_Pesquisar_LogradouroRecordSet;
    }


    /**
     * Sets the cbr_Pesquisar_LogradouroRecordSet value for this Cbr_Pesquisar_LogradouroBlock.
     * 
     * @param cbr_Pesquisar_LogradouroRecordSet
     */
    public void setCbr_Pesquisar_LogradouroRecordSet(com.meta4.schemas.types.Cbr_Pesquisar_LogradouroRecord[] cbr_Pesquisar_LogradouroRecordSet) {
        this.cbr_Pesquisar_LogradouroRecordSet = cbr_Pesquisar_LogradouroRecordSet;
    }


    /**
     * Gets the executerealsql value for this Cbr_Pesquisar_LogradouroBlock.
     * 
     * @return executerealsql
     */
    public java.lang.String getExecuterealsql() {
        return executerealsql;
    }


    /**
     * Sets the executerealsql value for this Cbr_Pesquisar_LogradouroBlock.
     * 
     * @param executerealsql
     */
    public void setExecuterealsql(java.lang.String executerealsql) {
        this.executerealsql = executerealsql;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cbr_Pesquisar_LogradouroBlock)) return false;
        Cbr_Pesquisar_LogradouroBlock other = (Cbr_Pesquisar_LogradouroBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cbr_Pesquisar_LogradouroRecordSet==null && other.getCbr_Pesquisar_LogradouroRecordSet()==null) || 
             (this.cbr_Pesquisar_LogradouroRecordSet!=null &&
              java.util.Arrays.equals(this.cbr_Pesquisar_LogradouroRecordSet, other.getCbr_Pesquisar_LogradouroRecordSet()))) &&
            ((this.executerealsql==null && other.getExecuterealsql()==null) || 
             (this.executerealsql!=null &&
              this.executerealsql.equals(other.getExecuterealsql())));
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
        if (getCbr_Pesquisar_LogradouroRecordSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCbr_Pesquisar_LogradouroRecordSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCbr_Pesquisar_LogradouroRecordSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExecuterealsql() != null) {
            _hashCode += getExecuterealsql().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cbr_Pesquisar_LogradouroBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesquisar_LogradouroBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbr_Pesquisar_LogradouroRecordSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cbr_Pesquisar_LogradouroRecordSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesquisar_LogradouroRecord"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executerealsql");
        elemField.setXmlName(new javax.xml.namespace.QName("", "executerealsql"));
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
