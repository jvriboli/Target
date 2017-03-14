package br.com.tt.dao;

import java.util.List;

import br.com.tt.fake.BancoDadosFake;
import br.com.tt.model.Cliente;

public class ClienteDao implements Dao<Cliente>{

	@Override
	public void salvar(Cliente cliente) {
	System.out.println("Salvando Cliente");	
	BancoDadosFake.clientes.add(cliente);
	}

	@Override
	public Cliente buscar(Long id) {
		return null;
	}

	@Override
	public Cliente buscar(Cliente t) {
		return null;
	}

	@Override
	public List<Cliente> consultar() {
		return null;
	}

	@Override
	public List<Cliente> consultar(Cliente t) {
		return null;
	}

	@Override
	public List<Cliente> consultar(List<Cliente> lista) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(Cliente t) {
		// TODO Auto-generated method stub
		
	}

}
