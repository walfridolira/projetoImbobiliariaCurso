package principais;

import java.util.ArrayList;
import java.util.Scanner;

import tela.Construcao;

public class Imobiliaria {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<String>construcoes = new ArrayList<String>();
	
	void adicionarConstrucao(Construcao construcao){
	
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
	
	void removerConstrucao(Construcao construcao) {
		construcoes.remove(0);
	}
	
	String listarConstrucoes(Construcao construcao) {
		return null;
		
	}

	Double informarArea(Construcao construcao) {
		return null;
		
	}
}
