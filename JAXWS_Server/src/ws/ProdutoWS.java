package ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import entities.Produto;

@WebService
public interface ProdutoWS {

	@WebMethod
	public Produto find();
	
	@WebMethod
	public List<Produto> findAll();
	
}
