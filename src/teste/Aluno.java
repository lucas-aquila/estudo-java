package teste;

public class Aluno {
	
	final String nome;
	final Double nota;
	
	public Aluno(String nome, double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public String toString() {
		return nome + " tem nota " + nota;
	}

}
