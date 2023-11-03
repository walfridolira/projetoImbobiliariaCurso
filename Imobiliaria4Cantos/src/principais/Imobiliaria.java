package principais;

import java.util.ArrayList;
import java.util.Scanner;

import tela.Construcao;

public class Imobiliaria extends Imovel{
	
	public Imobiliaria(String endereço, Double preco) {
		super(endereço, preco);
	}

	Scanner scan = new Scanner(System.in);
	ArrayList<String>construcoes = new ArrayList<String>();
	
	
	
	// metodos da interface
@Override	
	public void adicionarConstrucao(Construcao construcao){
	
		System.out.println("Informe o tipo de construção que deseja inserir(1 - Casa; 2 - Prédio; 3 - Loja; 0 - ): ");
		int tipo = scan.nextInt();
		for (int i=tipo; i!=0;) {
		
			switch (tipo) {
			case 0: 
			break;
		
			case 1 :
				construcoes.add(scan.nextLine());
			break;
			
			case 2: 
				construcoes.add(scan.nextLine());
			break;
			
			case 3:
				construcoes.add(scan.nextLine());
			break;
		
			default:
				System.out.println("Informe 1 para adicionar uma Casa"
						+ "\n2 para adicionar um Prédio"
						+ "\n3 para adicionar uma Loja"
						+ "\n0 para sair");
		}
			}
		
		
	}

	@Override
	public void removerConstrucao(Construcao construcao) {
		construcoes.remove(0);
	}
	
	@Override
	public void listarConstrucoes() {
		
	}
	
	@Override
	public void informarArea() {
		
	}

	@Override
	public String tipoConstrucao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer countNumComodos() {
		// TODO Auto-generated method stub
		return null;
	}
}
