package br.edu.fmf.modelo;

public class Gato {
	
	//atributos
	private String cor;
	private String nome;
	private int idade;

	//métodos
	public Gato(String cor, String nome, int idade){
		this.cor = cor;
		this.nome = nome;
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
