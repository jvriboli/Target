package br.com.tt;

public class Sistema {
	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.setNome("Toto");

		Animal a2 = new Animal();
		a2.setNome("Rex");

		System.out.println(a1.getNome());
		System.out.println(a2.getNome());
		System.out.println(Animal.getNome());

	}
}
