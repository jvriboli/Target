package br.com.tt;

public class Programa {
	public static void main(String[] args) {
		char sexo = 'M';

		char letraA = '\u0061';
		System.out.println("var letraA = " + letraA);

		char letraX = 120;
		System.out.println("var letraX = " + letraX);

		boolean vivo = true;
		Boolean saldo = true;
		// semanticamente melhor
		Boolean aprovado = Boolean.TRUE;

		byte valorBaixo = 127;
		byte valorBaixo1 = -128;

		short valorCusrto = 5245;

		Integer valorInteiro = 128000;
		int valorInteiroPrimitivo = 128000;

		Long valorLongo = 656556545342124L;
		System.out.println(Long.MAX_VALUE);

		Float valorFlutuante = 5258F;
		Double valorDouble = 5258D;

	}
}
