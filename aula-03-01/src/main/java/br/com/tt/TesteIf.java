package br.com.tt;

public class TesteIf {
	public static void main(String[] args) {
		
		Double saldo = 5D;
		Double divida = 15D;
		
		if ((saldo - divida) == 0) {
			System.out.println("Saldo Zerado");
		} else if((saldo - divida) < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Saldo Positivo");
		}
	}

}