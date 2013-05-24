/**
 * Cbr_Array_Id_HrBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas.types;

public class Cbr_Array_Id_HrBlock  implements java.io.Serializable {
    private com.meta4.schemas.types.Cbr_Array_Id_HrRecord[] cbr_Array_Id_HrRecordSet;

    private java.lang.String sql;

    private java.lang.String sql_Sentence;

    public Cbr_Array_Id_HrBlock() {
    }

    public Cbr_Array_Id_HrBlock(
           com.meta4.schemas.types.Cbr_Array_Id_HrRecord[] cbr_Array_Id_HrRecordSet,
           java.lang.String sql,
           java.lang.String sql_Sentence) {
           this.cbr_Array_Id_HrRecordSet = cbr_Array_Id_HrRecordSet;
           this.sql = sql;
           this.sql_Sentence = sql_Sentence;
    }


    /**
     * Gets the cbr_Array_Id_HrRecordSet value for this Cbr_Array_Id_HrBlock.
     * 
     * @return cbr_Array_Id_HrRecordSet
     */
    public com.meta4.schemas.types.Cbr_Array_Id_HrRecord[] getCbr_Array_Id_HrRecordSet() {
        return cbr_Array_Id_HrRecordSet;
    }


    /**
     * Sets the cbr_Array_Id_HrRecordSet value for this Cbr_Array_Id_HrBlock.
     * 
     * @param cbr_Array_Id_HrRecordSet
     */
    public void setCbr_Array_Id_HrRecordSet(com.meta4.schemas.types.Cbr_Array_Id_HrRecord[] cbr_Array_Id_HrRecordSet) {
        this.cbr_Array_Id_HrRecordSet = cbr_Array_Id_HrRecordSet;
    }


    /**
     * Gets the sql value for this Cbr_Array_Id_HrBlock.
     * 
     * @return sql
     */
    public java.lang.String getSql() {
        return sql;
    }


    /**
     * Sets the sql value for this Cbr_Array_Id_HrBlock.
     * 
     * @param sql
     */
    public void setSql(java.lang.String sql) {
        this.sql = sql;
    }


    /**
     * Gets the sql_Sentence value for this Cbr_Array_Id_HrBlock.
     * 
     * @return sql_Sentence
     */
    public java.lang.String getSql_Sentence() {
        return sql_Sentence;
    }


    /**
     * Sets the sql_Sentence value for this Cbr_Array_Id_HrBlock.
     * 
     * @param sql_Sentence
     */
    public void setSql_Sentence(java.lang.String sql_Sentence) {
        this.sql_Sentence = sql_Sentence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cbr_Array_Id_HrBlock)) return false;
        Cbr_Array_Id_HrBlock other = (Cbr_Array_Id_HrBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cbr_Array_Id_HrRecordSet==null && other.getCbr_Array_Id_HrRecordSet()==null) || 
             (this.cbr_Array_Id_HrRecordSet!=null &&
              java.util.Arrays.equals(this.cbr_Array_Id_HrRecordSet, other.getCbr_Array_Id_HrRecordSet()))) &&
            ((this.sql==null && other.getSql()==null) || 
             (this.sql!=null &&
              this.sql.equals(other.getSql()))) &&
            ((this.sql_Sentence==null && other.getSql_Sentence()==null) || 
             (this.sql_Sentence!=null &&
              this.sql_Sentence.equals(other.getSql_Sentence())));
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
        if (getCbr_Array_Id_HrRecordSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCbr_Array_Id_HrRecordSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCbr_Array_Id_HrRecordSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSql() != null) {
            _hashCode += getSql().hashCode();
        }
        if (getSql_Sentence() != null) {
            _hashCode += getSql_Sentence().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cbr_Array_Id_HrBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Array_Id_HrBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbr_Array_Id_HrRecordSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cbr_Array_Id_HrRecordSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Array_Id_HrRecord"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sql");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sql"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sql_Sentence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sql_Sentence"));
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
