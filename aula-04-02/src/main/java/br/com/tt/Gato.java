package br.com.tt;

public class Gato extends Animal {

	private Integer idade;
	private String pelo;
	private String raca;

	public Gato(String nome) {
		super(nome);
		System.out.println("Construindo o gato");
	}

	public Gato() {

	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

}
