package principais;

public abstract class Imovel implements tela.Construcao{
	String endere�o;
	Double preco;
	
	public abstract String tipoConstrucao();
	
	public abstract Integer countNumComodos();
	
}
