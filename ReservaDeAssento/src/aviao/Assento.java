package aviao;

public class Assento {
	int fileira;
	int coluna;
	double valor;
	boolean status;
	

	public void marcarAssento(int coluna, int fileira) {

		if(!status){
			status = true;
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

} 
