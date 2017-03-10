package br.com.tt.controller;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

import br.com.tt.exception.ClienteException;
import br.com.tt.model.Cliente;
import br.com.tt.validate.ClienteValidate;

public class Sistema {
	public static void main(String[] args) {

		Set<Cliente> clientes = new HashSet<>();
		String nome = "";

		do {
			nome = JOptionPane.showInputDialog("Nome: ");
			if (!nome.equalsIgnoreCase("sair")) {
				try {
					Cliente cliente = new Cliente(nome);
					new ClienteValidate().nome(cliente);
					clientes.add(cliente);
				} catch (ClienteException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Falha no sistema");
				}
			}
		} while (!nome.equalsIgnoreCase("sair"));
		clientes.forEach(c -> System.out.println(c));
	}
}
