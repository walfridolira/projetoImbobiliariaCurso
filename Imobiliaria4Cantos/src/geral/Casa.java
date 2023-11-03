package geral;

import java.util.ArrayList;
import java.util.Scanner;

import principais.Imovel;
import tela.Construcao;

public class Casa extends Imovel {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<String>casa = new ArrayList<String>();
	
	 //Construtor
	public Casa(String endereço, Double preco, String tipo) {
		super(endereço, preco, tipo);
		
	}

	@Override
	public String tipoConstrucao() {
		
		return null;
	}

	@Override
	public Integer countNumComodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adicionarConstrucao(Construcao construcao) {
		
		
	}

	@Override
	public void removerConstrucao(Construcao construcao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void informarArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarConstrucoes() {
		// TODO Auto-generated method stub
		
	}

}
