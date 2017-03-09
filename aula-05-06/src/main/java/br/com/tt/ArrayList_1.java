package br.com.tt;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_1 {
	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();
		nomes.add("Camila");
		nomes.add("Pedro");
		nomes.add("Luis");
		nomes.add("Carla");

		System.out.println(nomes);
		System.out.println("size: " + nomes.size());
		System.out.println("remove(0)");
		nomes.remove(0);
		System.out.println("size " + nomes.size());
		System.out.println("isEmpty " + nomes.isEmpty());
		System.out.println(nomes);

		List<String> clientes = new ArrayList<>();
		clientes.add("Juca");
		clientes.add("Marcelo");
		clientes.add("Rafael");

		List<String> cadastrados = new ArrayList<>();
		cadastrados.add("Manuela");
		cadastrados.addAll(nomes);
		cadastrados.addAll(clientes);
		System.out.println(cadastrados.size());
		System.out.println(cadastrados);

		for (String c : cadastrados) {
			System.out.println("\t - " + c);
		}
	}
}
