package br.com.tt;

import javax.swing.JOptionPane;

public class TesteWhile_2 {
	public static void main(String[] args) {

		String nome = "";
		while (!nome.equalsIgnoreCase("Sair")) {
			nome = JOptionPane.showInputDialog("Nome");
			if (!nome.equalsIgnoreCase("Sair")) {
				System.out.println(nome);
			}
		}
		System.out.println("Fim do sistema");
	}
}
