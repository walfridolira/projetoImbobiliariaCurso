package principais;

public abstract class Imovel implements tela.Construcao{
	String endereço;
	Double preco;
	
	public abstract String tipoConstrucao();
	
	public abstract Integer countNumComodos();
	
}
