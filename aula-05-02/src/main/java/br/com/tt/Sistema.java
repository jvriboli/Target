package br.com.tt;

public class Sistema {

	final String teste;

	public Sistema() {
		teste = "a";
	}

	public static void main(String[] args) {
		final double pi = 3.14;
		// pi = 3.50; //nao e possivel pois e final

		final Cliente c1 = new Cliente("Maria", "teste", 1L);

		c1.setNome("Maria");
		c1.setNome("Juca");
		
		//c1 = new Cliente(); //nao e possivel, pois c1 é final
	}
}
