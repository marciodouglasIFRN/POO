package aviao;

import java.util.Scanner;

public class Principal {

	public static void main(){
		
	}
	public String tratarEntrada(){
		Scanner leitor = new Scanner(System.in);
		String str = leitor.nextLine();
		str = str.replace(" ", "");
		str = str.toUpperCase();
		return str;
	}
	

}
