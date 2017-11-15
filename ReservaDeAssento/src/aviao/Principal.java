package aviao;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args){
		Assento[][] assento = new Assento[6][30];
		for(int i =0; i<6;i++){
			for (int j = 0; j < assento[i].length; j++) {
				assento[i][j] = new Assento();
			}
		}
		menu(assento);
		
	}
	public static void menu(Assento[][] assento){
		boolean sair = true;
		int opcao;
		Scanner leitor = new Scanner(System.in);
		String entrada;
		while(sair){
			System.out.println("_____________________________________");
			System.out.println("|     Escolha uma op��o abaixo!      |");
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
					entrada = tratarEntrada();
					int coluna = retornaColuna(entrada);
					int fileira = retornaFileira(entrada);
					assento[coluna][fileira].marcarAssento(entrada);
					int s = 0;
					if(s==0){
						break;
					}

				}
				
				break;
			case 2:
				System.out.println("Digite o Assento que Deseja Cancelar");
				entrada = tratarEntrada();
				assento[retornaColuna(entrada)][retornaFileira(entrada)].desmarcarAssento();
				break;
			case 3:
				System.out.println("Assentos marcados "+ assentosMarcados(assento));
				break;
			case 4:
				System.out.println("Total "+valorTotal(assento));
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

	public static int retornaColuna(String entrada){
		int coluna = entrada.charAt(0)-65;
		return coluna;
	}
	public static int retornaFileira(String entrada){
		int fileira = Integer.parseInt(entrada.substring(1))-1;
		return fileira;
	}
	public static String tratarEntrada(){
		Scanner leitor = new Scanner(System.in);
		String str = leitor.nextLine();
		str = str.replace(" ", "");
		str = str.toUpperCase();
		return str;
	}
	public void remarcarAssento(int coluna, int fileira) {
		
		
		

	}
	public int assentoMarcado() {
		
		return 0;
	}
	public static int assentosMarcados(Assento[][] assento) {
		int cont=0;
		for(int i =0; i < assento.length;i++){
			for (int j = 0; j < assento[i].length; j++) {
				if(assento[i][j].isStatus()){
					cont++;
				}
			}
		}
		
		return cont;
	}
	public int assentosDisponiveis() {
		
		return 0;
	}
	public int assentoPrimeiraClasse() {
		
		return 0;
	}
	public int assentoClasseNormal() {
		
		return 0;
	}
	public void exibirAssentos() {

		
				
	}
	public static double valorTotal(Assento[][] assento) {
		double total=0;
		for(int i =0; i < assento.length;i++){
			for (int j = 0; j < assento[i].length; j++) {
				if(assento[i][j].isStatus()){
					total+=assento[i][j].getValor();
				}
			}
		}
		return total;
	}

}
