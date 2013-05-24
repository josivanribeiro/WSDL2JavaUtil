/**
 * Cbr_Pesq_Ult_Std_Id_PersonBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas.types;

public class Cbr_Pesq_Ult_Std_Id_PersonBlock  implements java.io.Serializable {
    private com.meta4.schemas.types.Cbr_Pesq_Ult_Std_Id_PersonRecord[] cbr_Pesq_Ult_Std_Id_PersonRecordSet;

    private java.lang.String executerealsql;

    public Cbr_Pesq_Ult_Std_Id_PersonBlock() {
    }

    public Cbr_Pesq_Ult_Std_Id_PersonBlock(
           com.meta4.schemas.types.Cbr_Pesq_Ult_Std_Id_PersonRecord[] cbr_Pesq_Ult_Std_Id_PersonRecordSet,
           java.lang.String executerealsql) {
           this.cbr_Pesq_Ult_Std_Id_PersonRecordSet = cbr_Pesq_Ult_Std_Id_PersonRecordSet;
           this.executerealsql = executerealsql;
    }


    /**
     * Gets the cbr_Pesq_Ult_Std_Id_PersonRecordSet value for this Cbr_Pesq_Ult_Std_Id_PersonBlock.
     * 
     * @return cbr_Pesq_Ult_Std_Id_PersonRecordSet
     */
    public com.meta4.schemas.types.Cbr_Pesq_Ult_Std_Id_PersonRecord[] getCbr_Pesq_Ult_Std_Id_PersonRecordSet() {
        return cbr_Pesq_Ult_Std_Id_PersonRecordSet;
    }


    /**
     * Sets the cbr_Pesq_Ult_Std_Id_PersonRecordSet value for this Cbr_Pesq_Ult_Std_Id_PersonBlock.
     * 
     * @param cbr_Pesq_Ult_Std_Id_PersonRecordSet
     */
    public void setCbr_Pesq_Ult_Std_Id_PersonRecordSet(com.meta4.schemas.types.Cbr_Pesq_Ult_Std_Id_PersonRecord[] cbr_Pesq_Ult_Std_Id_PersonRecordSet) {
        this.cbr_Pesq_Ult_Std_Id_PersonRecordSet = cbr_Pesq_Ult_Std_Id_PersonRecordSet;
    }


    /**
     * Gets the executerealsql value for this Cbr_Pesq_Ult_Std_Id_PersonBlock.
     * 
     * @return executerealsql
     */
    public java.lang.String getExecuterealsql() {
        return executerealsql;
    }


    /**
     * Sets the executerealsql value for this Cbr_Pesq_Ult_Std_Id_PersonBlock.
     * 
     * @param executerealsql
     */
    public void setExecuterealsql(java.lang.String executerealsql) {
        this.executerealsql = executerealsql;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cbr_Pesq_Ult_Std_Id_PersonBlock)) return false;
        Cbr_Pesq_Ult_Std_Id_PersonBlock other = (Cbr_Pesq_Ult_Std_Id_PersonBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cbr_Pesq_Ult_Std_Id_PersonRecordSet==null && other.getCbr_Pesq_Ult_Std_Id_PersonRecordSet()==null) || 
             (this.cbr_Pesq_Ult_Std_Id_PersonRecordSet!=null &&
              java.util.Arrays.equals(this.cbr_Pesq_Ult_Std_Id_PersonRecordSet, other.getCbr_Pesq_Ult_Std_Id_PersonRecordSet()))) &&
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
        if (getCbr_Pesq_Ult_Std_Id_PersonRecordSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCbr_Pesq_Ult_Std_Id_PersonRecordSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCbr_Pesq_Ult_Std_Id_PersonRecordSet(), i);
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
        new org.apache.axis.description.TypeDesc(Cbr_Pesq_Ult_Std_Id_PersonBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesq_Ult_Std_Id_PersonBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbr_Pesq_Ult_Std_Id_PersonRecordSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cbr_Pesq_Ult_Std_Id_PersonRecordSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Pesq_Ult_Std_Id_PersonRecord"));
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
