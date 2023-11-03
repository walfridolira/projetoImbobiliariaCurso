package principais;

import geral.Predio;

public class Main {

	public static void main(String[] args) {
		Imovel arpoador = new Predio("Rua la de casa", 40000.0, "predio");
		
		System.out.println(arpoador.endereço);

	}

}
