package principais;

public abstract class Imovel implements tela.Construcao{
	String endereço;
	Double preco;
	String tipo;// tipo de imóvel

	public abstract String tipoConstrucao();
	
	public abstract Integer countNumComodos();

	public Imovel(String endereço, Double preco, String tipo) { //Construtor
		super();
		this.endereço = endereço;
		this.preco = preco;
		this.tipo = tipo;
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
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
