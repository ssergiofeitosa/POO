package main.java.br.edu.univasf.projetomodelo.model;
import java.util.Date;

public class Pessoa {
	private String nome;
	private String CPF;
	private Date nascimento;
	private int idade;
	private char genero;
	private Endereco endereco;
	
	public String toString () {
		return "Nome: " + this.nome + "\nCPF: " + this.CPF + "\nGênero: " + this.genero + "\nIdade: " + this.idade;
	}
	
	public Pessoa(String nome, String CPF, Date nascimento, int idade, char genero, Endereco endereco) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.nascimento = nascimento;
		this.idade = idade;
		this.genero = genero;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}