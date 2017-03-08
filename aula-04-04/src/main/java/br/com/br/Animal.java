package br.com.br;

public class Animal {

	public Animal() {
		System.out.println("Passando no Construtor");
	}

	static {
		System.out.println("Bloco statico");
	}

	{
		System.out.println("Passando no bloco");
	}
}
