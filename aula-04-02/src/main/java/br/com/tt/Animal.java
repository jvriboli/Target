package br.com.tt;

public class Animal {

	private Integer id;
	private String nome;
	private String dono;
	
	public static Integer qtd = 0;

	public Animal(String nome) {
		setNome(nome);
		System.out.println("Construindo com o nome");
		qtd++;
	}

	public Animal(String dono, String nome) {
		this(nome);
		setDono(dono);
	}

	public Animal(Integer id, String nome, String dono) {
		this(nome, dono);
		this.id = id;
	}

	public Animal() {
		qtd++;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

}
