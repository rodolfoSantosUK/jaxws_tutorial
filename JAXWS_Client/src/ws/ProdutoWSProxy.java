package ws;

public class ProdutoWSProxy implements ws.ProdutoWS {
  private String _endpoint = null;
  private ws.ProdutoWS produtoWS = null;
  
  public ProdutoWSProxy() {
    _initProdutoWSProxy();
  }
  
  public ProdutoWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initProdutoWSProxy();
  }
  
  private void _initProdutoWSProxy() {
    try {
      produtoWS = (new ws.ProdutoWSImplServiceLocator()).getProdutoWSImplPort();
      if (produtoWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)produtoWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)produtoWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (produtoWS != null)
      ((javax.xml.rpc.Stub)produtoWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.ProdutoWS getProdutoWS() {
    if (produtoWS == null)
      _initProdutoWSProxy();
    return produtoWS;
  }
  
  public ws.Produto find() throws java.rmi.RemoteException{
    if (produtoWS == null)
      _initProdutoWSProxy();
    return produtoWS.find();
  }
  
  public ws.Produto[] findAll() throws java.rmi.RemoteException{
    if (produtoWS == null)
      _initProdutoWSProxy();
    return produtoWS.findAll();
  }
  
  
}