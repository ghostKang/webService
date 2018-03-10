/**
 * ISendToOAServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.weaver.workflow.webservices;

public class ISendToOAServiceLocator extends org.apache.axis.client.Service implements cn.com.weaver.workflow.webservices.ISendToOAService {

    public ISendToOAServiceLocator() {
    }


    public ISendToOAServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ISendToOAServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ISendToOAServiceHttpPort
    private java.lang.String ISendToOAServiceHttpPort_address = "http://192.168.64.101:8011//services/ISendToOAService";

    public java.lang.String getISendToOAServiceHttpPortAddress() {
        return ISendToOAServiceHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ISendToOAServiceHttpPortWSDDServiceName = "ISendToOAServiceHttpPort";

    public java.lang.String getISendToOAServiceHttpPortWSDDServiceName() {
        return ISendToOAServiceHttpPortWSDDServiceName;
    }

    public void setISendToOAServiceHttpPortWSDDServiceName(java.lang.String name) {
        ISendToOAServiceHttpPortWSDDServiceName = name;
    }

    public cn.com.weaver.workflow.webservices.ISendToOAServicePortType getISendToOAServiceHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ISendToOAServiceHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getISendToOAServiceHttpPort(endpoint);
    }

    public cn.com.weaver.workflow.webservices.ISendToOAServicePortType getISendToOAServiceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.com.weaver.workflow.webservices.ISendToOAServiceHttpBindingStub _stub = new cn.com.weaver.workflow.webservices.ISendToOAServiceHttpBindingStub(portAddress, this);
            _stub.setPortName(getISendToOAServiceHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setISendToOAServiceHttpPortEndpointAddress(java.lang.String address) {
        ISendToOAServiceHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.com.weaver.workflow.webservices.ISendToOAServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.com.weaver.workflow.webservices.ISendToOAServiceHttpBindingStub _stub = new cn.com.weaver.workflow.webservices.ISendToOAServiceHttpBindingStub(new java.net.URL(ISendToOAServiceHttpPort_address), this);
                _stub.setPortName(getISendToOAServiceHttpPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ISendToOAServiceHttpPort".equals(inputPortName)) {
            return getISendToOAServiceHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("webservices.workflow.weaver.com.cn", "ISendToOAService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("webservices.workflow.weaver.com.cn", "ISendToOAServiceHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ISendToOAServiceHttpPort".equals(portName)) {
            setISendToOAServiceHttpPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
