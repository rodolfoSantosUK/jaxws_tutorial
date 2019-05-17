package entities;

public class Produto {

	private Long idProduto;
	
	private String name;
	
	private Long price;

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Produto(Long idProduto, String name, Long price) {
		super();
		this.idProduto = idProduto;
		this.name = name;
		this.price = price;
	}

	public Produto() {
		super();
	}
	
	
	
	
	
	
}
