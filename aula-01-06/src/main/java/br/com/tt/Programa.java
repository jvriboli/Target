package br.com.tt;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		p1.nome = "Maria";
		p1.endereco = "Rua A";
		p1.cpf = "00000000000";
		
		System.out.println(p1.nome+" "+p1.endereco+" "+p1.cpf);
	}

}
