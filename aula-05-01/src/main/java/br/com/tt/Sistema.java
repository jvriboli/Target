package br.com.tt;

public class Sistema {
	public static void main(String[] args) {
		comprar(50D, "Pedro", "Arroz", "Carne", "x");
	}

	private static void comprar(double valor, String nome, String... produtos) {
		System.out.println("Nome: " + nome);
		System.out.println("Valor: " + valor);
		for (String p : produtos) {
			System.out.println("\t - " + p);
		}
	}
}
