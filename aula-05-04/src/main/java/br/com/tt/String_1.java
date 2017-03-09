package br.com.tt;

public class String_1 {
	public static void main(String[] args) {
		String nome = "Maria Silva Costa";
		System.out.println(nome);
		nome = nome.toUpperCase();
		System.out.println("TOUPPERCASE " + nome);
		nome = nome.toLowerCase();
		System.out.println("tolowercase " + nome);

		int length = nome.length();
		System.out.println("Comprimento: " + length);

		Boolean inicia = nome.startsWith("maria");
		System.out.println(inicia);

		Boolean finaliza = nome.endsWith("costa");
		System.out.println(finaliza);

		int indexOf = nome.indexOf("i");
		System.out.println("Posicao do i: " + indexOf);
	}
}
