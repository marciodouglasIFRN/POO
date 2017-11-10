package aviao;

import java.util.Scanner;

public class Principal {

	public static void main(){
		int opcao;
		Scanner leitor = new Scanner(System.in);
		String entrada;
		Assento assento = new Assento();
		int fileira;
		int coluna;
		while(true){
			opcao = leitor.nextInt();
			switch (opcao) {
			case 1:
				
				entrada = assento.tratarEntrada();
				fileira = assento.retornaFileira(entrada);
				coluna = assento.retornaColuna(entrada);
				assento.marcarAssento(coluna, fileira);
				
				break;

			default:
				break;
			}
		}
		
	}

}
