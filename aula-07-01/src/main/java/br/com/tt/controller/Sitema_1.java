package br.com.tt.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.tt.model.Cliente;
import br.com.tt.model.Funcionario;
import br.com.tt.model.Pessoa;

public class Sitema_1 {
	public static void main(String[] args) {
		// new Pessoa(); nao e possivel instanciar, pois e uma classe abstrata

		List<Pessoa> pessoas = new ArrayList<>();

		pessoas.add(new Cliente());
		pessoas.add(new Funcionario());

	}
}
