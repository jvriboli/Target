package br.com.tt;

public class Operador_2 {
	public static void main(String[] args) {

		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();

		if (c1 == c2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}

		System.out.println(c1.equals(c2));

		System.out.println(true & true);

		int val = 1;
		System.out.println(val == val & val == val++);
		System.out.println(val);

		System.out.println(val == val && val == val++);
		System.out.println(val);

		System.out.println(val == 1 && val == val++); // and
		System.out.println(val);

		System.out.println(val == 1 || val == val++); // or
		System.out.println(val);

		String result = true ? "Sim" : "N�o"; // ternario
		System.out.println(result);

		int valor = 5;

		valor += 3;
		// valor = valor + 3;
		System.out.println("Valor: " + valor);
	}
}
