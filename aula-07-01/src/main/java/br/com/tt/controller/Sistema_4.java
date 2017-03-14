package br.com.tt.controller;

import java.util.List;

import br.com.tt.dao.FuncionarioDao;
import br.com.tt.model.Funcionario;

public class Sistema_4 {
	public static void main(String[] args) {
		criaFuncionario("Jose");
		criaFuncionario("Maria");
		criaFuncionario("Carlos");
		Funcionario.deletar("Maria");
Funcionario func = Funcionario.consultar("Carlos");
func.setNome("Carlos Santos da Silva");
func.salvar();

		Funcionario.consultar().forEach(f -> System.out.println(f.getNome()));
	}

	private static void alterarFuncionario(String nome) {

	}

	private static void criaFuncionario(String nome) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		funcionario.salvar();
	}
}
