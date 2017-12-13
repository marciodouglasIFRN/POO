package aviao;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args){
		
		menu();
		
	}
	
	public static void menu(){
		Aviao aviao = new Aviao();
		Assento[][] assento = new Assento[30][6];
		for(int i =0; i<assento.length;i++){
			for (int j = 0; j < assento[i].length; j++) {
				assento[i][j] = new Assento();
			}
		}
		boolean sair = true;
		int opcao;
		Scanner leitor = new Scanner(System.in);
		String entrada;
		while(sair){
			System.out.println("_____________________________________");
			System.out.println("|     Escolha uma opção abaixo!      |");
			System.out.println("|Resevar Assento ----------------- 1 |");
			System.out.println("|Cancelar Assento ---------------- 2 |");
			System.out.println("|Remarcar Assento ---------------- 3 |");
			System.out.println("|Relatorios ---------------------- 4 |");
			System.out.println("|Fechar Programa ----------------- 5 |");
			System.out.println("|____________________________________|");
			
			opcao = leitor.nextInt();
			switch (opcao) {
			case 1:
				while(true){
					System.out.println("Digite um assento");
					entrada = aviao.tratarEntrada();
					int coluna = aviao.retornaColuna(entrada);
					int fileira = aviao.retornaFileira(entrada);
					assento[fileira][coluna].marcarAssento(entrada);
					int s = 0;
					if(s==0){
						break;
					}

				}
				
				break;
			case 2:
				System.out.println("Digite o Assento que Deseja Cancelar");
				entrada = aviao.tratarEntrada();
				assento[aviao.retornaColuna(entrada)][aviao.retornaFileira(entrada)].desmarcarAssento();
				break;
			case 3:

				System.out.println("Digite um assento");
				entrada = aviao.tratarEntrada();
				int coluna = aviao.retornaColuna(entrada);
				int fileira = aviao.retornaFileira(entrada);
				assento[fileira][coluna].remarcarAssento();
				break;
			case 4:
				aviao.relatorio(assento);
				break;
			case 5:
				System.out.println("Fim de execução...");
				sair = false;
				break;
			default:
				break;
			}
		}
		
	}
	
}
