package br.com.tt;

import java.util.ArrayList;
import java.util.List;

public class SobreCarga {
	static List<String> nomes = new ArrayList<>();

	public static void main(String[] args) {

		String nome = "";
		nome = pesquisar("Ana");
		System.out.println("Nome: " + nome);
		nome = pesquisar(2);
		System.out.println("Id 2 : " + nome);
		nome = pesquisar('a', 2);
		System.out.println("Letra e ID: " + nome);
		nome = pesquisar(1, 'n');
		System.out.println("ID e Letra: " + nome);
		nome = pesquisar();
		System.out.println("Todos: " + nome);

	}

	private static String pesquisar() {
		return nomes.toString();
	}

	private static String pesquisar(int id, char letra) {
		return pesquisar(letra, id);
	}

	/*
	 * private static List<String> pesquisar(char letra, int id) { List<String>
	 * resultado = new ArrayList<>(); for (String nome : nomes) { if
	 * (nome.charAt(id) == letra){ resultado.add(nome); } } return resultado; }
	 */

	private static String pesquisar(char letra, int id) {
		String resultado = "";
		for (String nome : nomes) {
			if (id >= nome.length()) {
				continue;
			}
			if (nome.charAt(id) == letra) {
				resultado = nome;
				break;
			}
		}
		return resultado;
	}

	private static String pesquisar(int id) {
		return nomes.get(id);
	}

	private static String pesquisar(String pesquisa) {
		String resultado = "";
		for (String nome : nomes) {
			if (nome.toUpperCase().equals(pesquisa.toUpperCase())) {
				resultado = nome;
				break;
			}
		}
		return resultado;
	}

	static {
		nomes.add("Ana");
		nomes.add("Pedro");
		nomes.add("Maria");
		nomes.add("Leo");
	}

}
