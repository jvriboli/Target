package br.com.tt;

import java.util.Random;

public class TesteFor_3 {
	public static void main(String[] args) {

		Random gerador = new Random();
		Integer limite = gerador.nextInt(100);

		System.out.println("Limite = " + limite);
		for (int i = 0; i <= limite; i++) {
			System.out.println(i);
		}

	}

}
