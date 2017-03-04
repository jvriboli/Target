package br.com.tt;

import javax.swing.JOptionPane;

public class Sistema {

	public static void main(String[] args) {
		String nome = null;
		String strIdade = null;
		String msgIdade = null;
		Integer idade = null;
		// \t cria tabulacao
		// para realizar o print da barra utilizar \\
		System.out.println("\n\n\n\t\\Iniciando o sistema\\");

		nome = JOptionPane.showInputDialog("Digite o Nome:");
		strIdade = JOptionPane.showInputDialog("Digite a idade:");
		idade = Integer.valueOf(strIdade);

		JOptionPane.showMessageDialog(null, nome.toUpperCase());

		if (idade >= 18) {
			msgIdade = "Maior de idade";
			System.out.println("Maior de idade");
		} else {
			msgIdade = "Menor de idade";
			System.out.println("Menor de idade");
		}
		JOptionPane.showMessageDialog(null, msgIdade);

		System.out.println(nome);

	}

}
