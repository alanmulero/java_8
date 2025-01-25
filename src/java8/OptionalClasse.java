package java8;

public class OptionalClasse {
	
	private String marca;
	private int ano;

	public OptionalClasse(String nome, int alunos) {
		this.marca = nome;
		this.ano = alunos;
	}

	public String getMarca() {
		return marca;
	}

	public int getAno() {
		return ano;

	}

	@Override
	public String toString() {
		return "Curso [Marca: " + marca + ", Ano: " + ano + "]";
	}

}
