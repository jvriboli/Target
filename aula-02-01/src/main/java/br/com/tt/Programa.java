package br.com.tt;

public class Programa {

	public static void main(String[] args) {
		Cliente c1 = null;
		Cliente c2;

		System.out.println(c1);
		c1 = new Cliente();
		System.out.println(c1);
		System.out.println(c1.nome);
		c1.nome = "Maria";
		System.out.println(c1.nome);
		c1 = null;

		if (c1 != null) {// para evitar o null pointer
			System.out.println(c1.nome);
		}

		c1 = new Cliente();
		c1 = new Cliente();
		c2 = c1;

		c1.nome = "Juca";
		System.out.println(c2.nome);
		c2.nome = "Jose";
		System.out.println(c1.nome);

		System.out.println(c1);
		System.out.println(c2);

	}

}
