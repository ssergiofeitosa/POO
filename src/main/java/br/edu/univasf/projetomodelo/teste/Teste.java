package main.java.br.edu.univasf.projetomodelo.teste;
import java.util.Date;
import main.java.br.edu.univasf.projetomodelo.model.Endereco;
import main.java.br.edu.univasf.projetomodelo.model.Estudante;
import main.java.br.edu.univasf.projetomodelo.model.Pessoa;

public class Teste {
	public static void main (String[] args) {
		java.util.Date data = new java.util.Date();
		//System.out.println(data.toString());
		
		Pessoa pessoa1 = new Pessoa ("Nome", "0912031", data, 10, 'm', new Endereco());
		pessoa1.setNome("Aluno de Sobrenome");
		pessoa1.getCPF("123.456.789-00");
		pessoa1.setGenero('m');
		pessoa1.setIdade(10);
		pessoa1.setNascimento(data);
		System.out.println (pessoa1.toString());
	}
}