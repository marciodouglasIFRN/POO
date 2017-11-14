package aviao;

import java.util.Scanner;

public class Assento {
	private double valor;
	private boolean status;
	private int quantidade;
	private String posicao;
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
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
		if(!status){
			status = true;
			this.posicao = posicao;
			if(Principal.retornaFileira(posicao) < 3){
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
				System.out.println("Assento Cancelado com Sucesso");
		}else{
			System.out.println("ATENÇÃO! O Assento Já Se Encontra Vazio");
		}
		
	}



} 
