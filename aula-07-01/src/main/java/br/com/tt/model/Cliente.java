package br.com.tt.model;

import java.util.List;

public class Cliente extends Pessoa {

	private Double saldo;
	private Boolean ativo = Boolean.TRUE;
	private List<String> cursos;

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public List<String> getCursos() {
		return cursos;
	}

	public void setCursos(List<String> cursos) {
		this.cursos = cursos;
	}

	@Override
	public void gerarCodigo() {
		this.codigo = "CLIENTE_" + getId();

	}

}
