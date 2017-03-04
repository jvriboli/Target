package br.com.tt.model;

public class Animal {

	private String nome;
	private String especie;
	private Pessoa dono;

	public void setNome(String nome) {
		if (nome.length() >= 3) {
			this.nome = nome;
		}
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	public String getNome() {
		return nome.toUpperCase();
	}

}
