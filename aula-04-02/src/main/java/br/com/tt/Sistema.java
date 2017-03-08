package br.com.tt;

public class Sistema {
	public static void main(String[] args) {

		Animal animal = new Animal("Toto");
		Animal a1 = new Animal();
		Animal a2 = new Animal("Rex", "Ana");
		Animal a3 = new Animal(14, "Mel", "Luiz");
		
		Gato g1 = new Gato();
		Gato g2 = new Gato("Lua");
	}
}
