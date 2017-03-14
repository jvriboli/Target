package br.com.tt.controller;

import br.com.tt.dao.ClienteDao;
import br.com.tt.model.Cliente;

public class Sistema_3 {
public static void main(String[] args) {
	// clik no menu novo
	Cliente cliente = new Cliente();
	// preencheu o cadastro
	cliente.setNome("Maria Costa");
	// clic no salvar
	ClienteDao clienteDao = new ClienteDao();
	clienteDao.salvar(cliente);
	
	
}
}
