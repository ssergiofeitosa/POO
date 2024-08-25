package main.java.br.edu.univasf.projetomodelo.model;
import java.util.Date;

public class Estudante {
	private String escolaridade;
	private String matricula;
	private boolean matriculado;
	private boolean cotista;
	
	public Estudante(String escolaridade, String matricula, boolean matriculado, boolean cotista) {
		super();
		this.escolaridade = escolaridade;
		this.matricula = matricula;
		this.matriculado = matriculado;
		this.cotista = cotista;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isMatriculado() {
		return matriculado;
	}

	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}

	public boolean isCotista() {
		return cotista;
	}

	public void setCotista(boolean cotista) {
		this.cotista = cotista;
	}
}