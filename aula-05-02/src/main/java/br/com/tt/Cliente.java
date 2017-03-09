package br.com.tt;

public class Cliente {

	private String nome;
	private String cpf;
	final private Long id;

	public Cliente(String nome, String cpf, Long id) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}
}
