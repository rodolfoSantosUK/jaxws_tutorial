/**
 * ProdutoWSImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class ProdutoWSImplServiceLocator extends org.apache.axis.client.Service implements ws.ProdutoWSImplService {

    public ProdutoWSImplServiceLocator() {
    }


    public ProdutoWSImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProdutoWSImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProdutoWSImplPort
    private java.lang.String ProdutoWSImplPort_address = "http://localhost:8066/ws/produto";

    public java.lang.String getProdutoWSImplPortAddress() {
        return ProdutoWSImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProdutoWSImplPortWSDDServiceName = "ProdutoWSImplPort";

    public java.lang.String getProdutoWSImplPortWSDDServiceName() {
        return ProdutoWSImplPortWSDDServiceName;
    }

    public void setProdutoWSImplPortWSDDServiceName(java.lang.String name) {
        ProdutoWSImplPortWSDDServiceName = name;
    }

    public ws.ProdutoWS getProdutoWSImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProdutoWSImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProdutoWSImplPort(endpoint);
    }

    public ws.ProdutoWS getProdutoWSImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.ProdutoWSImplPortBindingStub _stub = new ws.ProdutoWSImplPortBindingStub(portAddress, this);
            _stub.setPortName(getProdutoWSImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProdutoWSImplPortEndpointAddress(java.lang.String address) {
        ProdutoWSImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.ProdutoWS.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.ProdutoWSImplPortBindingStub _stub = new ws.ProdutoWSImplPortBindingStub(new java.net.URL(ProdutoWSImplPort_address), this);
                _stub.setPortName(getProdutoWSImplPortWSDDServiceName());
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
        if ("ProdutoWSImplPort".equals(inputPortName)) {
            return getProdutoWSImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws/", "ProdutoWSImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws/", "ProdutoWSImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProdutoWSImplPort".equals(portName)) {
            setProdutoWSImplPortEndpointAddress(address);
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
