package principais;

public abstract class Imovel implements tela.Construcao{
	String endere�o;
	Double preco;
	
	public abstract String tipoConstrucao();
	
	public abstract Integer countNumComodos();

	public Imovel(String endere�o, Double preco) { //Construtor
		super();
		this.endere�o = endere�o;
		this.preco = preco;
	}

	//GET E SET
	
	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
}
