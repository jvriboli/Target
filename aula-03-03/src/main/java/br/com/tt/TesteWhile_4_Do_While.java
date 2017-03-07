package br.com.tt;

import javax.swing.JOptionPane;

public class TesteWhile_4_Do_While {
	public static void main(String[] args) {

		String nome = "Iniciando o Sistema";
		do {
			System.out.println(nome);
			nome = "Nome: "+ JOptionPane.showInputDialog("Nome: ");
		} while (!nome.endsWith("sair"));

		System.out.println("Fim do programa");
	}

}
