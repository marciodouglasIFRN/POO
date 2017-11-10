package aviao;

public class Assento {
	int fileira;
	int coluna;
	double valor;
	boolean status;
	

	public void marcarAssento() {
		status = true;
		if(coluna>3){
			valor = 100;
		}else{
			valor = 80;
		}
	}
	public void desmarcarAssento() {
		
	}
	public void remarcarAssento() {
		
	}
	public void assentoMarcado() {
		
	}
	public void assentosMarcados() {
		
	}
	public void assentosDisponiveis() {
		
	}
	public void assentoPrimeiraClasse() {
		
	}
	public void assentoClasseNormal() {
		
	}
	public void exibirAssentos() {
		
	}
	public void valorTotal() {
		
	}

}
