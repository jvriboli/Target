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
		
		String ultimo = nome.substring(11);
		System.out.println("Ultimo: "+ultimo);
		
		String primeiro = nome.substring(0, 5);
		System.out.println("Primeiro: "+primeiro);
		
		String data = "08/03/2017";
		String[] split = data.split("/");
		for (String s : split) {
			System.out.println(s);
		}
		
		String novaData = data.replace("/", "-");
		System.out.println(novaData);
		
		
	}
}
