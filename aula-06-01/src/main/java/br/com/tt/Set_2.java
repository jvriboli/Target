package br.com.tt;

import java.util.Set;
import java.util.TreeSet;

public class Set_2 {
	public static void main(String[] args) {
		Set<String> frutas = new TreeSet<>();
		frutas.add("Laranja");
		frutas.add("Uva");
		frutas.add("Maca");
		frutas.add("Banana");
		frutas.add("Maca");
		frutas.add("Uva");
		frutas.add("Banana");
		frutas.add("Laranja");
		System.out.println("Qtd: "+frutas.size());
		for (String f : frutas) {
			System.out.println(f);
		}
	}
}
