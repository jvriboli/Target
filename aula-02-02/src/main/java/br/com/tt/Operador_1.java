package br.com.tt;

public class Operador_1 {
	public static void main(String[] args) {
		System.out.println("Operadores");
		System.out.println("Soma " + 1 + 5);
		System.out.println("Soma " + (1 + 5));
		Long soma = 1L + 5L;
		System.out.println(soma);

		// Primeiro atribui e depois incrementa
		Long incremento = soma++;
		System.out.println("Incremento " + incremento);
		System.out.println("Incremento " + soma);

		// Primeiro incrementa e depois atribui
		System.out.println("Pre Incremento");
		Long pre = 3L;
		System.out.println("Pre " + ++pre);
	}
}
