package principais;

public abstract class Imovel implements tela.Construcao{
	String enderešo;
	Double preco;
	
	public abstract String tipoConstrucao();
	
	public abstract Integer countNumComodos();

	public Imovel(String enderešo, Double preco) { //Construtor
		super();
		this.enderešo = enderešo;
		this.preco = preco;
	}

	//GET E SET
	
	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
}
