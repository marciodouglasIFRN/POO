package aviao;

import java.util.Scanner;

public class Aviao {
	private Assento[][] assento;
	public static void relatorio(Assento[][] assento){
		int opcao;
		boolean sair=true;
		while(sair){
			Scanner leitor = new Scanner(System.in);
			System.out.println("_____________________________________");
			System.out.println("|     Escolha uma opção abaixo!      |");
			System.out.println("|Total de Assentos Ocupados ------ 1 |");
			System.out.println("|Total de Assentos Vazios -------- 2 |");
			System.out.println("|Reservas da Primeira Classe ----- 3 |");
			System.out.println("|Reservas da Classe Normal ------- 4 |");
			System.out.println("|Mostrar Tabela  ----------------- 5 |");
			System.out.println("|Somatório ----------------------- 6 |");
			System.out.println("|Sair do Menu -------------------- 7 |");
			System.out.println("|____________________________________|");
			opcao = leitor.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Assentos marcados "+ assentosMarcados(assento));
				break;
			case 2:
				System.out.println("Assentos Disponiveis "+ assentosDisponiveis(assento));
				break;
			case 3:
				System.out.println("Revervados Primeira Classe "+ assentoPrimeiraClasse(assento));
				break;
			case 4:
				System.out.println("Revervados Classe Normal "+ assentoClasseNormal(assento));
				break;
			case 5:
				exibirAssentos(assento);
				break;
			case 6:
				System.out.println("Total "+valorTotal(assento));
				break;
			case 7:
				sair = false;
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
	public int assentoMarcado() {
		
		return 0;
	}
	public static int assentosMarcados(Assento[][] assento) {
		int cont=0;
		for(int i = 0; i < assento.length;i++){
			for (int j = 0; j < assento[i].length; j++) {
				if(assento[i][j].isStatus()){
					cont++;
				}
			}
		}
		
		return cont;
	}
	public static int assentosDisponiveis(Assento[][] assento) {
		int cont=0;
		for(int i = 0; i < assento.length;i++){
			for (int j = 0; j < assento[i].length; j++) {
				if(!assento[i][j].isStatus()){
					cont++;
				}
			}
		}
		
		return cont;
	}
	public static int assentoPrimeiraClasse(Assento[][] assento) {
		int cont=0;
		for(int i = 0; i < assento.length;i++){
			for (int j = 0; j < assento[i].length; j++) {
				if(assento[i][j].getValor()==100){
					cont++;
				}
			}
		}
		
		return cont;
	}
	public static int assentoClasseNormal(Assento[][] assento) {
		int cont=0;
		for(int i = 0; i < assento.length;i++){
			for (int j = 0; j < assento[i].length; j++) {
				if(assento[i][j].getValor()==80){
					cont++;
				}
			}
		}
		
		return cont;
	}
	public static void exibirAssentos(Assento[][] assento) {
		
		for (int i = 0; i < assento.length; i++) {
			for (int j = 0; j < assento[i].length; j++) {
				if(assento[i][j].isStatus()) {
					if(i < 9){
		                 System.out.printf("%c0%d Ocupado    ",(j+65),(i+1));  
	                }else{
	                	 System.out.printf("%c%d Ocupado    ",(j+65),(i+1));
	                }          
					
				} else {
					if(i < 9){
						System.out.printf("%c0%d            ",(j+65),(i+1));
	                }else{
	                	System.out.printf("%c%d            ",(j+65),(i+1));
	                }          
						
				}              
	         }
            System.out.println();
		}	
	
				
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
