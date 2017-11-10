package aviao;

import java.util.Scanner;

public class Assento {
	int fileira;
	int coluna;
	double valor;
	boolean status;
	

	public void marcarAssento(int coluna, int fileira) {

		if(!status){
			status = true;
			this.coluna = coluna;
			this.fileira = fileira;
			if(fileira < 3){
				valor = 100;
			}else{
				valor = 80;
			}

		}else{
			System.out.println("Assento ocupado");
		}
	}
	public void desmarcarAssento(int coluna, int fileira) {
		
		if(status){
			status = false;
				valor = 0;
				System.out.println("Assento Liberado com Sucesso");
		}else{
			System.out.println("ATENÇÃO! O Assento Já Se Encontra Vazio");
		}
		
	}
	public void remarcarAssento(int coluna, int fileira) {
		

	}
	public int assentoMarcado() {
		
		return 0;
	}
	public int assentosMarcados() {
		
		return 0;
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
	public boolean valorTotal() {
		
		return true;
	}
	public int retornaColuna(String entrada){
		int coluna = entrada.charAt(0);
		return coluna;
	}
	public int retornaFileira(String entrada){
		int fileira = Integer.parseInt(entrada.substring(1));
		return 0;
	}
	public String tratarEntrada(){
		Scanner leitor = new Scanner(System.in);
		String str = leitor.nextLine();
		str = str.replace(" ", "");
		str = str.toUpperCase();
		return str;
	}

} 
