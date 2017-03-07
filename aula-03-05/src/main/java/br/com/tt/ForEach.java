package br.com.tt;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {

		List<String> nomes = new ArrayList<String>();
		nomes.add("Maria");
		nomes.add("Lucas");
		nomes.add("Pedro");

		for (String nome : nomes) {
			System.out.println(nome + " " + nome.length()+ " Letras");
		}
	}
}
