package principais;

public abstract class Imovel implements tela.Construcao{
	String endereço;
	Double preco;
	
	public abstract String tipoConstrucao();
	
	public abstract Integer countNumComodos();

	public Imovel(String endereço, Double preco) { //Construtor
		super();
		this.endereço = endereço;
		this.preco = preco;
	}

	//GET E SET
	
	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
}
