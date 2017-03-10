package br.com.tt;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapa_3 {
	public static void main(String[] args) {

		Map<Integer, String> nomes = new LinkedHashMap<>();

		nomes.put(1, "Maria");
		nomes.put(2, "Joao");
		// nomes.put(null, "Pedro");
		nomes.put(4, "Pedro");
		nomes.put(4, "Maria");

		System.out.println("Qts: " + nomes.size());

		Set<Entry<Integer, String>> entrySet = nomes.entrySet();

		for (Map.Entry<Integer, String> nome : entrySet) {
			Integer key = nome.getKey();
			String value = nome.getValue();
			System.out.println(key + " " + value);
		}

		System.out.println("Java 8");
		nomes.forEach((key, value) -> System.out.println(key + "-" + value));
	}
}
