package ws;

import java.util.List;

import javax.jws.WebService;

import dao.ProdutoDAO;
import entities.Produto;

@WebService (endpointInterface="ws.ProdutoWS")
public class ProdutoWSImpl implements ProdutoWS {

	private ProdutoDAO produtoDAO = new ProdutoDAO();
	
	@Override
	public Produto find() {
		return this.produtoDAO.find() ;
	}

	@Override
	public List<Produto> findAll() {
        return this.produtoDAO.findAll();
	}

	
}
