/**
 * Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas.types;

public class Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpBlock  implements java.io.Serializable {
    private com.meta4.schemas.types.Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecord[] cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet;

    private java.lang.String executerealsql;

    public Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpBlock() {
    }

    public Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpBlock(
           com.meta4.schemas.types.Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecord[] cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet,
           java.lang.String executerealsql) {
           this.cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet = cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet;
           this.executerealsql = executerealsql;
    }


    /**
     * Gets the cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet value for this Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpBlock.
     * 
     * @return cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet
     */
    public com.meta4.schemas.types.Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecord[] getCbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet() {
        return cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet;
    }


    /**
     * Sets the cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet value for this Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpBlock.
     * 
     * @param cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet
     */
    public void setCbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet(com.meta4.schemas.types.Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecord[] cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet) {
        this.cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet = cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet;
    }


    /**
     * Gets the executerealsql value for this Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpBlock.
     * 
     * @return executerealsql
     */
    public java.lang.String getExecuterealsql() {
        return executerealsql;
    }


    /**
     * Sets the executerealsql value for this Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpBlock.
     * 
     * @param executerealsql
     */
    public void setExecuterealsql(java.lang.String executerealsql) {
        this.executerealsql = executerealsql;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpBlock)) return false;
        Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpBlock other = (Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet==null && other.getCbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet()==null) || 
             (this.cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet!=null &&
              java.util.Arrays.equals(this.cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet, other.getCbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet()))) &&
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
        if (getCbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet(), i);
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
        new org.apache.axis.description.TypeDesc(Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecordSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_Out_Cad_Pessoa_SimpRecord"));
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
