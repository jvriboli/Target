package br.com.tt;

public class TesteIf_4 {

	public static void main(String[] args) {
		Integer idade = 71;
		if (idade < 0) {
			System.out.println("Idade Inv�lida");
		} else if ((idade >= 16 & idade <= 17) || idade <= 70) {
			System.out.println("Voto Facultativo");
		} else if (idade < 16) {
			System.out.println("N�o pode Votar");
		} else {
			System.out.println("Voto Obrigat�rio");
		}
	}
}