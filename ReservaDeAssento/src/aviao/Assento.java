package aviao;

public class Assento {
	private double valor;
	private boolean status;
	private String posicao;

	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void marcarAssento(String posicao) {
		Aviao aviao = new Aviao();
		if(!status){
			status = true;
			if(aviao.retornaFileira(posicao) < 3){
				valor = 100;
			}else{
				valor = 80;
			}

		}else{
			System.out.println("Assento ocupado");
		}
	}
	public void desmarcarAssento() {
		if(status){
			status = false;
			valor = 0;
		}else{
			System.out.println("ATENÇÃO! O Assento Já Se Encontra Vazio");
			desmarcarAssento();
		}
		
	}
	public void remarcarAssento(){
		Aviao aviao = new Aviao();
		desmarcarAssento();
		System.out.println("Digite um assento");
		String entrada = aviao.tratarEntrada();
		marcarAssento(entrada);
	
		
	}



} 
