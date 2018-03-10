package cn.com.weaver.workflow.webservices;

public class ISendToOAServicePortTypeProxy implements cn.com.weaver.workflow.webservices.ISendToOAServicePortType {
  private String _endpoint = null;
  private cn.com.weaver.workflow.webservices.ISendToOAServicePortType iSendToOAServicePortType = null;
  
  public ISendToOAServicePortTypeProxy() {
    _initISendToOAServicePortTypeProxy();
  }
  
  public ISendToOAServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initISendToOAServicePortTypeProxy();
  }
  
  private void _initISendToOAServicePortTypeProxy() {
    try {
      iSendToOAServicePortType = (new cn.com.weaver.workflow.webservices.ISendToOAServiceLocator()).getISendToOAServiceHttpPort();
      if (iSendToOAServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iSendToOAServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iSendToOAServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iSendToOAServicePortType != null)
      ((javax.xml.rpc.Stub)iSendToOAServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.com.weaver.workflow.webservices.ISendToOAServicePortType getISendToOAServicePortType() {
    if (iSendToOAServicePortType == null)
      _initISendToOAServicePortTypeProxy();
    return iSendToOAServicePortType;
  }
  
  public void submitKyjflwfbx(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5, java.lang.String in6, java.lang.String in7, java.lang.String in8) throws java.rmi.RemoteException{
    if (iSendToOAServicePortType == null)
      _initISendToOAServicePortTypeProxy();
    iSendToOAServicePortType.submitKyjflwfbx(in0, in1, in2, in3, in4, in5, in6, in7, in8);
  }
  
  
}