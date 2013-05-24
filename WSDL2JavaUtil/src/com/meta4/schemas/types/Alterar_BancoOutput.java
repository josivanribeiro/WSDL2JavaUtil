/**
 * Alterar_BancoOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas.types;

public class Alterar_BancoOutput  implements java.io.Serializable {
    private com.meta4.schemas.types.Cbr_Ifc_Ws_Vwpessoa_BancoBlock cbr_Ifc_Ws_Vwpessoa_Banco;

    private com.meta4.schemas.types.LogMessage[] logMessage;

    private double _return;

    public Alterar_BancoOutput() {
    }

    public Alterar_BancoOutput(
           com.meta4.schemas.types.Cbr_Ifc_Ws_Vwpessoa_BancoBlock cbr_Ifc_Ws_Vwpessoa_Banco,
           com.meta4.schemas.types.LogMessage[] logMessage,
           double _return) {
           this.cbr_Ifc_Ws_Vwpessoa_Banco = cbr_Ifc_Ws_Vwpessoa_Banco;
           this.logMessage = logMessage;
           this._return = _return;
    }


    /**
     * Gets the cbr_Ifc_Ws_Vwpessoa_Banco value for this Alterar_BancoOutput.
     * 
     * @return cbr_Ifc_Ws_Vwpessoa_Banco
     */
    public com.meta4.schemas.types.Cbr_Ifc_Ws_Vwpessoa_BancoBlock getCbr_Ifc_Ws_Vwpessoa_Banco() {
        return cbr_Ifc_Ws_Vwpessoa_Banco;
    }


    /**
     * Sets the cbr_Ifc_Ws_Vwpessoa_Banco value for this Alterar_BancoOutput.
     * 
     * @param cbr_Ifc_Ws_Vwpessoa_Banco
     */
    public void setCbr_Ifc_Ws_Vwpessoa_Banco(com.meta4.schemas.types.Cbr_Ifc_Ws_Vwpessoa_BancoBlock cbr_Ifc_Ws_Vwpessoa_Banco) {
        this.cbr_Ifc_Ws_Vwpessoa_Banco = cbr_Ifc_Ws_Vwpessoa_Banco;
    }


    /**
     * Gets the logMessage value for this Alterar_BancoOutput.
     * 
     * @return logMessage
     */
    public com.meta4.schemas.types.LogMessage[] getLogMessage() {
        return logMessage;
    }


    /**
     * Sets the logMessage value for this Alterar_BancoOutput.
     * 
     * @param logMessage
     */
    public void setLogMessage(com.meta4.schemas.types.LogMessage[] logMessage) {
        this.logMessage = logMessage;
    }


    /**
     * Gets the _return value for this Alterar_BancoOutput.
     * 
     * @return _return
     */
    public double get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this Alterar_BancoOutput.
     * 
     * @param _return
     */
    public void set_return(double _return) {
        this._return = _return;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Alterar_BancoOutput)) return false;
        Alterar_BancoOutput other = (Alterar_BancoOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cbr_Ifc_Ws_Vwpessoa_Banco==null && other.getCbr_Ifc_Ws_Vwpessoa_Banco()==null) || 
             (this.cbr_Ifc_Ws_Vwpessoa_Banco!=null &&
              this.cbr_Ifc_Ws_Vwpessoa_Banco.equals(other.getCbr_Ifc_Ws_Vwpessoa_Banco()))) &&
            ((this.logMessage==null && other.getLogMessage()==null) || 
             (this.logMessage!=null &&
              java.util.Arrays.equals(this.logMessage, other.getLogMessage()))) &&
            this._return == other.get_return();
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
        if (getCbr_Ifc_Ws_Vwpessoa_Banco() != null) {
            _hashCode += getCbr_Ifc_Ws_Vwpessoa_Banco().hashCode();
        }
        if (getLogMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(get_return()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Alterar_BancoOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Alterar_BancoOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbr_Ifc_Ws_Vwpessoa_Banco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cbr_Ifc_Ws_Vwpessoa_Banco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_Vwpessoa_BancoBlock"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "LogMessage"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_return");
        elemField.setXmlName(new javax.xml.namespace.QName("", "return"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
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
