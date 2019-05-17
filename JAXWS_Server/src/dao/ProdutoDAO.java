package dao;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class ProdutoDAO {

	
	public Produto find() {
		return new Produto(1L,"Produto 1", 100L);
	}
	
	
	public List<Produto> findAll() {
		
		List<Produto> result = new ArrayList<Produto>();
		result.add(new Produto(1L,"Produto 1", 100L));
		result.add(new Produto(2L,"Produto 2", 200L));
		result.add(new Produto(3L,"Produto 3", 300L));
		return result;
	}
 	
}
